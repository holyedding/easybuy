/*  1:   */package cn.java.servlet;

/*  2:   */
/*  3:   *//*  6:   */import java.io.IOException;

/*  8:   */
import javax.servlet.ServletException;
/* 10:   */
import javax.servlet.annotation.WebServlet;
/* 11:   */
import javax.servlet.http.HttpServlet;
/* 12:   */
import javax.servlet.http.HttpServletRequest;
/* 13:   */
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
/* 14:   */
import org.json.JSONObject;

import cn.java.service.AccountRigistService;
/*  4:   */
import cn.java.service.impl.AccountRigistServiceImpl;
/*  5:   */
import cn.java.utils.HttpClientUtil;

/*  7:   */
/*  9:   */
/* 15:   */
/* 16:   */@WebServlet({ "/AccountSmsServlet" })
/* 17: */public class AccountSmsServlet
/* 18: */extends HttpServlet
/* 19: */{
	/* 20:22 */AccountRigistService arsi = new AccountRigistServiceImpl();
	/* 21:25 */private static String Uid = "holyedding";
	/* 22:28 */private static String Key = "bc18ce57da6fab50eb21";

	/* 23: */
	/* 24: */protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
	/* 25: */throws ServletException, IOException
	/* 26: */{
		/* 27:32 */String phone = request.getParameter("phone");
		/* 28:33 */HttpClientUtil client = HttpClientUtil.getInstance();
		/* 29:34 */int smsCode = (int) (Math.random() * 1000000.0D);
		/* 30: */try
		/* 31: */{
			/* 32:36 */if (this.arsi.isSmsCodeExists(phone, smsCode)) {
				/* 33:37 */this.arsi.updateEmsCode(smsCode, phone);
				/* 34: */} else {
				/* 35:39 */this.arsi.rigistEmsCode(smsCode, phone);
				/* 36: */}
			/* 37: */}
		/* 38: */catch (Exception e)
		/* 39: */{
			/* 40:42 */e.printStackTrace();
			/* 41: */}
		/* 42:44 */int result = client.sendMsgUtf8(Uid, Key, smsCode, phone);
		/* 43:45 */if (result > 0) {
			/* 44:46 */System.out.println("UTF8成功发送条数==" + result);
			/* 45: */} else {
			/* 46:48 */System.out.println(client.getErrorMsg(result));
			/* 47: */}
		/* 48:50 */JSONObject json;
		try {
			json = new JSONObject("{result:" + result + ",smsText:" + smsCode
					+ "}");
			response.getOutputStream().write(json.toString().getBytes("utf-8"));
		} catch (JSONException e) {

			// Auto-generated catch block
			e.printStackTrace();

		}
		/* 49:51 */
		/* 50: */}

	/* 51: */
	/* 52: */protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
	/* 53: */throws ServletException, IOException
	/* 54: */{
		/* 55:60 */doGet(request, response);
		/* 56: */}
	/* 57: */
}

/*
 * Location: C:\Users\Administrator\Workspaces\MyEclipse Professional
 * 2014\dt41_easybuy\ImportedClasses\
 * 
 * Qualified Name: cn.java.servlet.AccountSmsServlet
 * 
 * JD-Core Version: 0.7.0.1
 */