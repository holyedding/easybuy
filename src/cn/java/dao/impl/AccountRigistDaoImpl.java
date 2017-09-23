/*   1:    */package cn.java.dao.impl;

/*   2:    */
/*   3:    *//*   6:    */import java.util.Map;


/*   7:    */
import org.apache.commons.dbutils.QueryRunner;
/*   8:    */
import org.apache.commons.dbutils.handlers.MapHandler;

import cn.java.dao.AccountRigistDao;
/*   4:    */
import cn.java.model.Users;
/*   5:    */
import cn.java.utils.JdbcUtils;

/*   9:    */
/*  10:    */public class AccountRigistDaoImpl
/* 11: */implements AccountRigistDao
/* 12: */{
	/* 13: 30 */private QueryRunner qr = new QueryRunner();
	/* 14: 32 */Users user = new Users();

	/* 15: */
	/* 16: */public int isUsernameExists(String username)
	/* 17: */throws Exception
	/* 18: */{
		/* 19: 41 */Map<String, Object> map = (Map) this.qr
				.query(JdbcUtils.getConnection(),
						/* 20: 42 */"select count(*) AS num from front_users where username='"
								+ username + "'", new MapHandler());
		/* 21: 43 */return Integer.parseInt(map.get("num") + "");
		/* 22: */}

	/* 23: */
	/* 24: */public int isEmailExists(String email)
	/* 25: */throws Exception
	/* 26: */{
		/* 27: 53 */Map<String, Object> map = (Map) this.qr
				.query(JdbcUtils.getConnection(),
						/* 28: 54 */"select count(*) AS num from front_users where email='"
								+ email + "'", new MapHandler());
		/* 29: 55 */return Integer.parseInt(map.get("num") + "");
		/* 30: */}

	/* 31: */
	/* 32: */public int isTelExists(String phone)
	/* 33: */throws Exception
	/* 34: */{
		/* 35: 65 */Map<String, Object> map = (Map) this.qr
				.query(JdbcUtils.getConnection(),
						/* 36: 66 */"select count(*) AS num from front_users where phone='"
								+ phone + "'", new MapHandler());
		/* 37: 67 */return Integer.parseInt(map.get("num") + "");
		/* 38: */}

	/* 39: */
	/* 40: */public int rigist(Users user)
	/* 41: */throws Exception
	/* 42: */{
		/* 43: 77 */return this.qr.update(JdbcUtils.getConnection(),
				"insert into front_users set username='" + user.getUsername() +
				/* 44: 78 */"',`password`='" + user.getPassword() + "',email='"
						+ user.getEmail() + "',phone='" + user.getPhone() +
						/* 45: 79 */"'");
		/* 46: */}

	/* 47: */
	/* 48: */public int rigistEmsCode(int smsCode, String phone)
	/* 49: */throws Exception
	/* 50: */{
		/* 51: 84 */return this.qr.update(JdbcUtils.getConnection(),
				"insert into smscode set phone='" + phone + "',smscode='"
						+ smsCode +
						/* 52: 85 */"'");
		/* 53: */}

	/* 54: */
	/* 55: */public int isSmsCodeExists(String phone, int smsCode)
	/* 56: */throws Exception
	/* 57: */{
		/* 58: 89 */Map<String, Object> map = (Map) this.qr.query(
				JdbcUtils.getConnection(),
				/* 59: 90 */"select count(*) as num from smscode where phone='"
						+ phone + "'and smsCode='" + smsCode + "'",
				/* 60: 91 */new MapHandler());
		/* 61: 92 */return Integer.parseInt(map.get("num") + "");
		/* 62: */}

	/* 63: */
	/* 64: */public int isSmsCodeExists(String phone)
	/* 65: */throws Exception
	/* 66: */{
		/* 67: 97 */Map<String, Object> map = (Map) this.qr.query(
				JdbcUtils.getConnection(),
				/* 68: 98 */"select count(*) as num from smscode where phone='"
						+ phone + "'", new MapHandler());
		/* 69: 99 */return Integer.parseInt(map.get("num") + "");
		/* 70: */}

	/* 71: */
	/* 72: */public int updateEmsCode(int smsCode, String phone)
	/* 73: */throws Exception
	/* 74: */{
		/* 75:103 */return this.qr.update(JdbcUtils.getConnection(),
				"update smscode set phone='" + phone + "',smscode='" + smsCode +
				/* 76:104 */"where phone+'" + phone + "'");
		/* 77: */}
	/* 78: */
}

/*
 * Location: C:\Users\Administrator\Workspaces\MyEclipse Professional
 * 2014\dt41_easybuy\ImportedClasses\
 * 
 * Qualified Name: cn.java.dao.impl.AccountRigistDaoImpl
 * 
 * JD-Core Version: 0.7.0.1
 */