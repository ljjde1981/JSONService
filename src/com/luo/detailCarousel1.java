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
@WebServlet(urlPatterns = {"/detailCarousel_en_01_01.json","/detailCarousel_ja_01_01.json",
		"/detailCarousel_en_01_02.json","/detailCarousel_ja_01_02.json",
		"/detailCarousel_en_01_03.json","/detailCarousel_ja_01_03.json",
		"/detailCarousel_en_01_04.json","/detailCarousel_ja_01_04.json",
		"/detailCarousel_en_01_05.json","/detailCarousel_ja_01_05.json",
		"/detailCarousel_en_01_06.json","/detailCarousel_ja_01_06.json",
		"/detailCarousel_en_01_07.json","/detailCarousel_ja_01_07.json",
		"/detailCarousel_en_01_08.json","/detailCarousel_ja_01_08.json",
		"/detailCarousel_en_01_09.json","/detailCarousel_ja_01_09.json",
		"/detailCarousel_en_01_10.json","/detailCarousel_ja_01_10.json",
		"/detailCarousel_en_01_11.json","/detailCarousel_ja_01_11.json",
		"/detailCarousel_en_01_12.json","/detailCarousel_ja_01_12.json",
		"/detailCarousel_en_01_13.json","/detailCarousel_ja_01_13.json",
		"/detailCarousel_en_02_01.json","/detailCarousel_ja_02_01.json",
		"/detailCarousel_en_02_02.json","/detailCarousel_ja_02_02.json",
		"/detailCarousel_en_02_03.json","/detailCarousel_ja_02_03.json",
		"/detailCarousel_en_02_04.json","/detailCarousel_ja_02_04.json",
		"/detailCarousel_en_02_05.json","/detailCarousel_ja_02_05.json",
		"/detailCarousel_en_02_06.json","/detailCarousel_ja_02_06.json",
		"/detailCarousel_en_02_07.json","/detailCarousel_ja_02_07.json",
		"/detailCarousel_en_02_08.json","/detailCarousel_ja_02_08.json",
		"/detailCarousel_en_02_09.json","/detailCarousel_ja_02_09.json",
		"/detailCarousel_en_02_10.json","/detailCarousel_ja_02_10.json",
		"/detailCarousel_en_02_11.json","/detailCarousel_ja_02_11.json",
		"/detailCarousel_en_02_12.json","/detailCarousel_ja_02_12.json",
		"/detailCarousel_en_02_13.json","/detailCarousel_ja_02_13.json",
		"/detailCarousel_en_03_01.json","/detailCarousel_ja_03_01.json",
		"/detailCarousel_en_03_02.json","/detailCarousel_ja_03_02.json",
		"/detailCarousel_en_03_03.json","/detailCarousel_ja_03_03.json",
		"/detailCarousel_en_03_04.json","/detailCarousel_ja_03_04.json",
		"/detailCarousel_en_03_05.json","/detailCarousel_ja_03_05.json",
		"/detailCarousel_en_03_06.json","/detailCarousel_ja_03_06.json",
		"/detailCarousel_en_03_07.json","/detailCarousel_ja_03_07.json",
		"/detailCarousel_en_03_08.json","/detailCarousel_ja_03_08.json",
		"/detailCarousel_en_03_09.json","/detailCarousel_ja_03_09.json",
		"/detailCarousel_en_03_10.json","/detailCarousel_ja_03_10.json",
		"/detailCarousel_en_03_11.json","/detailCarousel_ja_03_11.json",
		"/detailCarousel_en_03_12.json","/detailCarousel_ja_03_12.json",
		"/detailCarousel_en_03_13.json","/detailCarousel_ja_03_13.json",
		"/detailCarousel_en_04_01.json","/detailCarousel_ja_04_01.json",
		"/detailCarousel_en_04_02.json","/detailCarousel_ja_04_02.json",
		"/detailCarousel_en_04_03.json","/detailCarousel_ja_04_03.json",
		"/detailCarousel_en_04_04.json","/detailCarousel_ja_04_04.json",
		"/detailCarousel_en_04_05.json","/detailCarousel_ja_04_05.json",
		"/detailCarousel_en_04_06.json","/detailCarousel_ja_04_06.json",
		"/detailCarousel_en_04_07.json","/detailCarousel_ja_04_07.json",
		"/detailCarousel_en_04_08.json","/detailCarousel_ja_04_08.json",
		"/detailCarousel_en_04_09.json","/detailCarousel_ja_04_09.json",
		"/detailCarousel_en_04_10.json","/detailCarousel_ja_04_10.json",
		"/detailCarousel_en_04_11.json","/detailCarousel_ja_04_11.json",
		"/detailCarousel_en_04_12.json","/detailCarousel_ja_04_12.json",
		"/detailCarousel_en_04_13.json","/detailCarousel_ja_04_13.json",
		"/detailCarousel_en_05_01.json","/detailCarousel_ja_05_01.json",
		"/detailCarousel_en_05_02.json","/detailCarousel_ja_05_02.json",
		"/detailCarousel_en_05_03.json","/detailCarousel_ja_05_03.json",
		"/detailCarousel_en_05_04.json","/detailCarousel_ja_05_04.json",
		"/detailCarousel_en_05_05.json","/detailCarousel_ja_05_05.json",
		"/detailCarousel_en_05_06.json","/detailCarousel_ja_05_06.json",
		"/detailCarousel_en_05_07.json","/detailCarousel_ja_05_07.json",
		"/detailCarousel_en_05_08.json","/detailCarousel_ja_05_08.json",
		"/detailCarousel_en_05_09.json","/detailCarousel_ja_05_09.json",
		"/detailCarousel_en_05_10.json","/detailCarousel_ja_05_10.json",
		"/detailCarousel_en_05_11.json","/detailCarousel_ja_05_11.json",
		"/detailCarousel_en_05_12.json","/detailCarousel_ja_05_12.json",
		"/detailCarousel_en_05_13.json","/detailCarousel_ja_05_13.json",
		"/detailCarousel_en_06_01.json","/detailCarousel_ja_06_01.json",
		"/detailCarousel_en_06_02.json","/detailCarousel_ja_06_02.json",
		"/detailCarousel_en_06_03.json","/detailCarousel_ja_06_03.json",
		"/detailCarousel_en_06_04.json","/detailCarousel_ja_06_04.json",
		"/detailCarousel_en_06_05.json","/detailCarousel_ja_06_05.json",
		"/detailCarousel_en_06_06.json","/detailCarousel_ja_06_06.json",
		"/detailCarousel_en_06_07.json","/detailCarousel_ja_06_07.json",
		"/detailCarousel_en_06_08.json","/detailCarousel_ja_06_08.json",
		"/detailCarousel_en_06_09.json","/detailCarousel_ja_06_09.json",
		"/detailCarousel_en_06_10.json","/detailCarousel_ja_06_10.json",
		"/detailCarousel_en_06_11.json","/detailCarousel_ja_06_11.json",
		"/detailCarousel_en_06_12.json","/detailCarousel_ja_06_12.json",
		"/detailCarousel_en_06_13.json","/detailCarousel_ja_06_13.json",
		"/detailCarousel_en_07_01.json","/detailCarousel_ja_07_01.json",
		"/detailCarousel_en_07_02.json","/detailCarousel_ja_07_02.json",
		"/detailCarousel_en_07_03.json","/detailCarousel_ja_07_03.json",
		"/detailCarousel_en_07_04.json","/detailCarousel_ja_07_04.json",
		"/detailCarousel_en_07_05.json","/detailCarousel_ja_07_05.json",
		"/detailCarousel_en_07_06.json","/detailCarousel_ja_07_06.json",
		"/detailCarousel_en_07_07.json","/detailCarousel_ja_07_07.json",
		"/detailCarousel_en_07_08.json","/detailCarousel_ja_07_08.json",
		"/detailCarousel_en_07_09.json","/detailCarousel_ja_07_09.json",
		"/detailCarousel_en_07_10.json","/detailCarousel_ja_07_10.json",
		"/detailCarousel_en_07_11.json","/detailCarousel_ja_07_11.json",
		"/detailCarousel_en_07_12.json","/detailCarousel_ja_07_12.json",
		"/detailCarousel_en_07_13.json","/detailCarousel_ja_07_13.json",
		"/detailCarousel_en_08_01.json","/detailCarousel_ja_08_01.json",
		"/detailCarousel_en_08_02.json","/detailCarousel_ja_08_02.json",
		"/detailCarousel_en_08_03.json","/detailCarousel_ja_08_03.json",
		"/detailCarousel_en_08_04.json","/detailCarousel_ja_08_04.json",
		"/detailCarousel_en_08_05.json","/detailCarousel_ja_08_05.json",
		"/detailCarousel_en_08_06.json","/detailCarousel_ja_08_06.json",
		"/detailCarousel_en_08_07.json","/detailCarousel_ja_08_07.json",
		"/detailCarousel_en_08_08.json","/detailCarousel_ja_08_08.json",
		"/detailCarousel_en_08_09.json","/detailCarousel_ja_08_09.json",
		"/detailCarousel_en_08_10.json","/detailCarousel_ja_08_10.json",
		"/detailCarousel_en_08_11.json","/detailCarousel_ja_08_11.json",
		"/detailCarousel_en_08_12.json","/detailCarousel_ja_08_12.json",
		"/detailCarousel_en_08_13.json","/detailCarousel_ja_08_13.json",
		"/detailCarousel_en_09_01.json","/detailCarousel_ja_09_01.json",
		"/detailCarousel_en_09_02.json","/detailCarousel_ja_09_02.json",
		"/detailCarousel_en_09_03.json","/detailCarousel_ja_09_03.json",
		"/detailCarousel_en_09_04.json","/detailCarousel_ja_09_04.json",
		"/detailCarousel_en_09_05.json","/detailCarousel_ja_09_05.json",
		"/detailCarousel_en_09_06.json","/detailCarousel_ja_09_06.json",
		"/detailCarousel_en_09_07.json","/detailCarousel_ja_09_07.json",
		"/detailCarousel_en_09_08.json","/detailCarousel_ja_09_08.json",
		"/detailCarousel_en_09_09.json","/detailCarousel_ja_09_09.json",
		"/detailCarousel_en_09_10.json","/detailCarousel_ja_09_10.json",
		"/detailCarousel_en_09_11.json","/detailCarousel_ja_09_11.json",
		"/detailCarousel_en_09_12.json","/detailCarousel_ja_09_12.json",
		"/detailCarousel_en_09_13.json","/detailCarousel_ja_09_13.json",
		"/detailCarousel_en_10_01.json","/detailCarousel_ja_10_01.json",
		"/detailCarousel_en_10_02.json","/detailCarousel_ja_10_02.json",
		"/detailCarousel_en_10_03.json","/detailCarousel_ja_10_03.json",
		"/detailCarousel_en_10_04.json","/detailCarousel_ja_10_04.json",
		"/detailCarousel_en_10_05.json","/detailCarousel_ja_10_05.json",
		"/detailCarousel_en_10_06.json","/detailCarousel_ja_10_06.json",
		"/detailCarousel_en_10_07.json","/detailCarousel_ja_10_07.json",
		"/detailCarousel_en_10_08.json","/detailCarousel_ja_10_08.json",
		"/detailCarousel_en_10_09.json","/detailCarousel_ja_10_09.json",
		"/detailCarousel_en_10_10.json","/detailCarousel_ja_10_10.json",
		"/detailCarousel_en_10_11.json","/detailCarousel_ja_10_11.json",
		"/detailCarousel_en_10_12.json","/detailCarousel_ja_10_12.json",
		"/detailCarousel_en_10_13.json","/detailCarousel_ja_10_13.json",
		"/detailCarousel_en_11_01.json","/detailCarousel_ja_11_01.json",
		"/detailCarousel_en_11_02.json","/detailCarousel_ja_11_02.json",
		"/detailCarousel_en_11_03.json","/detailCarousel_ja_11_03.json",
		"/detailCarousel_en_11_04.json","/detailCarousel_ja_11_04.json",
		"/detailCarousel_en_11_05.json","/detailCarousel_ja_11_05.json",
		"/detailCarousel_en_11_06.json","/detailCarousel_ja_11_06.json",
		"/detailCarousel_en_11_07.json","/detailCarousel_ja_11_07.json",
		"/detailCarousel_en_11_08.json","/detailCarousel_ja_11_08.json",
		"/detailCarousel_en_11_09.json","/detailCarousel_ja_11_09.json",
		"/detailCarousel_en_11_10.json","/detailCarousel_ja_11_10.json",
		"/detailCarousel_en_11_11.json","/detailCarousel_ja_11_11.json",
		"/detailCarousel_en_11_12.json","/detailCarousel_ja_11_12.json",
		"/detailCarousel_en_11_13.json","/detailCarousel_ja_11_13.json",
		"/detailCarousel_en_12_01.json","/detailCarousel_ja_12_01.json",
		"/detailCarousel_en_12_02.json","/detailCarousel_ja_12_02.json",
		"/detailCarousel_en_12_03.json","/detailCarousel_ja_12_03.json",
		"/detailCarousel_en_12_04.json","/detailCarousel_ja_12_04.json",
		"/detailCarousel_en_12_05.json","/detailCarousel_ja_12_05.json",
		"/detailCarousel_en_12_06.json","/detailCarousel_ja_12_06.json",
		"/detailCarousel_en_12_07.json","/detailCarousel_ja_12_07.json",
		"/detailCarousel_en_12_08.json","/detailCarousel_ja_12_08.json",
		"/detailCarousel_en_12_09.json","/detailCarousel_ja_12_09.json",
		"/detailCarousel_en_12_10.json","/detailCarousel_ja_12_10.json",
		"/detailCarousel_en_12_11.json","/detailCarousel_ja_12_11.json",
		"/detailCarousel_en_12_12.json","/detailCarousel_ja_12_12.json",
		"/detailCarousel_en_12_13.json","/detailCarousel_ja_12_13.json",
		"/detailCarousel_en_13_01.json","/detailCarousel_ja_13_01.json",
		"/detailCarousel_en_13_02.json","/detailCarousel_ja_13_02.json",
		"/detailCarousel_en_13_03.json","/detailCarousel_ja_13_03.json",
		"/detailCarousel_en_13_04.json","/detailCarousel_ja_13_04.json",
		"/detailCarousel_en_13_05.json","/detailCarousel_ja_13_05.json",
		"/detailCarousel_en_13_06.json","/detailCarousel_ja_13_06.json",
		"/detailCarousel_en_13_07.json","/detailCarousel_ja_13_07.json",
		"/detailCarousel_en_13_08.json","/detailCarousel_ja_13_08.json",
		"/detailCarousel_en_13_09.json","/detailCarousel_ja_13_09.json",
		"/detailCarousel_en_13_10.json","/detailCarousel_ja_13_10.json",
		"/detailCarousel_en_13_11.json","/detailCarousel_ja_13_11.json",
		"/detailCarousel_en_13_12.json","/detailCarousel_ja_13_12.json",
		"/detailCarousel_en_13_13.json","/detailCarousel_ja_13_13.json"})
public class detailCarousel1 extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailCarousel1() {
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
		String place = url.substring(url.length()-5, url.length()-3);
		doGetCarousel(request, response, ClassificationLabel, place);
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
