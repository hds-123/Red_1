package com.jsplec.bbs.dto;

import java.sql.Timestamp;

public class TDto {

	// Field
	
	int number;
	String name;
	String title;
	Timestamp date;
	String delect;
	
	// Constructor
	
	public TDto() {
		
	}

	public TDto(int number, String name, String title, Timestamp date, String delect) {
		super();
		this.number = number;
		this.name = name;
		this.title = title;
		this.date = date;
		this.delect = delect;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getDelect() {
		return delect;
	}

	public void setDelect(String delect) {
		this.delect = delect;
	}

	
	
	
}