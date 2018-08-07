package com.luo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class events
 */
@WebServlet(urlPatterns = {"/events_ja_01", "/events_en_01",
		   "/events_ja_02", "/events_en_02",
		   "/events_ja_03", "/events_en_03",
		   "/events_ja_04", "/events_en_04",
		   "/events_ja_05", "/events_en_05",
		   "/events_ja_06", "/events_en_06",
		   "/events_ja_07", "/events_en_07",
		   
		   "/events_ja_01.json", "/events_en_01.json",
		   "/events_ja_02.json", "/events_en_02.json",
		   "/events_ja_03.json", "/events_en_03.json",
		   "/events_ja_04.json", "/events_en_04.json",
		   "/events_ja_05.json", "/events_en_05.json",
		   "/events_ja_06.json", "/events_en_06.json",
		   "/events_ja_07.json", "/events_en_07.json"})
public class Events extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Events() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	super.doGet(request, response, "AE");
	}

}
