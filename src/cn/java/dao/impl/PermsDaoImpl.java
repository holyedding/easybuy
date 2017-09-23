/*  1:   */package cn.java.dao.impl;

/*  2:   */
/*  3:   *//*  5:   */import java.util.List;
/*  6:   */
import java.util.Map;

/*  7:   */
import org.apache.commons.dbutils.QueryRunner;
/*  8:   */
import org.apache.commons.dbutils.handlers.MapHandler;
/*  9:   */
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.java.dao.PermsDao;
/*  4:   */
import cn.java.utils.JdbcUtils;

/* 10:   */
/* 11:   */public class PermsDaoImpl
/* 12: */implements PermsDao
/* 13: */{
	/* 14:31 */private QueryRunner qr = new QueryRunner();

	/* 15: */
	/* 16: */public int selectUsersPerms(String username)
	/* 17: */throws Exception
	/* 18: */{
		/* 19:35 */Map<String, Object> map = (Map) this.qr
				.query(JdbcUtils.getConnection(),
						/* 20:36 */"select user_perms as perms from front_users where username='"
								+
								/* 21:37 */username + "'", new MapHandler());
		/* 22:38 */return Integer.parseInt(map.get("perms") + "");
		/* 23: */}

	/* 24: */
	/* 25: */public int selectAdminsPerms(String adminName)
	/* 26: */throws Exception
	/* 27: */{
		/* 28:43 */Map<String, Object> map = (Map) this.qr
				.query(JdbcUtils.getConnection(),
						/* 29:44 */"select perms as perms from admin_users where adminName='"
								+
								/* 30:45 */adminName + "'", new MapHandler());
		/* 31:46 */return Integer.parseInt(map.get("perms") + "");
		/* 32: */}

	/* 33: */
	/* 34: */public int selectUrlsPerms(String url)
	/* 35: */throws Exception
	/* 36: */{
		/* 37:51 */Map<String, Object> map = (Map) this.qr.query(
				JdbcUtils.getConnection(),
				/* 38:52 */"select perms from url_perms where url='" + url
						+ "'",
				/* 39:53 */new MapHandler());
		/* 40:54 */return Integer.parseInt(map.get("perms") + "");
		/* 41: */}

	/* 42: */
	/* 43: */public List<Map<String, Object>> selectUrls()
	/* 44: */throws Exception
	/* 45: */{
		/* 46:58 */return (List) this.qr.query(JdbcUtils.getConnection(),
				"select * from url_perms",
				/* 47:59 */new MapListHandler());
		/* 48: */}
	/* 49: */
}

/*
 * Location: C:\Users\Administrator\Workspaces\MyEclipse Professional
 * 2014\dt41_easybuy\ImportedClasses\
 * 
 * Qualified Name: cn.java.dao.impl.PermsDaoImpl
 * 
 * JD-Core Version: 0.7.0.1
 */