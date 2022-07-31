package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Course;
import com.example.demo.service.CourseServiceImpl;

@RestController
public class CourseController {
	@Autowired
	CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/Course")
	private List<Course> getAllCourses(){
		return courseServiceImpl.getAllCourses();
	}
	
	@GetMapping("/Course/{id}")
	private  Optional<Course> getCourse(@PathVariable("id")int id) {
		return courseServiceImpl.getCourseById(id);
	}
	
	@PostMapping("/Courses")
	private int saveCourse(@RequestBody Course course) {
		courseServiceImpl.saveCourse(course);
		return course.getId();
	}
	
/*	@PutMapping("/Course/{CourseId}")
	private Course update(@RequestBody Course course) {
		int id = 0;
		courseServiceImpl.updateCourse(course, id);
		return course;
	} */
	@PutMapping("/Courses")
	private Course update(@RequestBody Course course) {
		courseServiceImpl.saveCourse(course);
		return course;
	}
	
	@DeleteMapping("/Course/{CourseId}")
	private void delete(@PathVariable("id") int id) {
		courseServiceImpl.delete(id);
	}
}
