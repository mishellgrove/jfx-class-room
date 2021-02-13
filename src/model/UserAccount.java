package model;

import java.util.Date;

public class UserAccount {
	private String username;
	private String password;
	private String career;
	private String gender;
	private Date birthday;
	private String browser;
	
	public UserAccount(String username, String password, String career, String gender, Date birthday, String browser) {
		this.setUsername(username);
		this.setPassword(password);
		this.setCareer(career);
		this.setGender(gender);
		this.setBirthday(birthday);
		this.setBrowser(browser);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}
	

}
