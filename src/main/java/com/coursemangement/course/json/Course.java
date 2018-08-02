package com.coursemangement.course.json;

import java.io.Serializable;

public class Course implements Serializable{
	
	/**
	 * SVID
	 */
	private static final long serialVersionUID = 8847594739514259121L;

	private int id;
	
	private String name;
	
	private double duration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	

}
