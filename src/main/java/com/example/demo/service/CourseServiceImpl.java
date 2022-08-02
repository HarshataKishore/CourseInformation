package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseServiceImpl {
   
	@Autowired 
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(){
		List<Course> course = new ArrayList<Course>();
		courseRepository.findAll().forEach(courses -> course.add(courses)); 
		return course;
	}
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
	public Course update(Course course) {
		return courseRepository.save(course);
	}
	public void delete(int id) {
		courseRepository.deleteById(id);
	}
	public List<Course> getCourseBycourseName(String courseName) {
		return courseRepository.findBycourseName(courseName);

	}
	public List<Course> getCourseByfacultyName(String facultyName) {
		return courseRepository.findByfacultyName(facultyName);
	}
	
	public Course createCourse(Course course) {
		
		return courseRepository.save(course);
	}
	public Optional<Course> getCourseById(int id) {
		return courseRepository.findById(id);
	}
	
}
