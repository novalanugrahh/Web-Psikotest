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
	private String TxtDashboard;
	
	@Value("${txtemail}")
	private String txtEmail;
	
	@Value("${txtname}")
	private String txtname;
	
	@Value("${closemenu}")
	private String CloseMenu;
	
	@Value("${checkbox}")
	private String CheckBox;
	
	@Value("${refresh}")
	private String Refresh;
	
	@Value("${profile}")
	private String Profile;
	
	@Value("${edit}")
	private String Edit;
	
	@Value("${cancel}")
	private String Cancel;
	
	@Value("${row per page}")
	private String Row;
	
	@Value("${page 5}")
	private String Page5;
	
	@Value("${page 25}")
	private String Page25;
	
	@Value("${activasi}")
	private String Activasi;
	
	@Value("${save}")
	private String Save;
	
	@Value("${show}")
	private String Show;
	
	@Value("${logout}")
	private String Logout;
	
	

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
		return TxtDashboard;
	}
	
	public String getTxtEmail() {
		return txtEmail;
	}
	
	public String getTxtName() {
		return txtname;
	}
	
	public String getCloseMenu() {
		return CloseMenu;
	
	}
	
	public String getCheckbox() {
		return CheckBox;
	}
	
	public String getRefresh() {
		return Refresh;
	}
	
	public String getEdit() {
		return Edit;
	}
	public String getProfile() {
		return Profile;
	}
	
	public String getCancel() {
		return Cancel;
	
	}
	public String getRowperPage() {
		return Row;
	}
	public String getPage5() {
		return Page5;
	}
	public String getPage25() {
		return Page25;
	}
	public String getActivasi() {
		return Activasi;
	}
	public String getSave() {
		return Save;
	
	}
	 String getShow() {
			return Show;
		}

	 public String getLogout() {
			return Logout;
		}
}