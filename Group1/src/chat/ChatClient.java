package chat;

public class ChatClient {

	String name;
	ChatServer server;
	
	public ChatClient(String name) {
		this.name = name;
	}
	
	public void setServer(ChatServer server) {
		this.server = server;
	}

	public void sendMessage(String message) {
		System.out.println(name + " <- " + message);
	}

	public String getName() {
		return name;
	}
	
	public void received(String message) {
		server.process(message, this);
	}

}
