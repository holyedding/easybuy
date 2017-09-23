/*  1:   */package cn.java.dao.impl;

/*  2:   */
/*  3:   *//*  5:   */import java.util.Map;

/*  6:   */
import org.apache.commons.dbutils.QueryRunner;
/*  7:   */
import org.apache.commons.dbutils.handlers.MapHandler;

import cn.java.dao.AdminLoginDao;
/*  4:   */
import cn.java.utils.JdbcUtils;

/*  8:   */
/*  9:   */public class AdminLoginDaoImpl
/* 10: */implements AdminLoginDao
/* 11: */{
	/* 12:29 */QueryRunner qr = new QueryRunner();

	/* 13: */
	/* 14: */public int Login(String adminName, String password)
	/* 15: */throws Exception
	/* 16: */{
		/* 17:33 */Map<String, Object> map = (Map) this.qr
				.query(JdbcUtils.getConnection(),
						/* 18:34 */"select count(*) as num from admin_users where adminName='"
								+ adminName + "' and `password`='" +
								/* 19:35 */password + "'", new MapHandler());
		/* 20:36 */return Integer.parseInt(map.get("num") + "");
		/* 21: */}
	/* 22: */
}

/*
 * Location: C:\Users\Administrator\Workspaces\MyEclipse Professional
 * 2014\dt41_easybuy\ImportedClasses\
 * 
 * Qualified Name: cn.java.dao.impl.AdminLoginDaoImpl
 * 
 * JD-Core Version: 0.7.0.1
 */