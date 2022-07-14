package collection.queue;

public class ArrayQueueTest {

	public static void main(String[] args) {
		
		//큐는 FIFO(First In First Out)
		MyQueue queue = new MyQueue();
		
		//자료 넣기 A B C D 순
		queue.enQueue("A"); //0
		queue.enQueue("B");	//1
		queue.enQueue("C");	//2
		queue.enQueue("D");	//3
		
		System.out.println("총 객체수: " + queue.getSize() + "개");
		
		//자료 꺼내기 (삭제) A B C D 순
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue()); //-1 리스트의 범위 초과
	}

}
