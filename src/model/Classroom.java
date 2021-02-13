package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Classroom {
	
	private List<UserAccount> users;
	
	public Classroom(){
		users = new ArrayList<>();
	}
	
	public void addUssers(String name,String password, String gender, String career, Date birthday, String browser) {
		UserAccount ua = new UserAccount(name, password, career, gender, birthday, browser);
		users.add(ua);
	}

	public List<UserAccount> getListContact(){
		return users;
	}

	public UserAccount existUser(String name) {
		UserAccount u = null;
		if (users.size()>1) {
			for(int i = 0; i <= users.size(); i++) {
				if (users.get(i).getUsername().equals(name)) {
					u = users.get(i);
				}	
			}
		}
		return u;
	}
}
