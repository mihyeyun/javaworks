package abstractex.animal;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//자동 형변환
		Animal animal = null;
		animal = new Dog();	
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		//메소드의 매개변수의 다형성
		animalsound(dog);
		animalsound(cat);
		 
		
	}//main 닫기

	private static void animalsound(Animal animal) {
		animal.sound();
		
	}
	
	
	
}
