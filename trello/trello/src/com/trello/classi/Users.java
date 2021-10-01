package com.trello.classi;
import java.time.LocalDate;

public class Users {
	String id_user;
    Long id_role;
    String username;
    LocalDate birthday;
    String mail;
    Long n_telefono;
    LocalDate date_registrazione;
    LocalDate date_last_access;
    Integer flag_delete;
    
    public Users() {
    	
    }
    
    public Users(String id_user, Long id_role, String username, LocalDate birthday, String mail, Long n_telefono, LocalDate date_registrazione, LocalDate date_last_access, Integer flag_delete){
    	this.id_user = id_user;
    	this.id_role = id_role;
    	this.username = username;
    	this.birthday = birthday;
    	this.mail = mail;
    	this.n_telefono = n_telefono;
    	this.date_registrazione = date_registrazione;
    	this.date_last_access = date_last_access;
    	this.flag_delete = flag_delete;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public Long getId_role() {
		return id_role;
	}

	public void setId_role(Long id_role) {
		this.id_role = id_role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getN_telefono() {
		return n_telefono;
	}

	public void setN_telefono(Long n_telefono) {
		this.n_telefono = n_telefono;
	}

	public LocalDate getDate_registrazione() {
		return date_registrazione;
	}

	public void setDate_registrazione(LocalDate date_registrazione) {
		this.date_registrazione = date_registrazione;
	}

	public LocalDate getDate_last_access() {
		return date_last_access;
	}

	public void setDate_last_access(LocalDate date_last_access) {
		this.date_last_access = date_last_access;
	}

	public Integer getFlag_delete() {
		return flag_delete;
	}

	public void setFlag_delete(Integer flag_delete) {
		this.flag_delete = flag_delete;
	}


    
    
}
