package loopExaplm;

public class For1To10 {

	public static void main(String[] args) {
		// for문 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("================");
		//1부터 10까지 합계
		int i;
		int sumV;
		for(i = 1, sumV = 0; i <= 10; i++) {
			sumV += i;
			System.out.println("i = " + i + ", sumV = " + sumV);
		}System.out.println(sumV);

	}//main
}//class
