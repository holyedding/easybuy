/*  1:   */ package cn.java.test;
/*  2:   */ 
/*  3:   */ import java.io.PrintStream;
/*  4:   */ import java.util.HashMap;
/*  5:   */ import java.util.Map;
/*  6:   */ import org.json.JSONObject;
/*  7:   */ import org.junit.Test;
/*  8:   */ 
/*  9:   */ public class Demo
/* 10:   */ {
/* 11:   */   @Test
/* 12:   */   public void jsonTest()
/* 13:   */   {
/* 14:29 */     Map<String, Object> map = new HashMap();
/* 15:30 */     map.put("username", "admin");
/* 16:31 */     map.put("password", "123");
/* 17:32 */     map.put("tel", "12345678912");
/* 18:33 */     JSONObject jsonObject = new JSONObject(map);
/* 19:34 */     System.out.println(jsonObject.toString());
/* 20:   */   }
/* 21:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.test.Demo
 * JD-Core Version:    0.7.0.1
 */