package chap02;

public class Test5_3 {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCES) {
			System.out.println("로그인에 성공");
		}else if (result == LoginResult.FAIL_ID) {
			System.out.println("아이디가 틀립니다.");
		}else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("비밀번호가 틀립니다.");
		}
		

	}

}
