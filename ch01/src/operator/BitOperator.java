package operator;

public class BitOperator {

	public static void main(String[] args) {
		// 비트 논리 연산
		int num1 = 5;	//0101
		int num2 = 10;	//1010
		int result;
		result = num1 & num2;	//0000 (모두 1일때만 1, 아니면 0)
		System.out.println(result);	//정수 0
		
		result = num1 | num2; //1111 (둘 중 하나만 1 이어도 1)
		System.out.println(result); //정수 15
		
		// 비트 이동 연산
		int val = 2;	//0010
		System.out.println(val << 1);	//0100, 정수 4
		int val1 = 3;					//0011
		System.out.println(val1 >> 1);  //0001, 정수 1
		
		//2진수, 16진수 표기
		int n = 10;
		int bNum = 0b1010; //0b를 붙이면 2진수 표기
		int hNum = 0xA;	   //0x를 붙이면 16진수 표기
		
		System.out.println(n);
		System.out.println(bNum);
		System.out.println(hNum);

	}

}
