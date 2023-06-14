package org.kosta.semiproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse reponse) throws Exception {
		request.setAttribute("info", "db 연동 정보");
		return "home.jsp";
	}
}
