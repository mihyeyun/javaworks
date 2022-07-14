package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		Message mail = new Message("sendMail", "이양파");
		Message sms = new Message("sendMail", "박마늘");
		Message kakaotalk = new Message("sendMail", "오감자");
		
		messageQueue.offer(mail);
		messageQueue.offer(sms);
		messageQueue.offer(kakaotalk);
		
		/*messageQueue.offer(new Message("sendMail", "이양파"));
		messageQueue.offer(new Message("sendSMS", "박마늘"));
		messageQueue.offer(new Message("sendKakaotalk", "오감자"));*/
		
		System.out.println("총 객체수: " + messageQueue.size());
		
		//객체 빼기 (0번 인덱스가 계속 나옴)
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
