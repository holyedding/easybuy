/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import cn.java.utils.VerifyCodeUtils;
/*  4:   */ import java.io.IOException;
/*  5:   */ import javax.servlet.Servlet;
/*  6:   */ import javax.servlet.ServletException;
/*  7:   */ import javax.servlet.annotation.WebServlet;
/*  8:   */ import javax.servlet.http.HttpServlet;
/*  9:   */ import javax.servlet.http.HttpServletRequest;
/* 10:   */ import javax.servlet.http.HttpServletResponse;
/* 11:   */ import javax.servlet.http.HttpSession;
/* 12:   */ 
/* 13:   */ @WebServlet(name="authimage", urlPatterns={"/authimage"})
/* 14:   */ public class AuthImageServlet
/* 15:   */   extends HttpServlet
/* 16:   */   implements Servlet
/* 17:   */ {
/* 18:   */   static final long serialVersionUID = 1L;
/* 19:   */   
/* 20:   */   public void service(HttpServletRequest request, HttpServletResponse response)
/* 21:   */     throws ServletException, IOException
/* 22:   */   {
/* 23:26 */     response.setHeader("Pragma", "No-cache");
/* 24:27 */     response.setHeader("Cache-Control", "no-cache");
/* 25:28 */     response.setDateHeader("Expires", 0L);
/* 26:29 */     response.setContentType("image/jpeg");
/* 27:   */     
/* 28:   */ 
/* 29:32 */     String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
/* 30:   */     
/* 31:34 */     HttpSession session = request.getSession(true);
/* 32:   */     
/* 33:36 */     session.removeAttribute("verCode");
/* 34:37 */     session.setAttribute("verCode", verifyCode.toLowerCase());
/* 35:   */     
/* 36:39 */     int w = 200;int h = 39;
/* 37:40 */     VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.AuthImageServlet
 * JD-Core Version:    0.7.0.1
 */