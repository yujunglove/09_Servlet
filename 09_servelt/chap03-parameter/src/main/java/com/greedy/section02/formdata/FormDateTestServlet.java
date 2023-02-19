package com.greedy.section02.formdata;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formdata")
public class FormDateTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//GET 방식 요청은 request의 header를 통해 전달하고 body는 아무런 데이터를 담지 않기 떄문에
		//따로 읽지 않는다. (처리 속도 빠름 - 주로 조회 동작 시 사용 된다.)
		//POST 방식 요청은 request의 body를 통해 데이터를 전달하고 url에 데이터가 노출 되지 않으며 데이터 길이에
		//제한이 없다.( 주로 데이터 저장, 수정 등의 동작 시 사용 된다.)
		
		
		//GET 방식의 데이터는 HTML charset에 기술 된 인코딩 방식으로 브라우저가 한글을 이해 한 뒤 URLEncoder
		//를 이용하여 반환하고 url 요청으로 전송한다. 따라서 헤더의 내용은 알맞게 해석되므로 별도의 charset 설정이 불필요하다.
		
		//<인코딩 처리 무조건해주기 한글>
		//POST 방식의 요청은 body에 담아서 전송하는데 헤더와는 별게로 URLEncoder를 이용하지 않고 데이터를 전송한다.
		//charset을 별도로 설정하지 않았을 경우 null이 반환되는데 기본 값은 ISO-8859-1 방식으로 되어 있어
		//한글 값이 꺠지는 현상이 발생한다
		
		System.out.println(request.getCharacterEncoding());
		
		//파라미터 값을 꺼내기 전에 디코딩할 인코딩 방식을 지정해주면 해당 방식으로 body의 값을 해석한다.
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		System.out.println("이름 : "+ name);
		
		// getParameter()는 리턴 타입이 문자열이므로 숫자 타입의 값이 필요하다면
		//parsing 처리 해야한다.
		int age = Integer.parseInt(request.getParameter("age"));
		
		//java.sql.Date 타입으로 날짜 테이터 parsing
		java.sql.Date birthday = java.sql.Date.valueOf(request.getParameter("birthday"));
		System.out.println("생일 :"+birthday);

		//radio로 전달 된 값은 여러 값 중 한 가지만 전달 되기 떄문에 parameter로 전달 받은 값을 꺼내기만 하면 된다.
		String gender = request.getParameter("gender");
		System.out.println("성별 : "+gender);
		
		//select box를 이용한 방식도 크게 다르지 않다.
		String national = request.getParameter("national");
		System.out.println("국적 : "+national);
		
		/*checkbox는 다중 입력 될 수 있기 떄문에 선택 된 값이 문자열 배열로 전달 된다.
		 * getParameterValues() 메소드를 이용한다.*/
		String[] hobbies = request.getParameterValues("hobbies");
		for(String hobby : hobbies) {
			System.out.println("취미 : " +hobby);
		}
		
		//getParameter, getParameterValues 외의 파라미터 값을 확인할수 있는 메소드 테스트
		//getParameter();
		//getParameterValues();
		//서버로 보내진 데이터를 꺼내서 확인 가능
		//모든 데이터의 key를 이용하여 전송 된 값을 일괄 처리하는 방법
		Map<String, String[]> requestMap =request.getParameterMap();
		Set<String> keySet = requestMap.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			//키 값 통해서 가져오면 밸류 값
			//밸류가 배열인 이유, 이름,나이,성별,국적은 단일 값이지만
			//똑같은 속성으로 여러가 넘어올 때가 있음(취미)
			//배열이 하나 담겼을 수도 있으며, 여러 개가 담길 수도 있다.
			String[] value = requestMap.get(key);
			
			System.out.println("key: "+key);
			for(String val : value) {
			System.out.println("value : " + val);
			}
		}
		/*파라미터로 전달 된 키 목록만 반환 반을수있다. */
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
	}

}
