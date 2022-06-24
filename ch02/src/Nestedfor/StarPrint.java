package Nestedfor;

public class StarPrint {

	public static void main(String[] args) {
		// 별찍기(삼각형 모형)
		/*int i, j;
		for(i = 1; i <= 5; i++) {
			for(j=1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();  //행바꿈
		}
		// 별찍기(역삼각형 모형)
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j=5; j >= i; j--) {
				System.out.print("*");
			}System.out.println();  //행바꿈
		}*/
		
		
		
		int i, j;
		for(i = 1; i <= 5; i++) {
			//첫 행에서 공백 4개, 별이 1개로 구성
			for(j = 1; j <= 5-i; j++) {
				System.out.print(" "); //공백문자
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*"); //공백문자
			}
			System.out.println();  //행바꿈
		}
		
		
		for(i = 1; i <= 5; i++) {
			//첫 행에서 공백 4개, 별이 1개로 구성
			for(j = 1; j < i; j++) {
				System.out.print(" "); //공백문자
			}
			for(j = 5; j >= i; j--) {
				System.out.print("*"); //공백문자
			}
			System.out.println();  //행바꿈
		}

	}

}
