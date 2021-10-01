package com.projectTrello;

public class Groups {
		
			public int idGroup;
			public int idUser;
			public String groupName;
			public String description;

	
public Groups() {};

public Groups (int idGroup, int idUser, String groupName, String description) {
	this.idGroup = idGroup;
	this.idUser = idUser;
	this.groupName = groupName;
	this.description = description;
}

public int getIdGroup() {
	return idGroup;
}

public void setIdGroup(int idGroup) {
	this.idGroup = idGroup;
}

public int getIdUser() {
	return idUser;
}

public void setIdUser(int idUser) {
	this.idUser = idUser;
}

public String getGroupName() {
	return groupName;
}

public void setGroupName(String groupName) {
	this.groupName = groupName;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}














}