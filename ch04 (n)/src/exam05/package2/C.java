package exam05.package2;

import exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; 
		//a.field2 = 1; 다른패키지 접근 불가 (default)
		//a.field3 = 1; 클래스 외부에서 접근 불가 (private)
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}
