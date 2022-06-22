package operator;

public class Swap {

	public static void main(String[] args) {
		// 교환전 x = 0, y = 1 >> 교환후 x = 1, y = 0
		int x = 0, y = 1;
		System.out.println("x 값은 : " + x + ", y 값은 : " + y);
		int temp = 0;
		temp = y;
		y = x;
		x = temp;
		System.out.println("x 값은 : " + x + ", y 값은 : " + y + ", temp 값은 : " + temp);
		
		

	}

}
