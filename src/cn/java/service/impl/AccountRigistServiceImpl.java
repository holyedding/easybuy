/*  1:   */ package cn.java.service.impl;
/*  2:   */ 
/*  3:   */ import cn.java.dao.AccountRigistDao;
/*  4:   */ import cn.java.dao.impl.AccountRigistDaoImpl;
import cn.java.model.Users;
/*  6:   */ import cn.java.service.AccountRigistService;
/*  7:   */ 
/*  8:   */ public class AccountRigistServiceImpl
/*  9:   */   implements AccountRigistService
/* 10:   */ {
/* 11:26 */   private AccountRigistDao ardi = new AccountRigistDaoImpl();
/* 12:   */   
/* 13:   */   public boolean isUsernameExists(String username)
/* 14:   */     throws Exception
/* 15:   */   {
/* 16:30 */     int result = this.ardi.isUsernameExists(username);
/* 17:31 */     if (result >= 1) {
/* 18:32 */       return true;
/* 19:   */     }
/* 20:34 */     return false;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean isEmailExists(String email)
/* 24:   */     throws Exception
/* 25:   */   {
/* 26:39 */     int result = this.ardi.isEmailExists(email);
/* 27:40 */     if (result >= 1) {
/* 28:41 */       return true;
/* 29:   */     }
/* 30:43 */     return false;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public boolean isTelExists(String phone)
/* 34:   */     throws Exception
/* 35:   */   {
/* 36:48 */     int result = this.ardi.isTelExists(phone);
/* 37:49 */     if (result >= 1) {
/* 38:50 */       return true;
/* 39:   */     }
/* 40:52 */     return false;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public boolean rigist(Users user)
/* 44:   */     throws Exception
/* 45:   */   {
/* 46:57 */     int result = this.ardi.rigist(user);
/* 47:58 */     if (result >= 1) {
/* 48:59 */       return true;
/* 49:   */     }
/* 50:61 */     return false;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public int rigistEmsCode(int smsCode, String phone)
/* 54:   */     throws Exception
/* 55:   */   {
/* 56:67 */     return this.ardi.rigistEmsCode(smsCode, phone);
/* 57:   */   }
/* 58:   */   
/* 59:   */   public boolean isSmsCodeExists(String phone, int smsCode)
/* 60:   */     throws Exception
/* 61:   */   {
/* 62:72 */     int result = this.ardi.isSmsCodeExists(phone, smsCode);
/* 63:73 */     if (result >= 1) {
/* 64:74 */       return true;
/* 65:   */     }
/* 66:76 */     return false;
/* 67:   */   }
/* 68:   */   
/* 69:   */   public boolean isSmsCodeExists(String phone)
/* 70:   */     throws Exception
/* 71:   */   {
/* 72:81 */     int result = this.ardi.isSmsCodeExists(phone);
/* 73:82 */     if (result >= 1) {
/* 74:83 */       return true;
/* 75:   */     }
/* 76:85 */     return false;
/* 77:   */   }
/* 78:   */   
/* 79:   */   public int updateEmsCode(int smsCode, String phone)
/* 80:   */     throws Exception
/* 81:   */   {
/* 82:91 */     return this.ardi.updateEmsCode(smsCode, phone);
/* 83:   */   }
/* 84:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.service.impl.AccountRigistServiceImpl
 * JD-Core Version:    0.7.0.1
 */