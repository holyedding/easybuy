/*  1:   */ package cn.java.service.impl;
/*  2:   */ 
/*  3:   */ import cn.java.dao.AdminLoginDao;
/*  4:   */ import cn.java.dao.impl.AdminLoginDaoImpl;
/*  5:   */ import cn.java.service.AdminLoginService;
/*  6:   */ 
/*  7:   */ public class AdminLoginServiceImpl
/*  8:   */   implements AdminLoginService
/*  9:   */ {
/* 10:25 */   private AdminLoginDao ald = new AdminLoginDaoImpl();
/* 11:   */   
/* 12:   */   public boolean login(String adminName, String password)
/* 13:   */     throws Exception
/* 14:   */   {
/* 15:29 */     int result = this.ald.Login(adminName, password);
/* 16:30 */     if (result >= 1) {
/* 17:31 */       return true;
/* 18:   */     }
/* 19:33 */     return false;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.impl.AdminLoginServiceImpl
 * JD-Core Version:    0.7.0.1
 */