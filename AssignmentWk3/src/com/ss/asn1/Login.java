package com.ss.asn1;

public class Login {
	
	private String user;
	private String password;
	
	public Login() {}
	
	public Login(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object t) {
		if (t instanceof Login){
			Login info  = (Login) t;
			if(((Login) info).getUser().equals(this.getUser()) &&
				info.getPassword().equals(this.getPassword())) {
				return true;
			}
		}
		return false;
	}
}
