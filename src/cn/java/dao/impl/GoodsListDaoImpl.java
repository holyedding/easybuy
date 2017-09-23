/*  1:   */ package cn.java.dao.impl;
/*  2:   */ 
/*  3:   */ import cn.java.dao.GoodsListDao;
/*  4:   */ import cn.java.utils.JdbcUtils;
/*  5:   */ import java.util.List;
/*  6:   */ import java.util.Map;
/*  7:   */ import org.apache.commons.dbutils.QueryRunner;
/*  8:   */ import org.apache.commons.dbutils.handlers.MapListHandler;
/*  9:   */ 
/* 10:   */ public class GoodsListDaoImpl
/* 11:   */   implements GoodsListDao
/* 12:   */ {
/* 13:30 */   private QueryRunner qr = new QueryRunner();
/* 14:   */   
/* 15:   */   public List<Map<String, Object>> goodList(long parent, String flag)
/* 16:   */     throws Exception
/* 17:   */   {
/* 18:35 */     return (List)this.qr.query(JdbcUtils.getConnection(), "select * from goodsList where parent=" + parent + " and flag=" + 
/* 19:36 */       flag + "  ", new MapListHandler());
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.dao.impl.GoodsListDaoImpl
 * JD-Core Version:    0.7.0.1
 */