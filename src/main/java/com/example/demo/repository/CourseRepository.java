package com.example.demo.repository;


import java.sql.Time;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{

	List<Course> findBycourseName(String courseName);

	List<Course> findByfacultyName(String facultyName);

	List<Course> findBystudentName(String studentName);


}
