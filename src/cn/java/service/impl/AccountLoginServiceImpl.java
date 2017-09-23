/*  1:   */ package cn.java.service.impl;
/*  2:   */ 
/*  3:   */ import cn.java.dao.AccountLoginDao;
/*  4:   */ import cn.java.dao.impl.AccountLoginDaoImpl;
/*  5:   */ import cn.java.service.AccountLoginService;
/*  6:   */ 
/*  7:   */ public class AccountLoginServiceImpl
/*  8:   */   implements AccountLoginService
/*  9:   */ {
/* 10:25 */   AccountLoginDao aldi = new AccountLoginDaoImpl();
/* 11:   */   
/* 12:   */   public boolean login(String username, String password)
/* 13:   */     throws Exception
/* 14:   */   {
/* 15:35 */     int result = this.aldi.Login(username, password);
/* 16:36 */     if (result >= 1) {
/* 17:37 */       return true;
/* 18:   */     }
/* 19:39 */     return false;
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.impl.AccountLoginServiceImpl
 * JD-Core Version:    0.7.0.1
 */