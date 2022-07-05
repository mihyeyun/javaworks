package abstractex.template_method;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}

}
