package annonymous.person;

public class Anonymous {
	Person field = new Person() {

		//필드 초기값으로 대입
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	
	};
	
	void method1() {
		//로컬 변수 사용
		
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
		@Override
		void wake() {
			System.out.println("7시에 일어납니다.");
			walk();
			}
		};
		//로컬 변수 사용
		
		localVar.wake();
		
	}
	
	void method2(Person person) {
		person.wake();
	}
	
	
}
