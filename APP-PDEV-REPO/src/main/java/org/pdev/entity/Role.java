package org.pdev.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;
	private String roleTitle;
	
	
	public Role() {
		super();
	}
	public Role(int roleId, String roleTitle) {
		super();
		this.roleId = roleId;
		this.roleTitle = roleTitle;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleTitle() {
		return roleTitle;
	}
	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}
	
	
}
