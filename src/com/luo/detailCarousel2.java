package com.luo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class detailCarousel1
 */
@WebServlet(urlPatterns = {"/detailCarousel_ja_01.json","/detailCarousel_en_01.json",
							"/detailCarousel_ja_02.json","/detailCarousel_en_02.json",
							"/detailCarousel_ja_03.json","/detailCarousel_en_03.json",
							"/detailCarousel_ja_04.json","/detailCarousel_en_04.json",
							"/detailCarousel_ja_05.json","/detailCarousel_en_05.json",
							"/detailCarousel_ja_06.json","/detailCarousel_en_06.json",
							"/detailCarousel_ja_07.json","/detailCarousel_en_07.json",
							"/detailCarousel_ja_08.json","/detailCarousel_en_08.json",
							"/detailCarousel_ja_09.json","/detailCarousel_en_09.json",
							"/detailCarousel_ja_10.json","/detailCarousel_en_10.json",
							"/detailCarousel_ja_11.json","/detailCarousel_en_11.json",
							"/detailCarousel_ja_12.json","/detailCarousel_en_12.json",
							"/detailCarousel_ja_13.json","/detailCarousel_en_13.json"})
public class detailCarousel2 extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailCarousel2() {
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
    	
		String ClassificationLabel = url.substring(url.length()-2);
		doGetCarousel(request, response, ClassificationLabel, null);
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
