package com.minhacopa.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Group {

	@Id
	private String groupId;
	private String name;
	private Date creationDate = new Date();
	private Map<String, String> groupSettings = new HashMap<>();
	
	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Map<String, String> getGroupSettings() {
		return groupSettings;
	}

	public void setGroupSettings(Map<String, String> groupSettings) {
		this.groupSettings = groupSettings;
	}	
}
