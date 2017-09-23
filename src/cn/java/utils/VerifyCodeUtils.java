/*   1:    */ package cn.java.utils;
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Font;
/*   5:    */ import java.awt.Graphics;
/*   6:    */ import java.awt.Graphics2D;
/*   7:    */ import java.awt.RenderingHints;
/*   8:    */ import java.awt.geom.AffineTransform;
/*   9:    */ import java.awt.image.BufferedImage;
/*  10:    */ import java.io.File;
/*  11:    */ import java.io.FileOutputStream;
/*  12:    */ import java.io.IOException;
/*  13:    */ import java.io.OutputStream;
/*  14:    */ import java.util.Arrays;
/*  15:    */ import java.util.Random;
/*  16:    */ import javax.imageio.ImageIO;
/*  17:    */ 
/*  18:    */ public class VerifyCodeUtils
/*  19:    */ {
/*  20:    */   public static final String VERIFY_CODES = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ";
/*  21: 31 */   private static Random random = new Random();
/*  22:    */   
/*  23:    */   public static String generateVerifyCode(int verifySize)
/*  24:    */   {
/*  25: 39 */     return generateVerifyCode(verifySize, "23456789ABCDEFGHJKLMNPQRSTUVWXYZ");
/*  26:    */   }
/*  27:    */   
/*  28:    */   public static String generateVerifyCode(int verifySize, String sources)
/*  29:    */   {
/*  30: 49 */     if ((sources == null) || (sources.length() == 0)) {
/*  31: 50 */       sources = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ";
/*  32:    */     }
/*  33: 52 */     int codesLen = sources.length();
/*  34: 53 */     Random rand = new Random(System.currentTimeMillis());
/*  35: 54 */     StringBuilder verifyCode = new StringBuilder(verifySize);
/*  36: 55 */     for (int i = 0; i < verifySize; i++) {
/*  37: 56 */       verifyCode.append(sources.charAt(rand.nextInt(codesLen - 1)));
/*  38:    */     }
/*  39: 58 */     return verifyCode.toString();
/*  40:    */   }
/*  41:    */   
/*  42:    */   public static String outputVerifyImage(int w, int h, File outputFile, int verifySize)
/*  43:    */     throws IOException
/*  44:    */   {
/*  45: 71 */     String verifyCode = generateVerifyCode(verifySize);
/*  46: 72 */     outputImage(w, h, outputFile, verifyCode);
/*  47: 73 */     return verifyCode;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public static String outputVerifyImage(int w, int h, OutputStream os, int verifySize)
/*  51:    */     throws IOException
/*  52:    */   {
/*  53: 86 */     String verifyCode = generateVerifyCode(verifySize);
/*  54: 87 */     outputImage(w, h, os, verifyCode);
/*  55: 88 */     return verifyCode;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public static void outputImage(int w, int h, File outputFile, String code)
/*  59:    */     throws IOException
/*  60:    */   {
/*  61:100 */     if (outputFile == null) {
/*  62:101 */       return;
/*  63:    */     }
/*  64:103 */     File dir = outputFile.getParentFile();
/*  65:104 */     if (!dir.exists()) {
/*  66:105 */       dir.mkdirs();
/*  67:    */     }
/*  68:    */     try
/*  69:    */     {
/*  70:108 */       outputFile.createNewFile();
/*  71:109 */       FileOutputStream fos = new FileOutputStream(outputFile);
/*  72:110 */       outputImage(w, h, fos, code);
/*  73:111 */       fos.close();
/*  74:    */     }
/*  75:    */     catch (IOException e)
/*  76:    */     {
/*  77:113 */       throw e;
/*  78:    */     }
/*  79:    */   }
/*  80:    */   
/*  81:    */   public static void outputImage(int w, int h, OutputStream os, String code)
/*  82:    */     throws IOException
/*  83:    */   {
/*  84:126 */     int verifySize = code.length();
/*  85:127 */     BufferedImage image = new BufferedImage(w, h, 1);
/*  86:128 */     Random rand = new Random();
/*  87:129 */     Graphics2D g2 = image.createGraphics();
/*  88:130 */     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/*  89:131 */     Color[] colors = new Color[5];
/*  90:132 */     Color[] colorSpaces = { Color.WHITE, Color.CYAN, Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA, 
/*  91:133 */       Color.ORANGE, Color.PINK, Color.YELLOW };
/*  92:134 */     float[] fractions = new float[colors.length];
/*  93:135 */     for (int i = 0; i < colors.length; i++)
/*  94:    */     {
/*  95:136 */       colors[i] = colorSpaces[rand.nextInt(colorSpaces.length)];
/*  96:137 */       fractions[i] = rand.nextFloat();
/*  97:    */     }
/*  98:139 */     Arrays.sort(fractions);
/*  99:    */     
/* 100:141 */     g2.setColor(Color.GRAY);
/* 101:142 */     g2.fillRect(0, 0, w, h);
/* 102:    */     
/* 103:144 */     Color c = getRandColor(200, 250);
/* 104:145 */     g2.setColor(c);
/* 105:146 */     g2.fillRect(0, 2, w, h - 4);
/* 106:    */     
/* 107:    */ 
/* 108:149 */     Random random = new Random();
/* 109:150 */     g2.setColor(getRandColor(160, 200));
/* 110:151 */     for (int i = 0; i < 20; i++)
/* 111:    */     {
/* 112:152 */       int x = random.nextInt(w - 1);
/* 113:153 */       int y = random.nextInt(h - 1);
/* 114:154 */       int xl = random.nextInt(6) + 1;
/* 115:155 */       int yl = random.nextInt(12) + 1;
/* 116:156 */       g2.drawLine(x, y, x + xl + 40, y + yl + 20);
/* 117:    */     }
/* 118:160 */     float yawpRate = 0.05F;
/* 119:161 */     int area = (int)(yawpRate * w * h);
/* 120:162 */     for (int i = 0; i < area; i++)
/* 121:    */     {
/* 122:163 */       int x = random.nextInt(w);
/* 123:164 */       int y = random.nextInt(h);
/* 124:165 */       int rgb = getRandomIntColor();
/* 125:166 */       image.setRGB(x, y, rgb);
/* 126:    */     }
/* 127:169 */     shear(g2, w, h, c);
/* 128:    */     
/* 129:171 */     g2.setColor(getRandColor(100, 160));
/* 130:172 */     int fontSize = h - 4;
/* 131:173 */     Font font = new Font("Algerian", 2, fontSize);
/* 132:174 */     g2.setFont(font);
/* 133:175 */     char[] chars = code.toCharArray();
/* 134:176 */     for (int i = 0; i < verifySize; i++)
/* 135:    */     {
/* 136:177 */       AffineTransform affine = new AffineTransform();
/* 137:178 */       affine.setToRotation(0.7853981633974483D * rand.nextDouble() * (rand.nextBoolean() ? 1 : -1), w / verifySize * i + 
/* 138:179 */         fontSize / 2, h / 2);
/* 139:180 */       g2.setTransform(affine);
/* 140:181 */       g2.drawChars(chars, i, 1, (w - 10) / verifySize * i + 5, h / 2 + fontSize / 2 - 10);
/* 141:    */     }
/* 142:184 */     g2.dispose();
/* 143:185 */     ImageIO.write(image, "jpg", os);
/* 144:    */   }
/* 145:    */   
/* 146:    */   private static Color getRandColor(int fc, int bc)
/* 147:    */   {
/* 148:189 */     if (fc > 255) {
/* 149:190 */       fc = 255;
/* 150:    */     }
/* 151:191 */     if (bc > 255) {
/* 152:192 */       bc = 255;
/* 153:    */     }
/* 154:193 */     int r = fc + random.nextInt(bc - fc);
/* 155:194 */     int g = fc + random.nextInt(bc - fc);
/* 156:195 */     int b = fc + random.nextInt(bc - fc);
/* 157:196 */     return new Color(r, g, b);
/* 158:    */   }
/* 159:    */   
/* 160:    */   private static int getRandomIntColor()
/* 161:    */   {
/* 162:200 */     int[] rgb = getRandomRgb();
/* 163:201 */     int color = 0;
/* 164:202 */     int[] arrayOfInt1 = rgb;int j = rgb.length;
/* 165:202 */     for (int i = 0; i < j; i++)
/* 166:    */     {
/* 167:202 */       int c = arrayOfInt1[i];
/* 168:203 */       color <<= 8;
/* 169:204 */       color |= c;
/* 170:    */     }
/* 171:206 */     return color;
/* 172:    */   }
/* 173:    */   
/* 174:    */   private static int[] getRandomRgb()
/* 175:    */   {
/* 176:210 */     int[] rgb = new int[3];
/* 177:211 */     for (int i = 0; i < 3; i++) {
/* 178:212 */       rgb[i] = random.nextInt(255);
/* 179:    */     }
/* 180:214 */     return rgb;
/* 181:    */   }
/* 182:    */   
/* 183:    */   private static void shear(Graphics g, int w1, int h1, Color color)
/* 184:    */   {
/* 185:218 */     shearX(g, w1, h1, color);
/* 186:219 */     shearY(g, w1, h1, color);
/* 187:    */   }
/* 188:    */   
/* 189:    */   private static void shearX(Graphics g, int w1, int h1, Color color)
/* 190:    */   {
/* 191:224 */     int period = random.nextInt(2);
/* 192:    */     
/* 193:226 */     boolean borderGap = true;
/* 194:227 */     int frames = 1;
/* 195:228 */     int phase = random.nextInt(2);
/* 196:230 */     for (int i = 0; i < h1; i++)
/* 197:    */     {
/* 198:231 */       double d = (period >> 1) * 
/* 199:232 */         Math.sin(i / period + 6.283185307179586D * phase / frames);
/* 200:233 */       g.copyArea(0, i, w1, 1, (int)d, 0);
/* 201:234 */       if (borderGap)
/* 202:    */       {
/* 203:235 */         g.setColor(color);
/* 204:236 */         g.drawLine((int)d, i, 0, i);
/* 205:237 */         g.drawLine((int)d + w1, i, w1, i);
/* 206:    */       }
/* 207:    */     }
/* 208:    */   }
/* 209:    */   
/* 210:    */   private static void shearY(Graphics g, int w1, int h1, Color color)
/* 211:    */   {
/* 212:245 */     int period = random.nextInt(40) + 10;
/* 213:    */     
/* 214:247 */     boolean borderGap = true;
/* 215:248 */     int frames = 20;
/* 216:249 */     int phase = 7;
/* 217:250 */     for (int i = 0; i < w1; i++)
/* 218:    */     {
/* 219:251 */       double d = (period >> 1) * 
/* 220:252 */         Math.sin(i / period + 6.283185307179586D * phase / frames);
/* 221:253 */       g.copyArea(i, 0, 1, h1, 0, (int)d);
/* 222:254 */       if (borderGap)
/* 223:    */       {
/* 224:255 */         g.setColor(color);
/* 225:256 */         g.drawLine(i, (int)d, i, 0);
/* 226:257 */         g.drawLine(i, (int)d + h1, i, h1);
/* 227:    */       }
/* 228:    */     }
/* 229:    */   }
/* 230:    */   
/* 231:    */   public static void main(String[] args)
/* 232:    */     throws IOException
/* 233:    */   {
/* 234:265 */     File dir = new File("F:/verifies");
/* 235:266 */     int w = 200;int h = 80;
/* 236:267 */     for (int i = 0; i < 50; i++)
/* 237:    */     {
/* 238:268 */       String verifyCode = generateVerifyCode(4);
/* 239:269 */       File file = new File(dir, verifyCode + ".jpg");
/* 240:270 */       outputImage(w, h, file, verifyCode);
/* 241:    */     }
/* 242:    */   }
/* 243:    */ }


/* Location:           C:\Users\Administrator\Workspaces\MyEclipse Professional 2014\dt41_easybuy\ImportedClasses\
 * Qualified Name:     cn.java.utils.VerifyCodeUtils
 * JD-Core Version:    0.7.0.1
 */