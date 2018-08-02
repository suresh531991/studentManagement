package com.coursemangement.course.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursemangement.course.dao.CourseDao;
import com.coursemangement.course.data.CourseJpa;
import com.coursemangement.course.json.Course;
import com.coursemangement.course.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	

//	public void setCourseDao(CourseDao courseDao) {
//		this.courseDao = courseDao;
//	}

	@Override
	@Transactional
	public List<Course> findAll() {
		
		List<CourseJpa> courseJpa = this.courseDao.findAll();
		List<Course> courses = new ArrayList<Course>();
		for(CourseJpa itr :courseJpa){
			Course course = new Course();
			course.setDuration(itr.getDuration());
			course.setId(itr.getId());
			course.setName(itr.getName());
			courses.add(course);
		}
		return courses;
		
//		
//		
//		return courses;
		
	}

	@Override
	@Transactional
	public int registerCourse(Course course) {
		
		CourseJpa courseJap = new CourseJpa();
		//courseJap.setId(course.getId());
		courseJap.setName(course.getName());
		courseJap.setDuration(course.getDuration());
		this.courseDao.registerCourse(courseJap);
		System.out.println(courseJap.getId());
		return courseJap.getId();
	}

	@Override
	public boolean deRegisterAllCourse() {
		
		// courseDao.deleteAll();
		 return true;
	}

}
