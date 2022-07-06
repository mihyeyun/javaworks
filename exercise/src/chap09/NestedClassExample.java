package chap09;

public class NestedClassExample {
	Car myCar = new Car();
	
	Car.Tire tire = myCar.new Tire();
	
	Car.Engine engine = new Car.Engine();
}
