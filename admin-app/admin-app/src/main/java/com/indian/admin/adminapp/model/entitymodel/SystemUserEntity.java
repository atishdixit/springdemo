package com.indian.admin.adminapp.model.entitymodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "SYSTEMUSER")
public class SystemUserEntity {

	@Id
	@SequenceGenerator(name = "SystemUserGenerator", sequenceName = "Systemuser__Id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SystemUserGenerator")
	private int id;

	@Column(name = "USERNAME")
	@Size(max = 100)
	private String userName;

	@Column(name = "EMAILID")
	@Size(max = 50)
	private String emailId;

	@Column(name = "PASSWORD")
	@Size(max = 100)
	private String password;

	@Column(name = "HASACTIVE")
	private char hasActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getHasActive() {
		return hasActive;
	}

	public void setHasActive(char hasActive) {
		this.hasActive = hasActive;
	}

}
