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
/* 12:   */ import org.json.JSONException;
/* 13:   */ import org.json.JSONObject;
/* 14:   */ 
/* 15:   */ @WebServlet({"/AccountRigistUsername"})
/* 16:   */ public class AccountRigistUsernameServlet
/* 17:   */   extends HttpServlet
/* 18:   */ {
/* 19:22 */   private AccountRigistService arsi = new AccountRigistServiceImpl();
/* 20:   */   
/* 21:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 22:   */     throws ServletException, IOException
/* 23:   */   {
/* 24:   */     try
/* 25:   */     {
/* 26:33 */       String username = request.getParameter("username");
/* 27:34 */       boolean flag = this.arsi.isUsernameExists(username);
/* 28:35 */       JSONObject json = new JSONObject("{flag:" + flag + "}");
/* 29:36 */       response.getOutputStream().write(json.toString().getBytes("utf-8"));
/* 30:   */     }
/* 31:   */     catch (JSONException e)
/* 32:   */     {
/* 33:38 */       e.printStackTrace();
/* 34:   */     }
/* 35:   */     catch (Exception e)
/* 36:   */     {
/* 37:41 */       e.printStackTrace();
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 42:   */     throws ServletException, IOException
/* 43:   */   {
/* 44:48 */     doGet(request, response);
/* 45:   */   }
/* 46:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.AccountRigistUsernameServlet
 * JD-Core Version:    0.7.0.1
 */