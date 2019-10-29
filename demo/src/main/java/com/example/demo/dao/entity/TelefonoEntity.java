package com.example.demo.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefono")
public class TelefonoEntity implements Serializable {

	private static final long serialVersionUID = 5343183642186358254L;

	@Id
	@GeneratedValue
	@Column(name = "idtelefono")
	private Long idTelefono;

	@Column(name = "number", nullable = false, length = 45)
	private String number;

	@Column(name = "citycode", nullable = false, length = 45)
	private String citycode;

	@Column(name = "countrycode", nullable = false, length = 45)
	private String countrycode;

	@ManyToOne
	@JoinColumn(name = "idusuario")
	private UsuarioEntity usuario;

	public Long getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

}