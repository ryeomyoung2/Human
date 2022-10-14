package exam09.domain.userinfo.dao.oracle;

import exam09.domain.userinfo.UserInfo;
import exam09.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert Oracle ID : " + userInfo.getUserId());
	}
	@Override
	public void selectUserInfo(UserInfo userInfo) {
		System.out.println("Select Oracle ID : " + userInfo.getUserId());
	}
	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete Oracle ID : " + userInfo.getUserId());
	}

}
