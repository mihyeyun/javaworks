package chap07;

public class HttpServletExample {

	public static void main(String[] args) {
		HttpServlet servlet = new LoginServlet();
		HttpServlet servlet1 = new FileDownLoadServlet();
		servlet.service();
		servlet1.service();

	}

}
