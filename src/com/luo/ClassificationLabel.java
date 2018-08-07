package com.luo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassificationLabel
 */
@WebServlet(urlPatterns = {"/behaviopromotion_ja", "/behaviopromotion_en",
		   "/officialevent_ja", "/officialevent_en",
		   "/partnercpevent_ja", "/partnercpevent_en",
		   "/livesiteevent_ja", "/livesiteevent_en",
		   "/nfeventcp_ja", "/nfeventcp_en",
		   "/participatoryevent_ja", "/participatoryevent_en",
		   "/actioncampaign_ja", "/actioncampaign_en",
		   "/volunteer_ja", "/volunteer_en",
		   "/olympicchannel_ja", "/olympicchannel_en",
		   "/recommendeditems_ja", "/recommendeditems_en",
		   
		   "/behaviopromotion_ja.json", "/behaviopromotion_en.json",
		   "/officialevent_ja.json", "/officialevent_en.json",
		   "/partnercpevent_ja.json", "/partnercpevent_en.json",
		   "/livesiteevent_ja.json", "/livesiteevent_en.json",
		   "/nfeventcp_ja.json", "/nfeventcp_en.json",
		   "/participatoryevent_ja.json", "/participatoryevent_en.json",
		   "/actioncampaign_ja.json", "/actioncampaign_en.json",
		   "/volunteer_ja.json", "/volunteer_en.json",
		   "/olympicchannel_ja.json", "/olympicchannel_en.json",
		   "/recommendeditems_ja.json", "/recommendeditems_en.json"})
public class ClassificationLabel extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassificationLabel() {
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
		String lang = request.getRequestURL().indexOf("ja") > 0?"日本語":"英語";
		/*
		String kind = request.getRequestURL().indexOf("behaviopromotion") > 0?"行動促進プログラム":
			request.getRequestURL().indexOf("officialevent") > 0?"公式イベント":
			request.getRequestURL().indexOf("partnercpevent") > 0?"パートナーCP/イベント":
			request.getRequestURL().indexOf("livesiteevent") > 0?"ライブサイトイベント":
			request.getRequestURL().indexOf("nfeventcp") > 0?"NF主催イベント/CP":
			request.getRequestURL().indexOf("participatoryevent") > 0?"参画プログラムイベント":
			request.getRequestURL().indexOf("actioncampaign") > 0?"行動促進キャンペーン":
			request.getRequestURL().indexOf("volunteer") > 0?"ボランティア":
			request.getRequestURL().indexOf("olympicchannel") > 0?"Olympic Channel":
			request.getRequestURL().indexOf("recommendeditems") > 0?"おすすめグッズ":"";
			*/
		String lever = request.getRequestURL().indexOf("behaviopromotion") > 0?"01":
			request.getRequestURL().indexOf("officialevent") > 0?"02":
			request.getRequestURL().indexOf("partnercpevent") > 0?"03":
			request.getRequestURL().indexOf("livesiteevent") > 0?"04":
			request.getRequestURL().indexOf("nfeventcp") > 0?"05":
			request.getRequestURL().indexOf("participatoryevent") > 0?"06":
			request.getRequestURL().indexOf("actioncampaign") > 0?"07":
			request.getRequestURL().indexOf("volunteer") > 0?"08":
			request.getRequestURL().indexOf("olympicchannel") > 0?"09":
			request.getRequestURL().indexOf("recommendeditems") > 0?"10":"";
			doGetByLever(request, response, lever);
	}

	
    

}
