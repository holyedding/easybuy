/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import cn.java.model.Users;
/*  4:   */ import cn.java.service.AccountRigistService;
/*  5:   */ import cn.java.service.impl.AccountRigistServiceImpl;

/*  6:   */ import java.io.IOException;

/*  7:   */ import javax.servlet.ServletException;
/*  8:   */ import javax.servlet.annotation.WebServlet;
/*  9:   */ import javax.servlet.http.HttpServlet;
/* 10:   */ import javax.servlet.http.HttpServletRequest;
/* 11:   */ import javax.servlet.http.HttpServletResponse;
/* 12:   */ 
/* 13:   */ @WebServlet({"/AccountRigist"})
/* 14:   */ public class AccountRigistServlet
/* 15:   */   extends HttpServlet
/* 16:   */ {
/* 17:20 */   AccountRigistService arsi = new AccountRigistServiceImpl();
/* 18:   */   
/* 19:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 20:   */     throws ServletException, IOException
/* 21:   */   {
/* 22:27 */     String username = request.getParameter("username");
/* 23:28 */     String password = request.getParameter("password");
/* 24:29 */     String email = request.getParameter("email");
/* 25:30 */     String phone = request.getParameter("phone");
/* 26:31 */     int smsCode = Integer.parseInt(request.getParameter("smsCode"));
/* 27:32 */     Users user = new Users(username, password, email, phone);
/* 28:   */     try
/* 29:   */     {
/* 30:34 */       boolean flag = this.arsi.rigist(user);
/* 31:35 */       boolean flag1 = this.arsi.isSmsCodeExists(phone, smsCode);
/* 32:36 */       if ((flag) && (flag1)) {
/* 33:37 */         response.sendRedirect("pages/front/Login.jsp");
/* 34:   */       } else {
/* 35:39 */         response.sendRedirect("pages/front/Rigist.jsp");
/* 36:   */       }
/* 37:   */     }
/* 38:   */     catch (Exception e)
/* 39:   */     {
/* 40:42 */       e.printStackTrace();
/* 41:   */     }
/* 42:   */   }
/* 43:   */   
/* 44:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 45:   */     throws ServletException, IOException
/* 46:   */   {
/* 47:52 */     doGet(request, response);
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.AccountRigistServlet
 * JD-Core Version:    0.7.0.1
 */