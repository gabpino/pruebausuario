package com.example.demo.model;

import java.io.Serializable;

public class TelefonoTO implements Serializable {

	private static final long serialVersionUID = 8332330279604024913L;
	private String number;
	private String contryCode;
	private String cityCode;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getContryCode() {
		return contryCode;
	}

	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

}
