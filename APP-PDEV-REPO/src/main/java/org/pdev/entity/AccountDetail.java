package org.pdev.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "account") 
public class AccountDetail {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	private String name;
	private String surname;
	private String address;
	private String phoneNr;
	@Temporal(TemporalType.DATE)
	private Date registeredDate;
	@Temporal(TemporalType.DATE)
	private Date birthDay;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User userId;
		
	public AccountDetail() {
		super();
		
	}
	
	public AccountDetail(int accountId, String name, String surname, String address, String phoneNr,
			Date registeredDate, Date birthDay, User userId) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phoneNr = phoneNr;
		this.registeredDate = registeredDate;
		this.birthDay = birthDay;
		this.userId = userId;
	}

	public User getUser() {
		return userId;
	}

	public void setUser(User userId) {
		this.userId = userId;
	}

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNr() {
		return phoneNr;
	}
	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}	
}
