/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import cn.java.service.AccountRigistService;
/*  4:   */ import cn.java.service.impl.AccountRigistServiceImpl;
/*  5:   */ import java.io.IOException;
/*  6:   */ import javax.servlet.ServletException;
/*  7:   */ import javax.servlet.ServletOutputStream;
/*  8:   */ import javax.servlet.annotation.WebServlet;
/*  9:   */ import javax.servlet.http.HttpServlet;
/* 10:   */ import javax.servlet.http.HttpServletRequest;
/* 11:   */ import javax.servlet.http.HttpServletResponse;
/* 12:   */ import org.json.JSONObject;
/* 13:   */ 
/* 14:   */ @WebServlet({"/AccountRigstSmsCodeServlet"})
/* 15:   */ public class AccountRigstSmsCodeServlet
/* 16:   */   extends HttpServlet
/* 17:   */ {
/* 18:21 */   AccountRigistService arsi = new AccountRigistServiceImpl();
/* 19:   */   
/* 20:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 21:   */     throws ServletException, IOException
/* 22:   */   {
/* 23:   */     try
/* 24:   */     {
/* 25:29 */       String phone = request.getParameter("phone");
/* 26:30 */       int smsCode = Integer.parseInt(request.getParameter("smsCode"));
/* 27:31 */       boolean flag = this.arsi.isSmsCodeExists(phone, smsCode);
/* 28:32 */       JSONObject json = new JSONObject("{flag:+" + flag + "}");
/* 29:33 */       response.getOutputStream().write(json.toString().getBytes("utf-8"));
/* 30:   */     }
/* 31:   */     catch (NumberFormatException e)
/* 32:   */     {
/* 33:37 */       e.printStackTrace();
/* 34:   */     }
/* 35:   */     catch (Exception e)
/* 36:   */     {
/* 37:42 */       e.printStackTrace();
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 42:   */     throws ServletException, IOException
/* 43:   */   {
/* 44:53 */     doGet(request, response);
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.AccountRigstSmsCodeServlet
 * JD-Core Version:    0.7.0.1
 */