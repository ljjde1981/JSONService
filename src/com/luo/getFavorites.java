package com.luo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getFavorites
 */
@WebServlet("/getFavorites")
public class getFavorites extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFavorites() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		
		String userId = request.getParameter("userId");
		
		List<String> retList = Cache.getInstance().get(userId);
		String ret = "[";
		if (retList.size() > 0) {
			ret += "\"" + retList.get(0) + "\"";
			for(int i=1;i<retList.size();i++) {
				ret += ",\"" + retList.get(i) + "\"";
			}
		}
		ret += "]";
		response.getWriter().println("{\"result\":\"ok\", \"list\":"+ret+"}");
	}

}
