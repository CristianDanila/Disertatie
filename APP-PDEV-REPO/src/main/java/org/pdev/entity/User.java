package org.pdev.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="roleId") 
	private Role roleId;
	@OneToOne(cascade = CascadeType.ALL, 
            fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="accountId")
	private AccountDetail accountId; 
	
	public User() {
		super();
	}
	
	public User(int userId, String userName, String userPassword, String userEmail, Role roleId,
			AccountDetail accountId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.roleId = roleId;
		this.accountId = accountId;
	}

	public AccountDetail getAccountId() {
		return accountId;
	}

	public void setAccountId(AccountDetail accountId) {
		this.accountId = accountId;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Role getRoleId() {
		return roleId;
	}
	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
		
}
