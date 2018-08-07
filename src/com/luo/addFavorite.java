package com.luo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addFavorite
 */
@WebServlet("/addFavorite")
public class addFavorite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addFavorite() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static Map<String,List<String>> cache = new HashMap<String, List<String>>();
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		
		String userId = request.getParameter("userId");
		String code = request.getParameter("code");
		Boolean isAdd = Boolean.valueOf(request.getParameter("isAdd"));
	
		List<String> favorites = Cache.getInstance().get(userId);
		if (isAdd) {
			favorites.add(code);
		} else {
			favorites.remove(code);
		}
		
		response.getWriter().println("{\"result\":\"ok\"}");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		doPost(request, response);
	}

}
