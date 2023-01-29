package com.tslp.dca.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;
	private String role;

//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private User user;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

public Role(Integer roleId, String role) {
	super();
	this.roleId = roleId;
	this.role = role;
}

public Integer getRoleId() {
	return roleId;
}

public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "Role [roleId=" + roleId + ", role=" + role + "]";
}

	

}
