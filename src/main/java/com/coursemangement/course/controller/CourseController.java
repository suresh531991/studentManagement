package com.coursemangement.course.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coursemangement.course.json.Course;
import com.coursemangement.course.manager.CourseDelagate;

@RestController
public class CourseController {
	
	@Autowired
	private CourseDelagate courseDelagate;
	
	
	
	
	
	
//	public void setCourseDelagate(CourseDelagate courseDelagate) {
//		this.courseDelagate = courseDelagate;
//	}
	@GetMapping("api/course/getCourseInfo")
	public List<Course> getCourseDetails(){
		
		return this.courseDelagate.getCourseDetails();
		
		
		
	}
	@PostMapping(name ="api/course/register", produces ="application/json")
	public int  registerCourse(@RequestBody Course course){
		return this.courseDelagate.registerCourse(course);
		
	}
	
	@GetMapping("api/course/deregistercourse")
	public boolean deregisterAllCourse(){
		return this.courseDelagate.deRegisterCourse();
		
	}

}
