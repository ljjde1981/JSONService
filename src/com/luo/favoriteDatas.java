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
@WebServlet(urlPatterns = {"/favoriteDatas_en_ae0001", "/favoriteDatas_ja_ae0001",
		"/favoriteDatas_en_ae0002", "/favoriteDatas_ja_ae0002",
		"/favoriteDatas_en_ae0003", "/favoriteDatas_ja_ae0003",
		"/favoriteDatas_en_ae0004", "/favoriteDatas_ja_ae0004",
		"/favoriteDatas_en_ae0005", "/favoriteDatas_ja_ae0005",
		"/favoriteDatas_en_ae0006", "/favoriteDatas_ja_ae0006",
		"/favoriteDatas_en_ae0007", "/favoriteDatas_ja_ae0007",
		"/favoriteDatas_en_ae0008", "/favoriteDatas_ja_ae0008",
		"/favoriteDatas_en_ae0009", "/favoriteDatas_ja_ae0009",
		"/favoriteDatas_en_ae0010", "/favoriteDatas_ja_ae0010",
		"/favoriteDatas_en_ae0011", "/favoriteDatas_ja_ae0011",
		"/favoriteDatas_en_ae0012", "/favoriteDatas_ja_ae0012",
		"/favoriteDatas_en_ae0013", "/favoriteDatas_ja_ae0013",
		"/favoriteDatas_en_ac0001", "/favoriteDatas_ja_ac0001",
		"/favoriteDatas_en_ac0002", "/favoriteDatas_ja_ac0002",
		"/favoriteDatas_en_ac0003", "/favoriteDatas_ja_ac0003",
		"/favoriteDatas_en_ac0004", "/favoriteDatas_ja_ac0004",
		"/favoriteDatas_en_ac0005", "/favoriteDatas_ja_ac0005",
		"/favoriteDatas_en_ac0006", "/favoriteDatas_ja_ac0006",
		"/favoriteDatas_en_ac0007", "/favoriteDatas_ja_ac0007",
		"/favoriteDatas_en_ac0008", "/favoriteDatas_ja_ac0008",
		"/favoriteDatas_en_ac0009", "/favoriteDatas_ja_ac0009",
		"/favoriteDatas_en_ac0010", "/favoriteDatas_ja_ac0010",
		"/favoriteDatas_en_ac0011", "/favoriteDatas_ja_ac0011",
		"/favoriteDatas_en_ac0012", "/favoriteDatas_ja_ac0012",
		"/favoriteDatas_en_ac0013", "/favoriteDatas_ja_ac0013",
		"/favoriteDatas_en_an0001", "/favoriteDatas_ja_an0001",
		"/favoriteDatas_en_an0002", "/favoriteDatas_ja_an0002",
		"/favoriteDatas_en_an0003", "/favoriteDatas_ja_an0003",
		"/favoriteDatas_en_an0004", "/favoriteDatas_ja_an0004",
		"/favoriteDatas_en_an0005", "/favoriteDatas_ja_an0005",
		"/favoriteDatas_en_an0006", "/favoriteDatas_ja_an0006",
		"/favoriteDatas_en_an0007", "/favoriteDatas_ja_an0007",
		"/favoriteDatas_en_an0008", "/favoriteDatas_ja_an0008",
		"/favoriteDatas_en_an0009", "/favoriteDatas_ja_an0009",
		"/favoriteDatas_en_an0010", "/favoriteDatas_ja_an0010",
		"/favoriteDatas_en_an0011", "/favoriteDatas_ja_an0011",
		"/favoriteDatas_en_an0012", "/favoriteDatas_ja_an0012",
		"/favoriteDatas_en_an0013", "/favoriteDatas_ja_an0013",
		
		"/favoriteDatas_en_ae0001.json", "/favoriteDatas_ja_ae0001.json",
		"/favoriteDatas_en_ae0002.json", "/favoriteDatas_ja_ae0002.json",
		"/favoriteDatas_en_ae0003.json", "/favoriteDatas_ja_ae0003.json",
		"/favoriteDatas_en_ae0004.json", "/favoriteDatas_ja_ae0004.json",
		"/favoriteDatas_en_ae0005.json", "/favoriteDatas_ja_ae0005.json",
		"/favoriteDatas_en_ae0006.json", "/favoriteDatas_ja_ae0006.json",
		"/favoriteDatas_en_ae0007.json", "/favoriteDatas_ja_ae0007.json",
		"/favoriteDatas_en_ae0008.json", "/favoriteDatas_ja_ae0008.json",
		"/favoriteDatas_en_ae0009.json", "/favoriteDatas_ja_ae0009.json",
		"/favoriteDatas_en_ae0010.json", "/favoriteDatas_ja_ae0010.json",
		"/favoriteDatas_en_ae0011.json", "/favoriteDatas_ja_ae0011.json",
		"/favoriteDatas_en_ae0012.json", "/favoriteDatas_ja_ae0012.json",
		"/favoriteDatas_en_ae0013.json", "/favoriteDatas_ja_ae0013.json",
		"/favoriteDatas_en_ac0001.json", "/favoriteDatas_ja_ac0001.json",
		"/favoriteDatas_en_ac0002.json", "/favoriteDatas_ja_ac0002.json",
		"/favoriteDatas_en_ac0003.json", "/favoriteDatas_ja_ac0003.json",
		"/favoriteDatas_en_ac0004.json", "/favoriteDatas_ja_ac0004.json",
		"/favoriteDatas_en_ac0005.json", "/favoriteDatas_ja_ac0005.json",
		"/favoriteDatas_en_ac0006.json", "/favoriteDatas_ja_ac0006.json",
		"/favoriteDatas_en_ac0007.json", "/favoriteDatas_ja_ac0007.json",
		"/favoriteDatas_en_ac0008.json", "/favoriteDatas_ja_ac0008.json",
		"/favoriteDatas_en_ac0009.json", "/favoriteDatas_ja_ac0009.json",
		"/favoriteDatas_en_ac0010.json", "/favoriteDatas_ja_ac0010.json",
		"/favoriteDatas_en_ac0011.json", "/favoriteDatas_ja_ac0011.json",
		"/favoriteDatas_en_ac0012.json", "/favoriteDatas_ja_ac0012.json",
		"/favoriteDatas_en_ac0013.json", "/favoriteDatas_ja_ac0013.json",
		"/favoriteDatas_en_an0001.json", "/favoriteDatas_ja_an0001.json",
		"/favoriteDatas_en_an0002.json", "/favoriteDatas_ja_an0002.json",
		"/favoriteDatas_en_an0003.json", "/favoriteDatas_ja_an0003.json",
		"/favoriteDatas_en_an0004.json", "/favoriteDatas_ja_an0004.json",
		"/favoriteDatas_en_an0005.json", "/favoriteDatas_ja_an0005.json",
		"/favoriteDatas_en_an0006.json", "/favoriteDatas_ja_an0006.json",
		"/favoriteDatas_en_an0007.json", "/favoriteDatas_ja_an0007.json",
		"/favoriteDatas_en_an0008.json", "/favoriteDatas_ja_an0008.json",
		"/favoriteDatas_en_an0009.json", "/favoriteDatas_ja_an0009.json",
		"/favoriteDatas_en_an0010.json", "/favoriteDatas_ja_an0010.json",
		"/favoriteDatas_en_an0011.json", "/favoriteDatas_ja_an0011.json",
		"/favoriteDatas_en_an0012.json", "/favoriteDatas_ja_an0012.json",
		"/favoriteDatas_en_an0013.json", "/favoriteDatas_ja_an0013.json"
})
public class favoriteDatas extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public favoriteDatas() {
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
		doGetByCode(request, response, code);
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
