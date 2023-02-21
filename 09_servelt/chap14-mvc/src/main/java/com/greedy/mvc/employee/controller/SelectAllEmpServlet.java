package com.greedy.mvc.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SelectAllEmpServlet")
public class SelectAllEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 전체 사원의 정보 조회 결과에 따라 employeeList.jsp or common/errorPage.jsp로 응답 */
		
	}



}
