package statics;

public class Calculator {

	static double PI = 3.14159;
	int num = 0; //인스턴스 변수
	
	static int plus(int x, int y) {
		//num = 1; 인스턴스 변수는 static 메서드에서 사용불가
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	int square(int x) {
		return x * x;
	}

}
