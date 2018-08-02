package com.coursemangement.course.service;

import java.util.List;

import com.coursemangement.course.json.Course;

public interface CourseService {
	
	public List<Course>  findAll();
	
	public int registerCourse(Course course);
	
	public boolean deRegisterAllCourse();

}
