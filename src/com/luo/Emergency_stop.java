package com.luo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Emergency_stop
 */
@WebServlet("/emergency_stop.json")
public class Emergency_stop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Emergency_stop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer buff = new StringBuffer();
		buff.append("{\"contentList\":");
		buff.append("[");
		//buff.append("\"").append("ae0001").append("\"");
		buff.append("]");
		buff.append("}");
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		// TODO Auto-generated method stub
		response.getWriter().append(buff.toString());
	}

}
