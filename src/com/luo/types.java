package com.luo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class types
 */
@WebServlet("/types")
public class types extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public types() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().println(getTyps());
	}

	public String getTyps() {
		StringBuffer buff = new StringBuffer();
		buff.append("{");
		buff.append("	\"classlabel\":[");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"01\",");
		buff.append("			\"LogicalName\":\"行動促進プログラム\",");
		buff.append("			\"Classification\":\"01\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"02\",");
		buff.append("			\"LogicalName\":\"公式イベント\",");
		buff.append("			\"Classification\":\"01\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"03\",");
		buff.append("			\"LogicalName\":\"パートナーCP/イベント\",");
		buff.append("			\"Classification\":\"01\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"04\",");
		buff.append("			\"LogicalName\":\"ライブサイトイベント\",");
		buff.append("			\"Classification\":\"01\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"05\",");
		buff.append("			\"LogicalName\":\"NF主催イベント/CP\",");
		buff.append("			\"Classification\":\"01\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"06\",");
		buff.append("			\"LogicalName\":\"参画プログラムイベント\",");
		buff.append("			\"Classification\":\"01\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"07\",");
		buff.append("			\"LogicalName\":\"行動促進キャンペーン\",");
		buff.append("			\"Classification\":\"02\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"08\",");
		buff.append("			\"LogicalName\":\"ボランティア\",");
		buff.append("			\"Classification\":\"04\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"09\",");
		buff.append("			\"LogicalName\":\"OlympicChannel\",");
		buff.append("			\"Classification\":\"04\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"10\",");
		buff.append("			\"LogicalName\":\"おすすめグッズ\",");
		buff.append("			\"Classification\":\"04\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"11\",");
		buff.append("			\"LogicalName\":\"おすすめチケット\",");
		buff.append("			\"Classification\":\"03\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"12\",");
		buff.append("			\"LogicalName\":\"チケット特集\",");
		buff.append("			\"Classification\":\"03\"");
		buff.append("		},");
		buff.append("		{");
		buff.append("			\"PhysicalName\":\"13\",");
		buff.append("			\"LogicalName\":\"お知らせ\",");
		buff.append("			\"Classification\":\"04\"");
		buff.append("		}");
		buff.append("	]");
		buff.append("}");
		return buff.toString();
	}

}
