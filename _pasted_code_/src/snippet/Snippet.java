package snippet;

public class Snippet {
	Controller controller = new Controller();
	
	controller.setService(new MemberService());
	controller.service.login();
	
	controller.setService(new AService());
	controller.service.login();
}

