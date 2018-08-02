package com.coursemangement.course.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemangement.course.data.CourseJpa;

public interface CourseDao {
	
	 public List<CourseJpa> findAll();
	 
	 public int registerCourse(CourseJpa courseJpa);
	
	
	
	

}
