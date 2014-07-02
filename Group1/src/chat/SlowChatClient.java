package chat;

import lesson140528.Utils;

public class SlowChatClient extends ChatClient {

	public SlowChatClient(String name) {
		super(name);
	}
	
	@Override
	public void sendMessage(String message) {
		Utils.pause(5000);
		super.sendMessage(message);
		Utils.pause(5000);
	}

}
