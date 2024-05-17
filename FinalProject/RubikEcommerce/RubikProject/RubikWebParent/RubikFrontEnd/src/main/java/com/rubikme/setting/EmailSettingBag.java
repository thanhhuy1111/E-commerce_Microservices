package com.rubikme.setting;

import java.util.List;

import com.rubikme.common.entity.Setting;
import com.rubikme.common.entity.SettingBag;

public class EmailSettingBag extends SettingBag {

	public EmailSettingBag(List<Setting> listSettings) {
		super(listSettings);
	}

	public String getHost() {
		return "smtp.gmail.com";
	}

	public int getPort() {
		return Integer.parseInt("587");
	}

	public String getUsername() {
		return "tphuyvvk@gmail.com";
	}

	public String getPassword() {
		return "bosfhawzvexmrqkc";
	}

	public String getSmtpAuth() {
		return "true";
	}

	public String getSmtpSecured() {
		return "true";
	}

	public String getFromAddress() {
		return "tphuyvvk@gmail.com";
	}

	public String getSenderName() {
		return "Yamen Company";
	}

	public String getCustomerVerifySubject() {
		return "Please check";
	}

	public String getCustomerVerifyContent() {
		return "Hi,&nbsp;<div>Please click the link below to to verification account:</div><div><br></div><div><a href=\"[[URL]]\" target=\"_self\">Verify</a></div><div><br></div><div>Thanks.</div><div><br></div><div><br></div>";
	}
}
