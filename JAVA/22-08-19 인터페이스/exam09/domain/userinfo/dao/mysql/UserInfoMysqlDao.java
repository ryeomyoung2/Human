package exam09.domain.userinfo.dao.mysql;

import exam09.domain.userinfo.UserInfo;
import exam09.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert MySQL ID : " + userInfo.getUserId());
	}
	@Override
	public void selectUserInfo(UserInfo userInfo) {
		System.out.println("Select MySQL ID : " + userInfo.getUserId());
	}
	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete MySQL ID : " + userInfo.getUserId());
	}

}
