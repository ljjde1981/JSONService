package com.luo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Medals
 */
@WebServlet("/api/v1/everyoneMedals")
public class Medals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Medals() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		StringBuffer buff = new StringBuffer();
		
		buff.append("{");
		buff.append("    \"result\": \"ok\",");
		buff.append("    \"map\": {");
		buff.append("        \"id\": 123456789,");
		buff.append("        \"join\": true,");
		buff.append("        \"emailReceptionType\": \"01\"");
		buff.append("    }");
		buff.append("}");
		response.getWriter().append(buff.toString().replaceAll(" ",""));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		StringBuffer buff = new StringBuffer();
		
		buff.append("{");
		buff.append("    \"result\": \"ok\"");
		buff.append("}");
		response.getWriter().append(buff.toString().replaceAll(" ",""));
	}

}
