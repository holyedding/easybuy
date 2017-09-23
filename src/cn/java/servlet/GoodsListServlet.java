/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import cn.java.service.GoodsListService;
/*  4:   */ import cn.java.service.NewsService;
/*  5:   */ import cn.java.service.impl.GoodsListServiceImpl;
/*  6:   */ import cn.java.service.impl.NewsServiceImpl;
/*  7:   */ import java.io.IOException;
/*  8:   */ import java.util.List;
/*  9:   */ import java.util.Map;
/* 10:   */ import javax.servlet.RequestDispatcher;
/* 11:   */ import javax.servlet.ServletException;
/* 12:   */ import javax.servlet.annotation.WebServlet;
/* 13:   */ import javax.servlet.http.HttpServlet;
/* 14:   */ import javax.servlet.http.HttpServletRequest;
/* 15:   */ import javax.servlet.http.HttpServletResponse;
/* 16:   */ import javax.servlet.http.HttpSession;
/* 17:   */ 
/* 18:   */ @WebServlet({"/GoodsListServlet"})
/* 19:   */ public class GoodsListServlet
/* 20:   */   extends HttpServlet
/* 21:   */ {
/* 22:24 */   private GoodsListService gls = new GoodsListServiceImpl();
/* 23:26 */   private NewsService ns = new NewsServiceImpl();
/* 24:   */   
/* 25:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 26:   */     throws ServletException, IOException
/* 27:   */   {
/* 28:   */     try
/* 29:   */     {
/* 30:35 */       List<Map<String, Object>> list = this.gls.goodList(0L, "0");
/* 31:   */       
/* 32:   */ 
/* 33:   */ 
/* 34:39 */       List<Map<String, Object>> list1 = this.gls.goodList(0L, "1");
/* 35:   */       
/* 36:   */ 
/* 37:   */ 
/* 38:   */ 
/* 39:44 */       List<Map<String, Object>> lists = this.ns.news();
/* 40:45 */       HttpSession session = request.getSession();
/* 41:46 */       session.setAttribute("list", list);
/* 42:47 */       session.setAttribute("lists", lists);
/* 43:48 */       session.setAttribute("list1", list1);
/* 44:49 */       request.getRequestDispatcher("pages/front/Index.jsp").forward(
/* 45:50 */         request, response);
/* 46:   */     }
/* 47:   */     catch (Exception e)
/* 48:   */     {
/* 49:52 */       e.printStackTrace();
/* 50:   */     }
/* 51:   */   }
/* 52:   */   
/* 53:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 54:   */     throws ServletException, IOException
/* 55:   */   {
/* 56:58 */     doGet(request, response);
/* 57:   */   }
/* 58:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.GoodsListServlet
 * JD-Core Version:    0.7.0.1
 */