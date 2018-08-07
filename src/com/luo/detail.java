package com.luo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class favoriteDatas
 */
@WebServlet(urlPatterns = {"/api/v1/en/events/ae0001", "/api/v1/ja/events/ae0001",
		"/api/v1/en/events/ae0002", "/api/v1/ja/events/ae0002",
		"/api/v1/en/events/ae0003", "/api/v1/ja/events/ae0003",
		"/api/v1/en/events/ae0004", "/api/v1/ja/events/ae0004",
		"/api/v1/en/events/ae0005", "/api/v1/ja/events/ae0005",
		"/api/v1/en/events/ae0006", "/api/v1/ja/events/ae0006",
		"/api/v1/en/events/ae0007", "/api/v1/ja/events/ae0007",
		"/api/v1/en/events/ae0008", "/api/v1/ja/events/ae0008",
		"/api/v1/en/events/ae0009", "/api/v1/ja/events/ae0009",
		"/api/v1/en/events/ae0010", "/api/v1/ja/events/ae0010",
		"/api/v1/en/events/ae0011", "/api/v1/ja/events/ae0011",
		"/api/v1/en/events/ae0012", "/api/v1/ja/events/ae0012",
		"/api/v1/en/events/ae0013", "/api/v1/ja/events/ae0013",
		"/api/v1/en/events/ac0001", "/api/v1/ja/events/ac0001",
		"/api/v1/en/events/ac0002", "/api/v1/ja/events/ac0002",
		"/api/v1/en/events/ac0003", "/api/v1/ja/events/ac0003",
		"/api/v1/en/events/ac0004", "/api/v1/ja/events/ac0004",
		"/api/v1/en/events/ac0005", "/api/v1/ja/events/ac0005",
		"/api/v1/en/events/ac0006", "/api/v1/ja/events/ac0006",
		"/api/v1/en/events/ac0007", "/api/v1/ja/events/ac0007",
		"/api/v1/en/events/ac0008", "/api/v1/ja/events/ac0008",
		"/api/v1/en/events/ac0009", "/api/v1/ja/events/ac0009",
		"/api/v1/en/events/ac0010", "/api/v1/ja/events/ac0010",
		"/api/v1/en/events/ac0011", "/api/v1/ja/events/ac0011",
		"/api/v1/en/events/ac0012", "/api/v1/ja/events/ac0012",
		"/api/v1/en/events/ac0013", "/api/v1/ja/events/ac0013",
		"/api/v1/en/events/an0001", "/api/v1/ja/events/an0001",
		"/api/v1/en/events/an0002", "/api/v1/ja/events/an0002",
		"/api/v1/en/events/an0003", "/api/v1/ja/events/an0003",
		"/api/v1/en/events/an0004", "/api/v1/ja/events/an0004",
		"/api/v1/en/events/an0005", "/api/v1/ja/events/an0005",
		"/api/v1/en/events/an0006", "/api/v1/ja/events/an0006",
		"/api/v1/en/events/an0007", "/api/v1/ja/events/an0007",
		"/api/v1/en/events/an0008", "/api/v1/ja/events/an0008",
		"/api/v1/en/events/an0009", "/api/v1/ja/events/an0009",
		"/api/v1/en/events/an0010", "/api/v1/ja/events/an0010",
		"/api/v1/en/events/an0011", "/api/v1/ja/events/an0011",
		"/api/v1/en/events/an0012", "/api/v1/ja/events/an0012",
		"/api/v1/en/events/an0013", "/api/v1/ja/events/an0013",

})
public class detail extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detail() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		String param = request.getParameter("param");
        param = param.toUpperCase();

        response.setContentType("application/json;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        pw.println("{\"result\" : \"" + param + "\"}");
        */
    	String url = request.getRequestURL().toString();
    	if (url.endsWith(".json")) {
    		url = url.substring(0, url.length() -5);
    	}
    	
		String code = url.substring(url.length()-6);
		doGetDetailByCode(request, response, code);
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
