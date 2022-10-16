package pack.human;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/human")
// localhost:8080/human을 요청하면 아래의 클래스가 동작되도록 적용.
// 위의 기능을 수행하기 위해서는 web.xml 의 
// metadata-complete="true" ==> "false"가 되어야 함.
public class Human extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
	
		System.out.println("console hello Human2");
		// console 창에 출력하는 것을 의미함.
		
		PrintWriter out = response.getWriter();
		out.println("Browser hello Human2");
		// PrintWriter 는 Browser에 출력하는 것을 의미함.
	}
	

}
