package com.jay.oop.hrsystem;

public class Role {
	private int roleId;
	private String roleName;
	public Role(int roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	public Role() {
		
	}

	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}
	

}
