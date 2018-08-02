package com.coursemangement.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coursemangement.course.controller.CourseController;
import com.coursemangement.course.daoImpl.CourseDaoImpl;
import com.coursemangement.course.manager.CourseDelagate;
import com.coursemangement.course.serviceImpl.CourseServiceImpl;

@Configuration
@ComponentScan("com.coursemangement.course")
public class AppConfig {
	@Autowired
	private CourseDelagate courseDelagate;
	@Autowired
	private CourseServiceImpl courseServiceImpl;
	@Autowired
	private CourseDaoImpl courseDaoImpl;
	
	
	
	
	
	@Bean
	public CourseDelagate courseDelagate(){
		CourseDelagate courseDelagate = new CourseDelagate();
		return courseDelagate;
	}

	@Bean
	public CourseServiceImpl courseServiceImpl(){
		CourseServiceImpl courseServiceImpl = new CourseServiceImpl();
		return courseServiceImpl;
		
		
	}
	@Bean
	public CourseDaoImpl courseDaoImpl(){
		CourseDaoImpl courseDaoImpl = new CourseDaoImpl();
		return courseDaoImpl;
	}
}
