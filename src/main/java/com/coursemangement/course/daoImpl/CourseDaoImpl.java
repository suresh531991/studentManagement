package com.coursemangement.course.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import com.coursemangement.course.dao.CourseDao;
import com.coursemangement.course.data.CourseJpa;

public class CourseDaoImpl implements CourseDao {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public List<CourseJpa> findAll() {
		
		this.entityManager.flush();
		List<CourseJpa> courseJpa = this.entityManager.createQuery("Select  c From CourseJpa c").getResultList();
		
		
		
		
		
		return courseJpa;
	}

	@Override
	public int registerCourse(CourseJpa courseJpa) {
		
		
		this.entityManager.flush();
		this.entityManager.persist(courseJpa);
		
		return courseJpa.getId();
	}

}
