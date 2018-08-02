package com.coursemangement.course.manager;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coursemangement.course.json.Course;
import com.coursemangement.course.service.CourseService;
@Component
public class CourseDelagate {
	
	@Autowired
	private CourseService courseService;
	
	
	
//	public void setCourseService(CourseService courseService) {
//		this.courseService = courseService;
//	}

	public List<Course> getCourseDetails(){
		return this.courseService.findAll();
		
		
	}
	
	public int registerCourse(Course course){
		
		return this.courseService.registerCourse(course);
		
	}
	
	public boolean deRegisterCourse(){
		
		return  this.courseService.deRegisterAllCourse();
	}
	
	

}
