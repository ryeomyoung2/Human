package exam09.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import exam09.domain.userinfo.UserInfo;
import exam09.domain.userinfo.dao.UserInfoDao;
import exam09.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import exam09.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("human");
		userInfo.setPassword("12345");
		userInfo.setUserName("강현준");
		
		
		FileInputStream fis = new FileInputStream("D:\\AI_Class\\JAVA_SE\\work_space\\JAVA_04\\src\\exam09\\userinfo\\web\\conf");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		System.out.println ("dbType : " + dbType);
		
		UserInfoDao userInfoDao = null;
		
		if (dbType.equals("ORACLE")) {		// ==는 안됨. equals를 써야 함.
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.selectUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
