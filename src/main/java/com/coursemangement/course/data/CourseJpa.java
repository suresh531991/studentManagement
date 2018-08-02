package com.coursemangement.course.data;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity 
@Table(name ="COURSE")
public class CourseJpa implements Serializable {
	@Id
	@Column(name ="COURSE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private int id;
	
	@Column(name ="COURSE_NAME" ,nullable =false)
	private String name;
	
	@Column(name = "COURSE_DURATION" ,nullable = false)
	private  double duration;
	
	public CourseJpa(){
		
	}
	
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
