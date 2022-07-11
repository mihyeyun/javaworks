package classexam;

public class PersonTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		//클래스 이름을 모를때
		System.out.println("클래스 이름 가져오기");
		Class<?> pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		//이미 클래스 이름을 알고 있을 때 사용
		Class<?> pClass2 = Class.forName("classexam.Person");
		System.out.println(pClass2.getName());
		
	}
}
