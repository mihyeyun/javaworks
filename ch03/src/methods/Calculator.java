package methods;

public class Calculator {
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute(int x, int y) {
		double result = avg(x, y);
		println("실행결과: " + result);
	}
	
	void println(String messege) {
		System.out.println(messege);
	}
}
