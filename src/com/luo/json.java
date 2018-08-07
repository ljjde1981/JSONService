package com.luo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class json
 */
@WebServlet(urlPatterns = {"/json_ja_01", "/json_en_01",
						   "/json_ja_02", "/json_en_02",
						   "/json_ja_03", "/json_en_03",
						   "/json_ja_04", "/json_en_04",
						   "/json_ja_05", "/json_en_05",
						   "/json_ja_06", "/json_en_06",
						   "/json_ja_07", "/json_en_07",
						   
						   "/json_ja_01.json", "/json_en_01.json",
						   "/json_ja_02.json", "/json_en_02.json",
						   "/json_ja_03.json", "/json_en_03.json",
						   "/json_ja_04.json", "/json_en_04.json",
						   "/json_ja_05.json", "/json_en_05.json",
						   "/json_ja_06.json", "/json_en_06.json",
						   "/json_ja_07.json", "/json_en_07.json"})
public class json extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public json() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
		
		response.addCookie(new Cookie("abc","abc"));
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		
		String path = this.getPath(request);
	
		if (lang.equals("日本語")) {
			response.getWriter().println(getJsonJP(lang, path));
		} else {
			response.getWriter().println(getJsonEn(lang, path));
		}
	}

	
	public String getJsonJP(String lang, String path) {
		StringBuffer buff = new StringBuffer();
		buff.append("{");
		buff.append("\"panelAs\":");
		
		
		buff.append(super.getJsonList("ja", path));
		
		buff.append("			,");
		buff.append("	\"panelBs\":[{");
		buff.append("		\"Code\":\"BXXXXXXXX0" + "\",");
		buff.append("		\"Name\":\"XXXXXXXX\",");
		buff.append("		\"RuleLabel\":\"XXXXXXXX\",");
		buff.append("		\"ClassificationLabel\":\"01\",");
		buff.append("		\"IsEnableA\":true,");
		buff.append("		\"ThumbnailPathA\":\"http://visualcloud.jp/JSONService/img/001.jpg\",");
		buff.append("		\"IsEnableB\":false,");
		buff.append("		\"ThumbnailPathB\":\"http://visualcloud.jp/JSONService/img/001.jpg\",");
		buff.append("		\"IsEnableC\":false,");
		buff.append("		\"ThumbnailPathC\":\"http://visualcloud.jp/JSONService/img/001.jpg\",");
		buff.append("		\"DestinationUrl\":\"https//www.xxx.xxx\",");
		buff.append("		\"ReleaseStatus\":\"\",");
		buff.append("		\"ReleaseStartDateTime\":1531065600000,");
		buff.append("		\"ReleaseEndDateTime\":1562601638000,");
		buff.append("		\"EventStartDateTime\":1531065600000,");
		buff.append("		\"EventEndDateTime\":1562601638000,");
		buff.append("		\"Venue\":\"01\",");
		buff.append("		\"Tag01\":\"サッカー\",");
		buff.append("		\"Tag02\":\"\",");
		buff.append("		\"Tag03\":\"\",");
		buff.append("		\"Tag04\":\"\",");
		buff.append("		\"Tag05\":\"\",");
		buff.append("		\"RelatedSystemFlag\":true,");
		buff.append("		\"ContentListDescription1\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription2\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription3\":\"XXXXXXXX\",");
		buff.append("		\"Recommend\":true,");
		buff.append("		\"CrmApplicationIsActive\":false,");
		buff.append("		\"CatchCopy\":\"XXXXXXXX\"");
		buff.append("			}],");
		buff.append("	\"panelCs\":[{");
		buff.append("		\"Code\":\"CXXXXXXXX1\",");
		buff.append("		\"Name\":\"CXXXXXXXX1\",");
		buff.append("		\"RuleLabel\":\"XXXXXXXX\",");
		buff.append("		\"ClassificationLabel\":\"01\",");
		buff.append("		\"IsEnableA\":true,");
		buff.append("		\"ThumbnailPathA\":\"http://visualcloud.jp/JSONService/img/002.jpg\",");
		buff.append("		\"IsEnableB\":false,");
		buff.append("		\"ThumbnailPathB\":\"http://visualcloud.jp/JSONService/img/002.jpg\",");
		buff.append("		\"IsEnableC\":false,");
		buff.append("		\"ThumbnailPathC\":\"http://visualcloud.jp/JSONService/img/002.jpg\",");
		buff.append("		\"DestinationUrl\":\"https//www.xxx.xxx\",");
		buff.append("		\"ReleaseStatus\":\"\",");
		buff.append("		\"ReleaseStartDateTime\":1531065600000,");
		buff.append("		\"ReleaseEndDateTime\":1562601638000,");
		buff.append("		\"EventStartDateTime\":1531065600000,");
		buff.append("		\"EventEndDateTime\":1562601638000,");
		buff.append("		\"Venue\":\"01\",");
		buff.append("		\"Tag01\":\"サッカー\",");
		buff.append("		\"Tag02\":\"\",");
		buff.append("		\"Tag03\":\"\",");
		buff.append("		\"Tag04\":\"\",");
		buff.append("		\"Tag05\":\"\",");
		buff.append("		\"RelatedSystemFlag\":true,");
		buff.append("		\"ContentListDescription1\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription2\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription3\":\"XXXXXXXX\",");
		buff.append("		\"Recommend\":true,");
		buff.append("		\"CrmApplicationIsActive\":false,");
		buff.append("		\"CatchCopy\":\"XXXXXXXX\"");
		buff.append("	},");
		
		buff.append("	{");
		buff.append("		\"Code\":\"CXXXXXXXX2\",");
		buff.append("		\"Name\":\"CXXXXXXXX2\",");
		buff.append("		\"RuleLabel\":\"XXXXXXXX\",");
		buff.append("		\"ClassificationLabel\":\"01\",");
		buff.append("		\"IsEnableA\":true,");
		buff.append("		\"ThumbnailPathA\":\"http://visualcloud.jp/JSONService/img/003.jpg\",");
		buff.append("		\"IsEnableB\":false,");
		buff.append("		\"ThumbnailPathB\":\"http://visualcloud.jp/JSONService/img/003.jpg\",");
		buff.append("		\"IsEnableC\":false,");
		buff.append("		\"ThumbnailPathC\":\"http://visualcloud.jp/JSONService/img/003.jpg\",");
		buff.append("		\"DestinationUrl\":\"https//www.xxx.xxx\",");
		buff.append("		\"ReleaseStatus\":\"\",");
		buff.append("		\"ReleaseStartDateTime\":1531065600000,");
		buff.append("		\"ReleaseEndDateTime\":1562601638000,");
		buff.append("		\"EventStartDateTime\":1531065600000,");
		buff.append("		\"EventEndDateTime\":1562601638000,");
		buff.append("		\"Venue\":\"01\",");
		buff.append("		\"Tag01\":\"サッカー\",");
		buff.append("		\"Tag02\":\"\",");
		buff.append("		\"Tag03\":\"\",");
		buff.append("		\"Tag04\":\"\",");
		buff.append("		\"Tag05\":\"\",");
		buff.append("		\"RelatedSystemFlag\":true,");
		buff.append("		\"ContentListDescription1\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription2\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription3\":\"XXXXXXXX\",");
		buff.append("		\"Recommend\":true,");
		buff.append("		\"CrmApplicationIsActive\":false,");
		buff.append("		\"CatchCopy\":\"XXXXXXXX\"");
		buff.append("	}]");
		buff.append("}");
		return buff.toString();
	}

	public String getJsonEn(String lang, String path) {
		StringBuffer buff = new StringBuffer();
		buff.append("{");
		buff.append("\"panelAs\":");
		
		buff.append(super.getJsonList("en", path));
		
		buff.append("			,");
		buff.append("	\"panelBs\":[{");
		buff.append("		\"Code\":\"XXXXXXXX\",");
		buff.append("		\"Name\":\"XXXXXXXX\",");
		buff.append("		\"RuleLabel\":\"XXXXXXXX\",");
		buff.append("		\"ClassificationLabel\":\"01\",");
		buff.append("		\"IsEnableA\":true,");
		buff.append("		\"ThumbnailPathA\":\"http://visualcloud.jp/JSONService/img/004.jpg\",");
		buff.append("		\"IsEnableB\":false,");
		buff.append("		\"ThumbnailPathB\":\"http://visualcloud.jp/JSONService/img/004.jpg\",");
		buff.append("		\"IsEnableC\":false,");
		buff.append("		\"ThumbnailPathC\":\"http://visualcloud.jp/JSONService/img/004.jpg\",");
		buff.append("		\"DestinationUrl\":\"https://www.xxx.xxx\",");
		buff.append("		\"ReleaseStatus\":\"\",");
		buff.append("		\"ReleaseStartDateTime\":1531065600000,");
		buff.append("		\"ReleaseEndDateTime\":1562601638000,");
		buff.append("		\"EventStartDateTime\":1531065600000,");
		buff.append("		\"EventEndDateTime\":1562601638000,");
		buff.append("		\"Venue\":\"01\",");
		buff.append("		\"Tag01\":\"サッカー\",");
		buff.append("		\"Tag02\":\"\",");
		buff.append("		\"Tag03\":\"\",");
		buff.append("		\"Tag04\":\"\",");
		buff.append("		\"Tag05\":\"\",");
		buff.append("		\"RelatedSystemFlag\":true,");
		buff.append("		\"ContentListDescription1\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription2\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription3\":\"XXXXXXXX\",");
		buff.append("		\"Recommend\":true,");
		buff.append("		\"CrmApplicationIsActive\":false,");
		buff.append("		\"CatchCopy\":\"XXXXXXXX\"");
		buff.append("			}],");
		buff.append("	\"panelCs\":[{");
		buff.append("		\"Code\":\"cXXXXXXXX1\",");
		buff.append("		\"Name\":\"cXXXXXXXX1\",");
		buff.append("		\"RuleLabel\":\"XXXXXXXX\",");
		buff.append("		\"ClassificationLabel\":\"01\",");
		buff.append("		\"IsEnableA\":true,");
		buff.append("		\"ThumbnailPathA\":\"http://visualcloud.jp/JSONService/img/005.jpg\",");
		buff.append("		\"IsEnableB\":false,");
		buff.append("		\"ThumbnailPathB\":\"http://visualcloud.jp/JSONService/img/005.jpg\",");
		buff.append("		\"IsEnableC\":false,");
		buff.append("		\"ThumbnailPathC\":\"http://visualcloud.jp/JSONService/img/005.jpg\",");
		buff.append("		\"DestinationUrl\":\"https//www.xxx.xxx\",");
		buff.append("		\"ReleaseStatus\":\"\",");
		buff.append("		\"ReleaseStartDateTime\":1531065600000,");
		buff.append("		\"ReleaseEndDateTime\":1562601638000,");
		buff.append("		\"EventStartDateTime\":1531065600000,");
		buff.append("		\"EventEndDateTime\":1562601638000,");
		buff.append("		\"Venue\":\"01\",");
		buff.append("		\"Tag01\":\"サッカー\",");
		buff.append("		\"Tag02\":\"\",");
		buff.append("		\"Tag03\":\"\",");
		buff.append("		\"Tag04\":\"\",");
		buff.append("		\"Tag05\":\"\",");
		buff.append("		\"RelatedSystemFlag\":true,");
		buff.append("		\"ContentListDescription1\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription2\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription3\":\"XXXXXXXX\",");
		buff.append("		\"Recommend\":true,");
		buff.append("		\"CrmApplicationIsActive\":false,");
		buff.append("		\"CatchCopy\":\"XXXXXXXX\"");
		buff.append("	},");
		
		buff.append("	{");
		buff.append("		\"Code\":\"cXXXXXXXX2\",");
		buff.append("		\"Name\":\"cXXXXXXXX2\",");
		buff.append("		\"RuleLabel\":\"XXXXXXXX\",");
		buff.append("		\"ClassificationLabel\":\"01\",");
		buff.append("		\"IsEnableA\":true,");
		buff.append("		\"ThumbnailPathA\":\"http://visualcloud.jp/JSONService/img/006.jpg\",");
		buff.append("		\"IsEnableB\":false,");
		buff.append("		\"ThumbnailPathB\":\"http://visualcloud.jp/JSONService/img/006.jpg\",");
		buff.append("		\"IsEnableC\":false,");
		buff.append("		\"ThumbnailPathC\":\"http://visualcloud.jp/JSONService/img/006.jpg\",");
		buff.append("		\"DestinationUrl\":\"https//www.xxx.xxx\",");
		buff.append("		\"ReleaseStatus\":\"\",");
		buff.append("		\"ReleaseStartDateTime\":1531065600000,");
		buff.append("		\"ReleaseEndDateTime\":1562601638000,");
		buff.append("		\"EventStartDateTime\":1531065600000,");
		buff.append("		\"EventEndDateTime\":1562601638000,");
		buff.append("		\"Venue\":\"01\",");
		buff.append("		\"Tag01\":\"サッカー\",");
		buff.append("		\"Tag02\":\"\",");
		buff.append("		\"Tag03\":\"\",");
		buff.append("		\"Tag04\":\"\",");
		buff.append("		\"Tag05\":\"\",");
		buff.append("		\"RelatedSystemFlag\":true,");
		buff.append("		\"ContentListDescription1\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription2\":\"XXXXXXXX\",");
		buff.append("		\"ContentListDescription3\":\"XXXXXXXX\",");
		buff.append("		\"Recommend\":true,");
		buff.append("		\"CrmApplicationIsActive\":false,");
		buff.append("		\"CatchCopy\":\"XXXXXXXX\"");
		buff.append("	}]");
		buff.append("}");
		return buff.toString();
	}

	
}
