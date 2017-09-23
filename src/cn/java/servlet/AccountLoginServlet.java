/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import cn.java.service.AccountLoginService;
/*  4:   */ import cn.java.service.impl.AccountLoginServiceImpl;
/*  5:   */ import java.io.IOException;
/*  6:   */ import javax.servlet.ServletException;
/*  7:   */ import javax.servlet.annotation.WebServlet;
/*  8:   */ import javax.servlet.http.Cookie;
/*  9:   */ import javax.servlet.http.HttpServlet;
/* 10:   */ import javax.servlet.http.HttpServletRequest;
/* 11:   */ import javax.servlet.http.HttpServletResponse;
/* 12:   */ import javax.servlet.http.HttpSession;
/* 13:   */ 
/* 14:   */ @WebServlet({"/AccountLoginServlet"})
/* 15:   */ public class AccountLoginServlet
/* 16:   */   extends HttpServlet
/* 17:   */ {
/* 18:21 */   AccountLoginService alsi = new AccountLoginServiceImpl();
/* 19:   */   
/* 20:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 21:   */     throws ServletException, IOException
/* 22:   */   {
/* 23:   */     try
/* 24:   */     {
/* 25:32 */       String username = request.getParameter("username");
/* 26:33 */       String password = request.getParameter("password");
/* 27:34 */       String check = request.getParameter("check");
/* 28:35 */       boolean flag = this.alsi.login(username, password);
/* 29:36 */       if ("on".equals(check))
/* 30:   */       {
/* 31:37 */         Cookie cookie1 = new Cookie("username", username);
/* 32:38 */         cookie1.setMaxAge(86400);
/* 33:39 */         response.addCookie(cookie1);
/* 34:40 */         Cookie cookie2 = new Cookie("password", password);
/* 35:41 */         cookie2.setMaxAge(86400);
/* 36:42 */         response.addCookie(cookie2);
/* 37:   */       }
/* 38:44 */       if (flag)
/* 39:   */       {
/* 40:45 */         HttpSession session = request.getSession();
/* 41:46 */         session.setAttribute("username", username);
/* 42:47 */         response.sendRedirect("index.jsp");
/* 43:   */       }
/* 44:   */       else
/* 45:   */       {
/* 46:49 */         response.sendRedirect("pages/front/Login.jsp");
/* 47:   */       }
/* 48:   */     }
/* 49:   */     catch (Exception e)
/* 50:   */     {
/* 51:54 */       e.printStackTrace();
/* 52:   */     }
/* 53:   */   }
/* 54:   */   
/* 55:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 56:   */     throws ServletException, IOException
/* 57:   */   {
/* 58:61 */     doGet(request, response);
/* 59:   */   }
/* 60:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.AccountLoginServlet
 * JD-Core Version:    0.7.0.1
 */