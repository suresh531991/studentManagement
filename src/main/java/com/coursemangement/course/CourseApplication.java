package com.coursemangement.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.coursemangement.course")
public class CourseApplication extends ServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
}
