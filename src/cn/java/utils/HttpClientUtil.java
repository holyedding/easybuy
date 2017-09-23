/*   1:    */package cn.java.utils;

/*   2:    */
/*   3:    */import java.io.IOException;
/*   5:    */
import java.net.URL;
/*   6:    */
import java.util.ArrayList;
/*   7:    */
import java.util.HashMap;
/*   8:    */
import java.util.List;
/*   9:    */
import java.util.Map;

/*  10:    */
import org.apache.http.HttpEntity;
/*  11:    */
import org.apache.http.NameValuePair;
/*  12:    */
import org.apache.http.client.config.RequestConfig;
/*  14:    */
import org.apache.http.client.entity.UrlEncodedFormEntity;
/*  15:    */
import org.apache.http.client.methods.CloseableHttpResponse;
/*  16:    */
import org.apache.http.client.methods.HttpGet;
/*  17:    */
import org.apache.http.client.methods.HttpPost;
/*  18:    */
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
/*  19:    */
import org.apache.http.conn.util.PublicSuffixMatcher;
/*  20:    */
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
/*  21:    */
import org.apache.http.impl.client.CloseableHttpClient;
/*  23:    */
import org.apache.http.impl.client.HttpClients;
/*  24:    */
import org.apache.http.message.BasicNameValuePair;
/*  25:    */
import org.apache.http.util.EntityUtils;

/*   4:    */
/*  13:    */
/*  22:    */
/*  26:    */
/*  27:    */public class HttpClientUtil
/* 28: */{
	/* 29: 27 */private RequestConfig requestConfig = RequestConfig.custom()
	/* 30: 28 */.setSocketTimeout(15000)
	/* 31: 29 */.setConnectTimeout(15000)
	/* 32: 30 */.setConnectionRequestTimeout(15000)
	/* 33: 31 */.build();
	/* 34: 33 */private static HttpClientUtil instance = null;

	/* 35: */
	/* 36: */public static HttpClientUtil getInstance()
	/* 37: */{
		/* 38: 36 */if (instance == null) {
			/* 39: 37 */instance = new HttpClientUtil();
			/* 40: */}
		/* 41: 39 */return instance;
		/* 42: */}

	/* 43: */
	/* 44: */public String sendHttpPost(String httpUrl)
	/* 45: */{
		/* 46: 47 */HttpPost httpPost = new HttpPost(httpUrl);
		/* 47: 48 */return sendHttpPost(httpPost, "utf-8");
		/* 48: */}

	/* 49: */
	/* 50: */public String sendHttpPost(String httpUrl,
			Map<String, String> maps, String type)
	/* 51: */{
		/* 52: 59 */HttpPost httpPost = new HttpPost(httpUrl);
		/* 53: */
		/* 54: 61 */List<NameValuePair> nameValuePairs = new ArrayList();
		/* 55: 62 */for (String key : maps.keySet()) {
			/* 56: 63 */nameValuePairs.add(new BasicNameValuePair(key,
					(String) maps.get(key)));
			/* 57: */}
		/* 58: */try
		/* 59: */{
			/* 60: 66 */httpPost.setEntity(new UrlEncodedFormEntity(
					nameValuePairs, type));
			/* 61: */}
		/* 62: */catch (Exception e)
		/* 63: */{
			/* 64: 68 */e.printStackTrace();
			/* 65: */}
		/* 66: 70 */return sendHttpPost(httpPost, type);
		/* 67: */}

	/* 68: */
	/* 69: */private String sendHttpPost(HttpPost httpPost, String reponseType)
	/* 70: */{
		/* 71: 79 */CloseableHttpClient httpClient = null;
		/* 72: 80 */CloseableHttpResponse response = null;
		/* 73: 81 */HttpEntity entity = null;
		/* 74: 82 */String responseContent = null;
		/* 75: */try
		/* 76: */{
			/* 77: 85 */httpClient = HttpClients.createDefault();
			/* 78: 86 */httpPost.setConfig(this.requestConfig);
			/* 79: */
			/* 80: 88 */response = httpClient.execute(httpPost);
			/* 81: 89 */entity = response.getEntity();
			/* 82: 90 */responseContent = EntityUtils.toString(entity,
					reponseType);
			/* 83: */}
		/* 84: */catch (Exception e)
		/* 85: */{
			/* 86: 92 */e.printStackTrace();
			/* 87: */try
			/* 88: */{
				/* 89: 96 */if (response != null) {
					/* 90: 97 */response.close();
					/* 91: */}
				/* 92: 99 */if (httpClient != null) {
					/* 93:100 */httpClient.close();
					/* 94: */}
				/* 95: */}
			/* 96: */catch (IOException e1)
			/* 97: */{
				/* 98:103 */e1.printStackTrace();
				/* 99: */}
			/* 100: */}
		/* 101: */finally
		/* 102: */{
			/* 103: */try
			/* 104: */{
				/* 105: 96 */if (response != null) {
					/* 106: 97 */response.close();
					/* 107: */}
				/* 108: 99 */if (httpClient != null) {
					/* 109:100 */httpClient.close();
					/* 110: */}
				/* 111: */}
			/* 112: */catch (IOException e)
			/* 113: */{
				/* 114:103 */e.printStackTrace();
				/* 115: */}
			/* 116: */}
		/* 117:106 */return responseContent;
		/* 118: */}

	/* 119: */
	/* 120: */public String sendHttpGet(String httpUrl)
	/* 121: */{
		/* 122:114 */HttpGet httpGet = new HttpGet(httpUrl);
		/* 123:115 */return sendHttpGet(httpGet);
		/* 124: */}

	/* 125: */
	/* 126: */public String sendHttpsGet(String httpUrl)
	/* 127: */{
		/* 128:123 */HttpGet httpGet = new HttpGet(httpUrl);
		/* 129:124 */return sendHttpsGet(httpGet);
		/* 130: */}

	/* 131: */
	/* 132: */public int sendMsgUtf8(String Uid, String Key, int smsCode,
			String mobiles)
	/* 133: */{
		/* 134:140 */Map maps = new HashMap();
		/* 135:141 */maps.put("Uid", Uid);
		/* 136:142 */maps.put("Key", Key);
		/* 137:143 */maps.put("smsMob", mobiles);
		/* 138:144 */maps.put("smsText", smsCode);
		/* 139:145 */String result = sendHttpPost(
				"http://utf8.sms.webchinese.cn", maps, "utf-8");
		/* 140:146 */return Integer.parseInt(result);
		/* 141: */}

	/* 142: */
	/* 143: */public int sendMsgGbk(String Uid, String Key, String content,
			String mobiles)
	/* 144: */{
		/* 145:164 */Map maps = new HashMap();
		/* 146:165 */maps.put("Uid", Uid);
		/* 147:166 */maps.put("Key", Key);
		/* 148:167 */maps.put("smsMob", mobiles);
		/* 149:168 */maps.put("smsText", content);
		/* 150:169 */String result = sendHttpPost(
				"http://gbk.sms.webchinese.cn", maps, "gbk");
		/* 151:170 */return Integer.parseInt(result);
		/* 152: */}

	/* 153: */
	/* 154: */private String sendHttpGet(HttpGet httpGet)
	/* 155: */{
		/* 156:179 */CloseableHttpClient httpClient = null;
		/* 157:180 */CloseableHttpResponse response = null;
		/* 158:181 */HttpEntity entity = null;
		/* 159:182 */String responseContent = null;
		/* 160: */try
		/* 161: */{
			/* 162:185 */httpClient = HttpClients.createDefault();
			/* 163:186 */httpGet.setConfig(this.requestConfig);
			/* 164: */
			/* 165:188 */response = httpClient.execute(httpGet);
			/* 166:189 */entity = response.getEntity();
			/* 167:190 */responseContent = EntityUtils
					.toString(entity, "UTF-8");
			/* 168: */}
		/* 169: */catch (Exception e)
		/* 170: */{
			/* 171:192 */e.printStackTrace();
			/* 172: */try
			/* 173: */{
				/* 174:196 */if (response != null) {
					/* 175:197 */response.close();
					/* 176: */}
				/* 177:199 */if (httpClient != null) {
					/* 178:200 */httpClient.close();
					/* 179: */}
				/* 180: */}
			/* 181: */catch (IOException e1)
			/* 182: */{
				/* 183:203 */e1.printStackTrace();
				/* 184: */}
			/* 185: */}
		/* 186: */finally
		/* 187: */{
			/* 188: */try
			/* 189: */{
				/* 190:196 */if (response != null) {
					/* 191:197 */response.close();
					/* 192: */}
				/* 193:199 */if (httpClient != null) {
					/* 194:200 */httpClient.close();
					/* 195: */}
				/* 196: */}
			/* 197: */catch (IOException e)
			/* 198: */{
				/* 199:203 */e.printStackTrace();
				/* 200: */}
			/* 201: */}
		/* 202:206 */return responseContent;
		/* 203: */}

	/* 204: */
	/* 205: */private String sendHttpsGet(HttpGet httpGet)
	/* 206: */{
		/* 207:215 */CloseableHttpClient httpClient = null;
		/* 208:216 */CloseableHttpResponse response = null;
		/* 209:217 */HttpEntity entity = null;
		/* 210:218 */String responseContent = null;
		/* 211: */try
		/* 212: */{
			/* 213:221 */PublicSuffixMatcher publicSuffixMatcher = PublicSuffixMatcherLoader
					.load(new URL(httpGet.getURI().toString()));
			/* 214:222 */DefaultHostnameVerifier hostnameVerifier = new DefaultHostnameVerifier(
					publicSuffixMatcher);
			/* 215:223 */httpClient = HttpClients.custom()
					.setSSLHostnameVerifier(hostnameVerifier).build();
			/* 216:224 */httpGet.setConfig(this.requestConfig);
			/* 217: */
			/* 218:226 */response = httpClient.execute(httpGet);
			/* 219:227 */entity = response.getEntity();
			/* 220:228 */responseContent = EntityUtils
					.toString(entity, "UTF-8");
			/* 221: */}
		/* 222: */catch (Exception e)
		/* 223: */{
			/* 224:230 */e.printStackTrace();
			/* 225: */try
			/* 226: */{
				/* 227:234 */if (response != null) {
					/* 228:235 */response.close();
					/* 229: */}
				/* 230:237 */if (httpClient != null) {
					/* 231:238 */httpClient.close();
					/* 232: */}
				/* 233: */}
			/* 234: */catch (IOException e1)
			/* 235: */{
				/* 236:241 */e1.printStackTrace();
				/* 237: */}
			/* 238: */}
		/* 239: */finally
		/* 240: */{
			/* 241: */try
			/* 242: */{
				/* 243:234 */if (response != null) {
					/* 244:235 */response.close();
					/* 245: */}
				/* 246:237 */if (httpClient != null) {
					/* 247:238 */httpClient.close();
					/* 248: */}
				/* 249: */}
			/* 250: */catch (IOException e)
			/* 251: */{
				/* 252:241 */e.printStackTrace();
				/* 253: */}
			/* 254: */}
		/* 255:244 */return responseContent;
		/* 256: */}

	/* 257: */
	/* 258: */public String getErrorMsg(int errorCode)
	/* 259: */{
		/* 260:253 */if (errorCode == -1) {
			/* 261:254 */return "没有该用户账户";
			/* 262: */}
		/* 263:255 */if (errorCode == -2) {
			/* 264:256 */return "接口密钥不正确";
			/* 265: */}
		/* 266:257 */if (errorCode == -3) {
			/* 267:258 */return "短信数量不足";
			/* 268: */}
		/* 269:259 */if (errorCode == -4) {
			/* 270:260 */return "手机号格式不正确";
			/* 271: */}
		/* 272:261 */if (errorCode == -21) {
			/* 273:262 */return "MD5接口密钥加密不正确";
			/* 274: */}
		/* 275:263 */if (errorCode == -11) {
			/* 276:264 */return "该用户被禁用";
			/* 277: */}
		/* 278:265 */if (errorCode == -14) {
			/* 279:266 */return "短信内容出现非法字符";
			/* 280: */}
		/* 281:267 */if (errorCode == -41) {
			/* 282:268 */return "手机号码为空";
			/* 283: */}
		/* 284:269 */if (errorCode == -42) {
			/* 285:270 */return "短信内容为空";
			/* 286: */}
		/* 287:271 */if (errorCode == -51) {
			/* 288:272 */return "短信签名格式不正确";
			/* 289: */}
		/* 290:273 */if (errorCode == -6) {
			/* 291:274 */return "IP限制";
			/* 292: */}
		/* 293:276 */return "未知错误码:" + errorCode;
		/* 294: */}
	/* 295: */
}

/*
 * Location: C:\Users\Administrator\Workspaces\MyEclipse Professional
 * 2014\dt41_easybuy\ImportedClasses\
 * 
 * Qualified Name: cn.java.utils.HttpClientUtil
 * 
 * JD-Core Version: 0.7.0.1
 */