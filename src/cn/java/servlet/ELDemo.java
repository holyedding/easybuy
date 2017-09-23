/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import java.io.IOException;
/*  4:   */ import java.util.ArrayList;
/*  5:   */ import java.util.HashMap;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ import javax.servlet.RequestDispatcher;
/*  9:   */ import javax.servlet.ServletException;
/* 10:   */ import javax.servlet.annotation.WebServlet;
/* 11:   */ import javax.servlet.http.HttpServlet;
/* 12:   */ import javax.servlet.http.HttpServletRequest;
/* 13:   */ import javax.servlet.http.HttpServletResponse;
/* 14:   */ 
/* 15:   */ @WebServlet({"/ELDemo"})
/* 16:   */ public class ELDemo
/* 17:   */   extends HttpServlet
/* 18:   */ {
/* 19:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 20:   */     throws ServletException, IOException
/* 21:   */   {
/* 22:26 */     Map<String, Object> map = new HashMap();
/* 23:27 */     map.put("1", "hh");
/* 24:28 */     map.put("2", "aa");
/* 25:29 */     map.put("3", "cc");
/* 26:30 */     map.put("4", "hqqh");
/* 27:31 */     map.put("5", "ss");
/* 28:32 */     Map<String, Object> map1 = new HashMap();
/* 29:33 */     map1.put("1", "hhh");
/* 30:34 */     map1.put("2", "aaa");
/* 31:35 */     map1.put("3", "ccc");
/* 32:36 */     map1.put("4", "hqqh");
/* 33:37 */     map1.put("5", "sss");
/* 34:38 */     request.setAttribute("map", map);
/* 35:39 */     List<Map<String, Object>> list = new ArrayList();
/* 36:40 */     list.add(map);
/* 37:41 */     list.add(map1);
/* 38:42 */     request.setAttribute("list", list);
/* 39:43 */     request.getRequestDispatcher("pages/test/Demo.jsp").forward(request, response);
/* 40:   */   }
/* 41:   */   
/* 42:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 43:   */     throws ServletException, IOException
/* 44:   */   {}
/* 45:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.ELDemo
 * JD-Core Version:    0.7.0.1
 */