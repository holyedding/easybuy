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
/* 16:   */ @WebServlet({"/SubMenuListServlet"})
/* 17:   */ public class SubMenuListServlet
/* 18:   */   extends HttpServlet
/* 19:   */ {
/* 20:31 */   private GoodsListService gls = new GoodsListServiceImpl();
/* 21:   */   
/* 22:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 23:   */     throws ServletException, IOException
/* 24:   */   {
/* 25:   */     try
/* 26:   */     {
/* 27:40 */       String menuId = request.getParameter("MenuId");
/* 28:41 */       long id = Long.parseLong(menuId);
/* 29:   */       
/* 30:   */ 
/* 31:   */ 
/* 32:45 */       List<Map<String, Object>> menulist = this.gls.goodList(id, "1");
/* 33:   */       
/* 34:   */ 
/* 35:   */ 
/* 36:   */ 
/* 37:50 */       JSONObject json = new JSONObject();
/* 38:51 */       json.put("menulist", menulist);
/* 39:52 */       response.getOutputStream().write(json.toString().getBytes("utf-8"));
/* 40:   */     }
/* 41:   */     catch (Exception e)
/* 42:   */     {
/* 43:55 */       e.printStackTrace();
/* 44:   */     }
/* 45:   */   }
/* 46:   */   
/* 47:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 48:   */     throws ServletException, IOException
/* 49:   */   {
/* 50:66 */     doGet(request, response);
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.SubMenuListServlet
 * JD-Core Version:    0.7.0.1
 */