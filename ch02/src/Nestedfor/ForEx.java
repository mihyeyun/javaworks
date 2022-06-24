package Nestedfor;

public class ForEx {

	public static void main(String[] args) {
		// 중첩된 for문 - 행, 열
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("$");
			}System.out.println();  //행바꿈
		}
		
	}

}
