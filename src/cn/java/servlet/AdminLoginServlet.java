/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import cn.java.service.AdminLoginService;
/*  4:   */ import cn.java.service.impl.AdminLoginServiceImpl;
/*  5:   */ import java.io.IOException;
/*  6:   */ import javax.servlet.RequestDispatcher;
/*  7:   */ import javax.servlet.ServletException;
/*  8:   */ import javax.servlet.annotation.WebServlet;
/*  9:   */ import javax.servlet.http.HttpServlet;
/* 10:   */ import javax.servlet.http.HttpServletRequest;
/* 11:   */ import javax.servlet.http.HttpServletResponse;
/* 12:   */ import javax.servlet.http.HttpSession;
/* 13:   */ 
/* 14:   */ @WebServlet({"/AdminLoginServlet"})
/* 15:   */ public class AdminLoginServlet
/* 16:   */   extends HttpServlet
/* 17:   */ {
/* 18:20 */   private AdminLoginService als = new AdminLoginServiceImpl();
/* 19:   */   
/* 20:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 21:   */     throws ServletException, IOException
/* 22:   */   {
/* 23:   */     try
/* 24:   */     {
/* 25:28 */       String adminName = request.getParameter("adminName");
/* 26:29 */       String password = request.getParameter("password");
/* 27:30 */       boolean flag = this.als.login(adminName, password);
/* 28:31 */       if (flag)
/* 29:   */       {
/* 30:32 */         HttpSession session = request.getSession();
/* 31:33 */         session.removeAttribute("adminName");
/* 32:34 */         session.setAttribute("adminName", adminName);
/* 33:35 */         request.getRequestDispatcher("/pages/admin/Index.jsp").forward(request, response);
/* 34:   */       }
/* 35:   */       else
/* 36:   */       {
/* 37:37 */         request.getRequestDispatcher("pages/admin/Login.jsp").forward(request, response);
/* 38:   */       }
/* 39:   */     }
/* 40:   */     catch (Exception e)
/* 41:   */     {
/* 42:42 */       e.printStackTrace();
/* 43:   */     }
/* 44:   */   }
/* 45:   */   
/* 46:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 47:   */     throws ServletException, IOException
/* 48:   */   {
/* 49:53 */     doGet(request, response);
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.AdminLoginServlet
 * JD-Core Version:    0.7.0.1
 */