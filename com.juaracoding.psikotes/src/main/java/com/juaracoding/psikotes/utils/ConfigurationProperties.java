package com.juaracoding.psikotes.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.txt")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@Value("${displayname}")
	private String displayName;
	
	@Value("${txtdashboard}")
	private String txtDashboard;

	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getTxtDashboard() {
		return txtDashboard;
	}
	
}
