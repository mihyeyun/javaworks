package thread;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업스레드 이름: " + threadA.getName());
		threadA.start();
		
		// 이름 설정안하는 경우 Thread - 1 과 같은 순번으로 자동으로 번호 생성됨
		ThreadB threadB = new ThreadB();
		System.out.println("작업스레드 이름: " + threadB.getName());
		threadB.start();
	}

}
