package dbconnection;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		/*Person p1 = new Person();
		p1.setUserId("gang");
		p1.setUserPw("gang95");
		p1.setName("원경");
		p1.setAge(27);
		
		dao.insertPerson(p1);*/
		
		//자료 수정
		/*Person p2 = new Person();
		p2.setUserId("gang");
		p2.setUserPw("gang96");	//비밀번호 수정
		p2.setName("원경");		//이름 수정
		p2.setAge(27);
		
		dao.updatePerson(p2); 	//자료 수정 메서드 호출*/
		
		//자료 삭제
		/*Person deleteOne = new Person();
		deleteOne.setUserId("sky");
		
		dao.deletePerson(deleteOne);*/
		
		//특정한 1명 조회
		Person selectOne = dao.getPerson("may");
		printPerson(selectOne);
		System.out.println("==================================");
		
		//전체 조회		
		personList = dao.getPersonList();
		for(int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			printPerson(person);
		}
		
		
		
	}//main 닫기
	
	public static void printPerson(Person person) {
		System.out.println("아이디: " + person.getUserId());
		System.out.println("비밀번호: " + person.getUserPw());
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
	}

}
