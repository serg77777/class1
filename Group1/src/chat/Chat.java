package chat;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lesson140528.Utils;

public class Chat {

	static final String[] phrases = { "yo", "okay!", "shut up!", "haha",
			"oh, really?", "yes", "no" };

	static class ClientImitator implements Runnable {

		private ChatClient _client;

		public ClientImitator(ChatClient client) {
			_client = client;
		}
		
		@Override
		public void run() {
			Random random = new Random();
			while (true) {
				Utils.pause(5000 + random.nextInt(10000));
				_client.received(phrases[random.nextInt(phrases.length)]);
			}
		}

	}

	public static void main(String[] args) {
		ChatServer server = new ChatServer();

		ChatClient c1 = new ChatClient("Pete");
		ChatClient c2 = new SlowChatClient("Ann");
		ChatClient c3 = new ChatClient("John");

		server.addClient(c1);
		Utils.pause(2000);
		server.addClient(c2);
		Utils.pause(2000);
		server.addClient(c3);
		Utils.pause(2000);

		ExecutorService service = Executors.newCachedThreadPool();
		
		service.execute(server);
		service.execute(new ClientImitator(c1));
		service.execute(new ClientImitator(c2));
		service.execute(new ClientImitator(c3));
	}

}
