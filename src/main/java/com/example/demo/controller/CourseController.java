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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Course;
import com.example.demo.service.CourseServiceImpl;

@RestController
@RequestMapping("/api")
public class CourseController {
	@Autowired
	CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/Courses")
	private List<Course> getAllCourses(){
		return courseServiceImpl.getAllCourses();
	}
	
	@GetMapping("/Courses/id/{id}")
	private  Optional<Course> getCourseById(@PathVariable("id")int id) {
		return courseServiceImpl.getCourseById(id);
	}
	
	@GetMapping("Courses/courseName/{courseName}")
	private List<Course> getCourseBycourseName(@PathVariable("courseName")String courseName) {
		return courseServiceImpl.getCourseBycourseName(courseName);
	}
	
	@GetMapping("Courses/facultyName/{facultyName}")
	private List<Course> getCourseByfacultyName(@PathVariable("facultyName")String facultyName) {
		return courseServiceImpl.getCourseByfacultyName(facultyName);
	}
	
	@PostMapping("/Course/new")
	private Course createCourse(@RequestBody Course course) {
		return courseServiceImpl.saveCourse(course);
	}
	
	@PutMapping("/Courses/update/{id}")
	private Course update(@PathVariable(value="id")int id,@RequestBody Course course) {
		courseServiceImpl.saveCourse(course);
		return course;
	}
	
	@DeleteMapping("/Courses/{id}")
	private void delete(@PathVariable("id") int id) {
		courseServiceImpl.delete(id);
	}
}
