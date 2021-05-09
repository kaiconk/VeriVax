package com.kaiconkcodes.springbootstarter.vaccine;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // tell JPA this is our ORM class
public class Vaccine {
	
	// member variables
	@Id // tell JPA this is our primary key
	private String id; 
	private String name;
	private String desc;
	private String issueDate;
	private String expirationDate;
	
	public Vaccine() {
	
	}
	
	public Vaccine(String id, String name, String desc, String issueDt, String expireDate) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.issueDate = issueDt;
		this.expirationDate = expireDate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

}
