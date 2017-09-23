/*  1:   */ package cn.java.model;
/*  2:   */ 
/*  3:   */ public class Users
/*  4:   */ {
/*  5:   */   private String username;
/*  6:   */   private String password;
/*  7:   */   private String email;
/*  8:   */   private String phone;
/*  9:   */   
/* 10:   */   public String getUsername()
/* 11:   */   {
/* 12:30 */     return this.username;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void setUsername(String username)
/* 16:   */   {
/* 17:34 */     this.username = username;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public String getPassword()
/* 21:   */   {
/* 22:38 */     return this.password;
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void setPassword(String password)
/* 26:   */   {
/* 27:42 */     this.password = password;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public String getEmail()
/* 31:   */   {
/* 32:46 */     return this.email;
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void setEmail(String email)
/* 36:   */   {
/* 37:50 */     this.email = email;
/* 38:   */   }
/* 39:   */   
/* 40:   */   public String getPhone()
/* 41:   */   {
/* 42:54 */     return this.phone;
/* 43:   */   }
/* 44:   */   
/* 45:   */   public void setPhone(String phone)
/* 46:   */   {
/* 47:58 */     this.phone = phone;
/* 48:   */   }
/* 49:   */   
/* 50:   */   public Users() {}
/* 51:   */   
/* 52:   */   public Users(String username, String password, String email, String phone)
/* 53:   */   {
/* 54:67 */     this.username = username;
/* 55:68 */     this.password = password;
/* 56:69 */     this.email = email;
/* 57:70 */     this.phone = phone;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public String toString()
/* 61:   */   {
/* 62:75 */     return "User [username=" + this.username + ", password=" + this.password + ", email=" + this.email + ", phone=" + this.phone + "]";
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.entity.Users
 * JD-Core Version:    0.7.0.1
 */