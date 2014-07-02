package chat;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ChatServer implements Runnable {

	List<ChatClient> members = new LinkedList<>();
	BlockingQueue<String> messages = new LinkedBlockingQueue<>();
	
	public void addClient(ChatClient client) {
		client.setServer(this);
		messages.add(" here comes " + client.getName());
		members.add(client);
	}
	
	public void removeClient(ChatClient client) {
		members.remove(client);
		messages.add(client.getName() + " has left the chat");
	}
	
	private void broadcast(final String message) {
		for (final ChatClient client : members) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					client.sendMessage(message);
				}
			}).start();
		}
	}

	public void process(String message, ChatClient sender) {
		String broadcastMessage = sender == null? message :
			sender.getName() + " > " + message;
		messages.add(broadcastMessage);
	}

	@Override
	public void run() {
		while (true) {
			String message;
			try {
				message = messages.take();
				broadcast(message);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
