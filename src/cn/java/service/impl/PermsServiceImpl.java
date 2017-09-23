/*  1:   */ package cn.java.service.impl;
/*  2:   */ 
/*  3:   */ import cn.java.dao.PermsDao;
/*  4:   */ import cn.java.dao.impl.PermsDaoImpl;
/*  5:   */ import cn.java.service.PermsService;
/*  6:   */ import java.util.List;
/*  7:   */ import java.util.Map;
/*  8:   */ 
/*  9:   */ public class PermsServiceImpl
/* 10:   */   implements PermsService
/* 11:   */ {
/* 12:28 */   private PermsDao pd = new PermsDaoImpl();
/* 13:   */   
/* 14:   */   public int selectUsersPerms(String username)
/* 15:   */     throws Exception
/* 16:   */   {
/* 17:32 */     return this.pd.selectUsersPerms(username);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public int selectAdminsPerms(String adminName)
/* 21:   */     throws Exception
/* 22:   */   {
/* 23:37 */     return this.pd.selectAdminsPerms(adminName);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public int selectUrlsPerms(String url)
/* 27:   */     throws Exception
/* 28:   */   {
/* 29:42 */     return this.pd.selectUrlsPerms(url);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public List<Map<String, Object>> selectUrls()
/* 33:   */     throws Exception
/* 34:   */   {
/* 35:47 */     return this.pd.selectUrls();
/* 36:   */   }
/* 37:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.impl.PermsServiceImpl
 * JD-Core Version:    0.7.0.1
 */