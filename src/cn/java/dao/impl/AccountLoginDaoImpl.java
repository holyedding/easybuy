/*  1:   */package cn.java.dao.impl;

/*  2:   */
/*  3:   *//*  5:   */import java.util.Map;

/*  6:   */
import org.apache.commons.dbutils.QueryRunner;
/*  7:   */
import org.apache.commons.dbutils.handlers.MapHandler;

import cn.java.dao.AccountLoginDao;
/*  4:   */
import cn.java.utils.JdbcUtils;

/*  8:   */
/*  9:   */public class AccountLoginDaoImpl
/* 10: */implements AccountLoginDao
/* 11: */{
	/* 12:29 */QueryRunner qr = new QueryRunner();

	/* 13: */
	/* 14: */public int Login(String username, String password)
	/* 15: */throws Exception
	/* 16: */{
		/* 17:39 */Map<String, Object> map = (Map) this.qr
				.query(JdbcUtils.getConnection(),
						/* 18:40 */"select count(*) as num from front_users where username='"
								+ username + "' and `password`='" + password +
								/* 19:41 */"'", new MapHandler());
		/* 20:42 */return Integer.parseInt(map.get("num") + "");
		/* 21: */}
	/* 22: */
}

/*
 * Location: C:\Users\Administrator\Workspaces\MyEclipse Professional
 * 2014\dt41_easybuy\ImportedClasses\
 * 
 * Qualified Name: cn.java.dao.impl.AccountLoginDaoImpl
 * 
 * JD-Core Version: 0.7.0.1
 */