package polymorphism.child;

public class ChildTest {

	public static void main(String[] args) {
		Child child = new Child();
		
		//Parent parent = child;	//자동 타입 형변환
		Parent parent = new Child();
		
		child.method1();
		child.method2();
		//parent.method3(); 호출 불가
		
		//강제 타입 변환
		Child child2 = (Child)parent;
		child2.method3();

	}

}
