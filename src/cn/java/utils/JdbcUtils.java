/*  1:   */ package cn.java.utils;
/*  2:   */ 
/*  3:   */ import java.io.InputStream;
/*  4:   */ import java.sql.Connection;
/*  5:   */ import java.sql.DriverManager;
/*  6:   */ import java.sql.ResultSet;
/*  7:   */ import java.sql.SQLException;
/*  8:   */ import java.sql.Statement;
/*  9:   */ import java.util.Properties;
/* 10:   */ 
/* 11:   */ public class JdbcUtils
/* 12:   */ {
/* 13:29 */   private static String driver = null;
/* 14:31 */   private static String url = null;
/* 15:33 */   private static String username = null;
/* 16:35 */   private static String password = null;
/* 17:   */   
/* 18:   */   static
/* 19:   */   {
/* 20:   */     try
/* 21:   */     {
/* 22:39 */       Properties props = new Properties();
/* 23:40 */       InputStream ins = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
/* 24:41 */       props.load(ins);
/* 25:   */       
/* 26:43 */       driver = props.getProperty("driver");
/* 27:44 */       url = props.getProperty("url");
/* 28:45 */       username = props.getProperty("username");
/* 29:46 */       password = props.getProperty("password");
/* 30:   */       
/* 31:48 */       Class.forName(driver);
/* 32:   */     }
/* 33:   */     catch (Exception e)
/* 34:   */     {
/* 35:50 */       e.printStackTrace();
/* 36:   */     }
/* 37:   */   }
/* 38:   */   
/* 39:   */   public static Connection getConnection()
/* 40:   */     throws SQLException
/* 41:   */   {
/* 42:63 */     return DriverManager.getConnection(url, username, password);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public static void close(ResultSet rs, Statement st, Connection conn)
/* 46:   */   {
/* 47:   */     try
/* 48:   */     {
/* 49:77 */       if (rs != null) {
/* 50:78 */         rs.close();
/* 51:   */       }
/* 52:79 */       if (st != null) {
/* 53:80 */         st.close();
/* 54:   */       }
/* 55:81 */       if (conn != null) {
/* 56:82 */         conn.close();
/* 57:   */       }
/* 58:   */     }
/* 59:   */     catch (SQLException e)
/* 60:   */     {
/* 61:84 */       e.printStackTrace();
/* 62:   */     }
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.utils.JdbcUtils
 * JD-Core Version:    0.7.0.1
 */