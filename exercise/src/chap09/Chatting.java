package chap09;

public class Chatting {
	void starChat(String chatId) {
		String nickName = chatId; //nickName은 final 특성을 가지고 있으므로 수정 불가
		
		class Chat{
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			void sendMessage(String message) {
				
			}
		}
		Chat chat = new Chat();
		chat.start();
	}
}
