package com.luo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {
	
	public String getPath(HttpServletRequest request) {
		return request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/JSONService";
	}
	
	
	protected void doAllDate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String lang = request.getRequestURL().indexOf("ja") > 0?"日本語":"英語";
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		
		String path = getPath(request);
		
		try {
			if (lang.equals("日本語")) {
				response.getWriter().println(getJsonListAll("ja", path));
			} else {
				response.getWriter().println(getJsonListAll("en", path));
			}	
		} catch (Exception e) {
			e.printStackTrace(response.getWriter());
		}
	}
	
	protected void doGetByCode(HttpServletRequest request, HttpServletResponse response, String code) throws ServletException, IOException {
		String lang = request.getRequestURL().indexOf("ja") > 0?"日本語":"英語";
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		
		String path = getPath(request);
		
		try {
			if (lang.equals("日本語")) {
				response.getWriter().println(getJsonByCode(code, "ja", path));
			} else {
				response.getWriter().println(getJsonByCode(code, "en", path));
			}
		} catch (Exception e) {
			e.printStackTrace(response.getWriter());
		}
		
	}
	
	protected void doGetDetailByCode(HttpServletRequest request, HttpServletResponse response, String code) throws ServletException, IOException {
		String lang = request.getRequestURL().indexOf("ja") > 0?"日本語":"英語";
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		//response.setContentType("text/html;charset=UTF-8");
		
		String path = getPath(request);
		
		try {
			if (lang.equals("日本語")) {
				response.getWriter().println(getJsonDetailByCode(code, "ja", path));
			} else {
				response.getWriter().println(getJsonDetailByCode(code, "en", path));
			}
		} catch (Exception e) {
			e.printStackTrace(response.getWriter());
		}
		
	}
	
	protected void doGetCarousel(HttpServletRequest request, HttpServletResponse response, String label, String place) throws ServletException, IOException {
		String lang = request.getRequestURL().indexOf("ja") > 0?"日本語":"英語";
		String deviceType = request.getRequestURL().indexOf("pc") > 0?"pc":"sp";
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		//response.setContentType("text/html;charset=UTF-8");
		
		String path = getPath(request);
		
		try {
			if (lang.equals("日本語")) {
				response.getWriter().println(getCarouselJsonDetail(label, place, "ja", deviceType, path));
			} else {
				response.getWriter().println(getCarouselJsonDetail(label, place, "en", deviceType, path));
			}
		} catch (Exception e) {
			e.printStackTrace(response.getWriter());
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response, String kind) throws ServletException, IOException {
		String lang = request.getRequestURL().indexOf("ja") > 0?"日本語":"英語";
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		
		String path = getPath(request);
		
		try {
			if (lang.equals("日本語")) {
				response.getWriter().println(getJson(kind, "ja", path));
			} else {
				response.getWriter().println(getJson(kind, "en", path));
			}
		} catch (Exception e) {
			e.printStackTrace(response.getWriter());
		}
		
	}
	
	protected void doGetByLever(HttpServletRequest request, HttpServletResponse response, String lever) throws ServletException, IOException {
		String lang = request.getRequestURL().indexOf("ja") > 0?"日本語":"英語";
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setContentType("application/json;charset=UTF-8");
		
		String path = getPath(request);
		
		try {
			if (lang.equals("日本語")) {
				response.getWriter().println(getJsonByLever(lever, "ja", path));
			} else {
				response.getWriter().println(getJsonByLever(lever, "en", path));
			}
		} catch (Exception e) {
			e.printStackTrace(response.getWriter());
		}
		
	}
	
	public String getJsonByCode(String code, String lang, String path) {
		StringBuffer buff = new StringBuffer();
		
		DataCache cache = DataCache.getInstance(path);
		List<String> heads = cache.getHeads();
		List<List<String>> datas = cache.getListsByCode(lang, code);


		for(List<String> dt : datas) {
			buff.append("{");
			for(int i = 0;i<dt.size();i++) {
				if (i > 0) {
					buff.append(",");
				}
				if (i == 4 ||  // boolean
					i == 6 || 
					i == 8 || 
					i == 11 || 
					i == 22 || 
					i == 26 || 
					i == 27 || 
					i == 29) {
					buff.append("\"" + heads.get(i) + "\":" + Boolean.valueOf(dt.get(i)) + "");
				} else if (i == 12 ||  // 時間
							i == 13 ||
							i == 14 ||
							i == 15) {
					buff.append("\"" + heads.get(i) + "\":" + dt.get(i) + "");
				} else {
					buff.append("\"" + heads.get(i) + "\":\"" + dt.get(i) + "\"");
				}
			}
			buff.append("}");
			break;
		}
		return buff.toString();
	}
	
	public String getJsonDetailByCode(String code, String lang, String path) {
		StringBuffer buff = new StringBuffer();
		
		DataCache cache = DataCache.getInstance(path);
		List<String> heads = cache.getHeads();
		List<List<String>> datas = cache.getListsByCode(lang, code);


		for(List<String> dt : datas) {
			return "{\"result\":\"ok\",\"content\":{\"pcHtml\":\"" + getHtmlBody(dt,heads,"pc", lang ) + "\",\"spHtml\":\"" + getHtmlBody(dt,heads,"sp", lang ) + "\",\"ruleLabel\":\"" + dt.get(2) + "\",\"classificationLabel\":\"" + dt.get(3) + "\",\"code\":\"" + dt.get(0) + "\"}}";
		}
		return "";
	}
	
	private String getHtmlBody(List<String> dt, List<String> heads, String deviceType, String lang) {
		StringBuffer buff = new StringBuffer();
		buff.append("<table style=\"background-color:#fff\" border=\"1\"><tr><td>DeviceType</td><td>").append(deviceType).append("</td></tr>");
		buff.append("<tr>");
		for(int i = 0;i<dt.size();i++) {
			if (i > 0) {
				buff.append("</tr>");
			}
			if (i == 4 ||  // boolean
				i == 6 || 
				i == 8 || 
				i == 11 || 
				i == 22 || 
				i == 26 || 
				i == 27 || 
				i == 29) {
				buff.append("<td>" + heads.get(i) + "</td><td>" + Boolean.valueOf(dt.get(i)) + "</td>");
			} else if (i == 12 ||  // 時間
						i == 13 ||
						i == 14 ||
						i == 15) {
				buff.append("<td>" + heads.get(i) + "</td><td>" + dt.get(i) + "</td>");
				
			} else if (i == 5) {
				buff.append("<td>" + heads.get(i) + "</td><td><img src=\"" + dt.get(i) + "\"></img></td>");
			} else {
				buff.append("<td>" + heads.get(i) + "</td><td>" + dt.get(i) + "</td>");
			}
		}
		buff.append("</tr><tr>");
		buff.append("<td colspan=\"2\">");
		//buff.append("<a href=\"").append("/pc/ja/events/").append(dt.get(0)).append("/medal").append("\" style=\"display:block;width:200px;height:50px;background-color:#99CCFF;\"").append(">申込</a>");
		buff.append("<a href=\"").append("/").append(deviceType).append("/").append(lang).append("/everyoneMedals").append("\" style=\"display:block;width:200px;height:50px;background-color:#99CCFF;\"").append(">申込</a>");
		buff.append("</td>");
		buff.append("</tr></table><script language=\"javascript\">alert()</script>");
		return buff.toString().replace("\"", "\\\"");
	}
	
	public String getCarouselJsonDetail(String ClassificationLabel, String place, String lang, String deviceType, String path) {
		StringBuffer buff = new StringBuffer();
		
		DataCache cache = DataCache.getInstance(path);
		List<String> heads = cache.getHeads();
		List<List<String>> datas = cache.getListsByClassificationLabel(lang, ClassificationLabel, place);

		buff.append("{\"contentList\":");
		buff.append("[");
		boolean blnFirst = false;
		for(List<String> dt : datas) {
			if (!blnFirst) {
				blnFirst = true;
			} else {
				buff.append(",");
			}
			buff.append("{");
			for(int i = 0;i<dt.size();i++) {
				if (i > 0) {
					buff.append(",");
				}
				if (i == 4 || 
					i == 6 || 
					i == 8 || 
					i == 11 || 
					i == 22 || 
					i == 26 || 
					i == 27 || 
					i == 29) {
					buff.append("\"" + heads.get(i) + "\":" + Boolean.valueOf(dt.get(i)) + "");
				} else if (i == 12 ||  // 時間
						i == 13 ||
						i == 14 ||
						i == 15) {
				buff.append("\"" + heads.get(i) + "\":" + dt.get(i) + "");
				} else {
					buff.append("\"" + heads.get(i) + "\":\"" + dt.get(i) + "\"");
				}
			}
			buff.append("}");
			
		}
		buff.append("]");
		buff.append("}");
		return buff.toString();
	}

	public String getJson(String kind, String lang, String path) {
		StringBuffer buff = new StringBuffer();
		
		DataCache cache = DataCache.getInstance(path);
		List<String> heads = cache.getHeads();
		List<List<String>> datas = cache.getLists(lang, kind);

		buff.append("{\"contentList\":");
		buff.append("[");
		boolean blnFirst = false;
		for(List<String> dt : datas) {
			if (!blnFirst) {
				blnFirst = true;
			} else {
				buff.append(",");
			}
			buff.append("{");
			for(int i = 0;i<dt.size();i++) {
				if (i > 0) {
					buff.append(",");
				}
				if (i == 4 || 
					i == 6 || 
					i == 8 || 
					i == 11 || 
					i == 22 || 
					i == 26 || 
					i == 27 || 
					i == 29) {
					buff.append("\"" + heads.get(i) + "\":" + Boolean.valueOf(dt.get(i)) + "");
				} else if (i == 12 ||  // 時間
						i == 13 ||
						i == 14 ||
						i == 15) {
				buff.append("\"" + heads.get(i) + "\":" + dt.get(i) + "");
				} else {
					buff.append("\"" + heads.get(i) + "\":\"" + dt.get(i) + "\"");
				}
			}
			buff.append("}");
			
		}
		buff.append("]");
		buff.append("}");
		return buff.toString();
	}
	
	public String getJsonByLever(String lever, String lang, String path) {
		StringBuffer buff = new StringBuffer();
		
		DataCache cache = DataCache.getInstance(path);
		List<String> heads = cache.getHeads();
		List<List<String>> datas = cache.getListsByLever(lang, lever);

		buff.append("{\"contentList\":");
		buff.append("[");
		boolean blnFirst = false;
		for(List<String> dt : datas) {
			if (!blnFirst) {
				blnFirst = true;
			} else {
				buff.append(",");
			}
			buff.append("{");
			for(int i = 0;i<dt.size();i++) {
				if (i > 0) {
					buff.append(",");
				}
				if (i == 4 || 
					i == 6 || 
					i == 8 || 
					i == 11 || 
					i == 22 || 
					i == 26 || 
					i == 27 || 
					i == 29) {
					buff.append("\"" + heads.get(i) + "\":" + Boolean.valueOf(dt.get(i)) + "");
				} else if (i == 12 ||  // 時間
						i == 13 ||
						i == 14 ||
						i == 15) {
				buff.append("\"" + heads.get(i) + "\":" + dt.get(i) + "");
				} else {
					buff.append("\"" + heads.get(i) + "\":\"" + dt.get(i) + "\"");
				}
			}
			buff.append("}");
			
		}
		buff.append("]");
		buff.append("}");
		return buff.toString();
	}
	
	public String getJsonListAll(String lang, String path) {
		StringBuffer buff = new StringBuffer();
		buff.append("{\"contentList\":");
		buff.append(getJsonList(lang, path));
		buff.append("}");
		return buff.toString();
	}
	public String getJsonList(String lang, String path) {
		StringBuffer buff = new StringBuffer();
		
		DataCache cache = DataCache.getInstance(path);
		List<String> heads = cache.getHeads();
		List<List<String>> datas = cache.getLists(lang);

		buff.append("[");
		boolean blnFirst = false;
		for(List<String> dt : datas) {
			if (!blnFirst) {
				blnFirst = true;
			} else {
				buff.append(",");
			}
			buff.append("{");
			for(int i = 0;i<dt.size();i++) {
				if (i > 0) {
					buff.append(",");
				}
				if (i == 4 || 
					i == 6 || 
					i == 8 || 
					i == 11 || 
					i == 22 || 
					i == 26 || 
					i == 27 || 
					i == 29) {
					buff.append("\"" + heads.get(i) + "\":" + Boolean.valueOf(dt.get(i)) + "");
				} else if (i == 12 ||  // 時間
						i == 13 ||
						i == 14 ||
						i == 15) {
				buff.append("\"" + heads.get(i) + "\":" + dt.get(i) + "");
				} else {
					buff.append("\"" + heads.get(i) + "\":\"" + dt.get(i) + "\"");
				}
			}
			buff.append("}");
			
		}
		buff.append("]");
		return buff.toString();
	}
}
