/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import cn.java.service.GoodsListService;
/*  4:   */ import cn.java.service.impl.GoodsListServiceImpl;
/*  5:   */ import java.io.IOException;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ import javax.servlet.ServletException;
/*  9:   */ import javax.servlet.ServletOutputStream;
/* 10:   */ import javax.servlet.annotation.WebServlet;
/* 11:   */ import javax.servlet.http.HttpServlet;
/* 12:   */ import javax.servlet.http.HttpServletRequest;
/* 13:   */ import javax.servlet.http.HttpServletResponse;
/* 14:   */ import org.json.JSONObject;
/* 15:   */ 
/* 16:   */ @WebServlet({"/NavMenuListServlet"})
/* 17:   */ public class NavMenuListServlet
/* 18:   */   extends HttpServlet
/* 19:   */ {
/* 20:31 */   private GoodsListService gls = new GoodsListServiceImpl();
/* 21:   */   
/* 22:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 23:   */     throws ServletException, IOException
/* 24:   */   {
/* 25:   */     try
/* 26:   */     {
/* 27:42 */       String menuNavId = request.getParameter("subMenuNavId");
/* 28:43 */       long navId = Long.parseLong(menuNavId);
/* 29:   */       
/* 30:   */ 
/* 31:   */ 
/* 32:47 */       List<Map<String, Object>> menuNavlist = this.gls.goodList(navId, "1");
/* 33:48 */       JSONObject json = new JSONObject();
/* 34:49 */       json.put("menuNavlist", menuNavlist);
/* 35:50 */       response.getOutputStream().write(json.toString().getBytes("utf-8"));
/* 36:   */     }
/* 37:   */     catch (Exception e)
/* 38:   */     {
/* 39:53 */       e.printStackTrace();
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 44:   */     throws ServletException, IOException
/* 45:   */   {
/* 46:64 */     doGet(request, response);
/* 47:   */   }
/* 48:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.NavMenuListServlet
 * JD-Core Version:    0.7.0.1
 */