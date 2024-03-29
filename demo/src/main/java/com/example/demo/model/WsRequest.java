package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

public class WsRequest implements Serializable {

	private static final long serialVersionUID = -5164835569592515822L;
	private String name;
	private String email;
	private String password;
	private List<TelefonoTO> phones;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<TelefonoTO> getPhones() {
		return phones;
	}

	public void setPhones(List<TelefonoTO> phones) {
		this.phones = phones;
	}

}
