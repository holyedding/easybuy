/*  1:   */ package cn.java.service.impl;
/*  2:   */ 
/*  3:   */ import cn.java.dao.GoodsListDao;
/*  4:   */ import cn.java.dao.impl.GoodsListDaoImpl;
/*  5:   */ import cn.java.service.GoodsListService;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ 
/*  9:   */ public class GoodsListServiceImpl
/* 10:   */   implements GoodsListService
/* 11:   */ {
/* 12:28 */   GoodsListDao gld = new GoodsListDaoImpl();
/* 13:   */   
/* 14:   */   public List<Map<String, Object>> goodList(long parent, String flag)
/* 15:   */     throws Exception
/* 16:   */   {
/* 17:32 */     return this.gld.goodList(parent, flag);
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.impl.GoodsListServiceImpl
 * JD-Core Version:    0.7.0.1
 */