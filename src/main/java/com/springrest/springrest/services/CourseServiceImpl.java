package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao coursedao;
	public CourseServiceImpl() {
	}
	
	@Override
	public List<Course> getCourses() {
		return coursedao.findAll();
	}

	@Override
	public Course getCourse(long Id) {
		return coursedao.getOne(Id);
	}

	@Override
	public Course addCourse(Course course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parselong) {
		Course  ent = coursedao.getOne(parselong);
		coursedao.delete(ent);
	}

}
