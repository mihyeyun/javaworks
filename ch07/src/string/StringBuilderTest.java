package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		//StringBuilder - 내부에 변경 가능한 char[] 변수를 가지고 있음
		
		String javaStr = new String("java");
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		//문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");

		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));

		

	}

}
