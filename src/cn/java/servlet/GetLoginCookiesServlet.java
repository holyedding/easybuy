/*  1:   */package cn.java.servlet;

/*  2:   */
/*  3:   */import java.io.IOException;

/*  4:   */
import javax.servlet.ServletException;
/*  6:   */
import javax.servlet.annotation.WebServlet;
/*  7:   */
import javax.servlet.http.Cookie;
/*  8:   */
import javax.servlet.http.HttpServlet;
/*  9:   */
import javax.servlet.http.HttpServletRequest;
/* 10:   */
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
/* 11:   */
import org.json.JSONObject;

/*  5:   */
/* 12:   */
/* 13:   */@WebServlet({ "/GetLoginCookiesServlet" })
/* 14: */public class GetLoginCookiesServlet
/* 15: */extends HttpServlet
/* 16: */{
	/* 17: */protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
	/* 18: */throws ServletException, IOException
	/* 19: */{
		/* 20:27 */Cookie[] cookies = request.getCookies();
		/* 21:28 */String username = "";
		/* 22:29 */String password = "";
		/* 23:30 */if (cookies != null)
		/* 24: */{
			/* 25:31 */for (Cookie cookie : cookies)
			/* 26: */{
				/* 27:32 */String cookieName = cookie.getName();
				/* 28:33 */if ("username".equals(cookieName)) {
					/* 29:34 */username = cookie.getValue();
					/* 30:35 */} else if ("password".equals(cookieName)) {
					/* 31:36 */password = cookie.getValue();
					/* 32: */}
				/* 33: */}
			/* 34:39 */if ((!"".equals(username)) && (!"".equals(password)))
			/* 35: */{
				/* 36:40 */JSONObject json;
				try {
					json = new JSONObject("{username:" + username
							+ ",password:" + password + "}");
					response.getOutputStream().write(
							json.toString().getBytes("utf-8"));
				} catch (JSONException e) {

					// Auto-generated catch block
					e.printStackTrace();

				}
				/* 37:41 */
				/* 38: */}
			/* 39: */}
		/* 40: */}

	/* 41: */
	/* 42: */protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
	/* 43: */throws ServletException, IOException
	/* 44: */{
		/* 45:48 */doGet(request, response);
		/* 46: */}
	/* 47: */
}

/*
 * Location: C:\Users\Administrator\Workspaces\MyEclipse Professional
 * 2014\dt41_easybuy\ImportedClasses\
 * 
 * Qualified Name: cn.java.servlet.GetLoginCookiesServlet
 * 
 * JD-Core Version: 0.7.0.1
 */