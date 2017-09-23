/*  1:   */ package cn.java.service.impl;
/*  2:   */ 
/*  3:   */ import cn.java.dao.NewsDao;
/*  4:   */ import cn.java.dao.impl.NewsDaoImpl;
/*  5:   */ import cn.java.service.NewsService;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ 
/*  9:   */ public class NewsServiceImpl
/* 10:   */   implements NewsService
/* 11:   */ {
/* 12:28 */   private NewsDao nd = new NewsDaoImpl();
/* 13:   */   
/* 14:   */   public List<Map<String, Object>> news()
/* 15:   */     throws Exception
/* 16:   */   {
/* 17:32 */     return this.nd.news();
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.impl.NewsServiceImpl
 * JD-Core Version:    0.7.0.1
 */