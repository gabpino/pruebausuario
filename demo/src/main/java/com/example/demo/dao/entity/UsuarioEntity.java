package com.example.demo.dao.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {

	private static final long serialVersionUID = 2710092005951829440L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idusuario")
	private Long idUsuario;

	@Column(name = "name", nullable = false, length = 45)
	private String name;

	@Column(name = "email", nullable = false, length = 45)
	private String email;

	@Column(name = "password", nullable = false, length = 45)
	private String password;

	@Temporal(TemporalType.DATE)
	@Column(name = "created", nullable = false)
	private Date created;

	@Temporal(TemporalType.DATE)
	@Column(name = "modified", nullable = false)
	private Date modified;

	@Temporal(TemporalType.DATE)
	@Column(name = "last_login", nullable = false)
	private Date lastLogin;

	@Column(name = "isactive", nullable = false)
	private Boolean isactive;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<TelefonoEntity> telefonos;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public UsuarioEntity(Long idUsuario, String name, String email, String password, Date created, Date modified,
			Date lastLogin, Boolean isactive) {
		super();
		this.idUsuario = idUsuario;
		this.name = name;
		this.email = email;
		this.password = password;
		this.created = created;
		this.modified = modified;
		this.lastLogin = lastLogin;
		this.isactive = isactive;
	}

	public UsuarioEntity() {
		super();
	}

}