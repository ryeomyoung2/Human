//package com.study.springboot;
//
//
//public class Member {
//	String loginId;
//	String passcode;
//	public String getLoginId() {
//		return loginId;
//	}
//	public void setLoginId(String loginId) {
//		this.loginId = loginId;
//	}
//	public String getPasscode() {
//		return passcode;
//	}
//	public void setPasscode(String passcode) {
//		this.passcode = passcode;
//	}
//
//}

package com.study.springboot;

import lombok.Data;

@Data
public class Member {
	String loginId;
	String passcode;

}
