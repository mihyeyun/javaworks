package chap07;

public class ControllerTest {

	public static void main(String[] args) {
		Controller controller = new Controller();

		controller.setService(new MemberService());
		controller.service.login();

		controller.setService(new AService());
		controller.service.login();

	}

}
