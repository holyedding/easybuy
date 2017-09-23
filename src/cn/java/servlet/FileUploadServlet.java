/*  1:   */ package cn.java.servlet;
/*  2:   */ 
/*  3:   */ import java.io.File;
/*  4:   */ import java.io.FileOutputStream;
/*  5:   */ import java.io.IOException;
/*  6:   */ import java.io.InputStream;
/*  7:   */ import java.io.PrintStream;
/*  8:   */ import java.text.SimpleDateFormat;
/*  9:   */ import java.util.Date;
/* 10:   */ import java.util.List;
/* 11:   */ import java.util.UUID;
/* 12:   */ import javax.servlet.ServletContext;
/* 13:   */ import javax.servlet.ServletException;
/* 14:   */ import javax.servlet.annotation.WebServlet;
/* 15:   */ import javax.servlet.http.HttpServlet;
/* 16:   */ import javax.servlet.http.HttpServletRequest;
/* 17:   */ import javax.servlet.http.HttpServletResponse;
/* 18:   */ import org.apache.commons.fileupload.FileItem;
/* 19:   */ import org.apache.commons.fileupload.FileUploadException;
/* 20:   */ import org.apache.commons.fileupload.disk.DiskFileItemFactory;
/* 21:   */ import org.apache.commons.fileupload.servlet.ServletFileUpload;
/* 22:   */ 
/* 23:   */ @WebServlet({"/FileUploadServlet"})
/* 24:   */ public class FileUploadServlet
/* 25:   */   extends HttpServlet
/* 26:   */ {
/* 27:   */   private static final long serialVersionUID = 1L;
/* 28:   */   
/* 29:   */   protected void doGet(HttpServletRequest request, HttpServletResponse response)
/* 30:   */     throws ServletException, IOException
/* 31:   */   {
/* 32:   */     try
/* 33:   */     {
/* 34:38 */       DiskFileItemFactory dff = new DiskFileItemFactory();
/* 35:39 */       ServletFileUpload sfu = new ServletFileUpload(dff);
/* 36:   */       
/* 37:41 */       List<FileItem> fileItems = sfu.parseRequest(request);
/* 38:42 */       for (FileItem fileItem : fileItems)
/* 39:   */       {
/* 40:43 */         boolean flag = fileItem.isFormField();
/* 41:44 */         if (flag)
/* 42:   */         {
/* 43:45 */           String filedName = fileItem.getFieldName();
/* 44:46 */           String value = fileItem.getString("utf-8");
/* 45:47 */           System.out.println(filedName + "  " + value);
/* 46:   */         }
/* 47:   */         else
/* 48:   */         {
/* 49:49 */           String fileName = fileItem.getName();
/* 50:50 */           InputStream fis = fileItem.getInputStream();
/* 51:51 */           int len = fis.read();
/* 52:52 */           if (len > 0)
/* 53:   */           {
/* 54:53 */             String path = request.getServletContext().getRealPath("/upload");
/* 55:54 */             String uuid = UUID.randomUUID().toString();
/* 56:55 */             String[] strArray = fileName.split("\\.");
/* 57:56 */             String extension = strArray[(strArray.length - 1)];
/* 58:57 */             File file = new File(path + "\\" + 
/* 59:58 */               new SimpleDateFormat("yyyyMMdd").format(new Date()).toString());
/* 60:59 */             file.mkdir();
/* 61:60 */             File file2 = new File(path + "\\" + 
/* 62:61 */               new SimpleDateFormat("yyyyMMdd").format(new Date()).toString() + "\\" + uuid + "." + 
/* 63:62 */               extension);
/* 64:63 */             file2.createNewFile();
/* 65:64 */             FileOutputStream fos = new FileOutputStream(file2);
/* 66:65 */             while (len != -1)
/* 67:   */             {
/* 68:66 */               fos.write(len);
/* 69:67 */               len = fis.read();
/* 70:   */             }
/* 71:69 */             fos.close();
/* 72:70 */             fis.close();
/* 73:   */           }
/* 74:   */         }
/* 75:   */       }
/* 76:   */     }
/* 77:   */     catch (FileUploadException e)
/* 78:   */     {
/* 79:78 */       e.printStackTrace();
/* 80:   */     }
/* 81:   */   }
/* 82:   */   
/* 83:   */   protected void doPost(HttpServletRequest request, HttpServletResponse response)
/* 84:   */     throws ServletException, IOException
/* 85:   */   {
/* 86:89 */     doGet(request, response);
/* 87:   */   }
/* 88:   */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.servlet.FileUploadServlet
 * JD-Core Version:    0.7.0.1
 */