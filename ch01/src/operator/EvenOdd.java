package operator;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수/짝수를 판별하는 프로그램
		// 조건 연산자 활용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		
		int n = sc.nextInt();
		String result;
		//String result = (n % 2 == 0) ? "짝수" : "홀수";
		
		if(n % 2 != 0) {
			result = "홀수";
		}else {
			result = "짝수";
		}
		
		System.out.println(result);
		
		sc.close();
		

	}

}
