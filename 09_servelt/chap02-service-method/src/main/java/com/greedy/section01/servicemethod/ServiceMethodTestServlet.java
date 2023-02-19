package com.greedy.section01.servicemethod;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServiceMethodTestServlet
 */
@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* HTTP 메소드 판단*/
		String method = request.getMethod();
		System.out.println("http method : "+method);
		
		//get이 같으면 두겟을 호출하겠다.
		if("GET".equals(method)) {
			doGet(request,response);
			//만약포스트 방식이라면, 두포스트를 호출하되
			//알아야할건 알아오고, 설정할 건 설정해서 전개할 수 있도록
		}else if("POST".equals(method)) {
			doPost(request,response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 요청을 처리할 메소드 호출됨 ...");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST 요청을 처리할 메소드 호출됨 ...");
	}

}
