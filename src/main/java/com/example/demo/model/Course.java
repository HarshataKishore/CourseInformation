package com.example.demo.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course_Table")
public class Course {

	@Id
	@GeneratedValue
	@Column(name = "Course_Id")
	private int id;
	
	@Column(name = "Course_Name")
	private String courseName;
	
	@Column(name = "Faculty_Name")
	private String facultyName;
	
	@Column(name = "Student_Name")
	private String studentName;
	
	@Column(name = "Slots")
	private Time slot;
	
	@Column(name = "Start_Date")
	private Date stdte;
	
	@Column(name = "End_Date")
	private Date edte;
	
	@Column(name = "Fee")
	private double fee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Time getSlot() {
		return slot;
	}

	public void setSlot(Time slot) {
		this.slot = slot;
	}

	public Date getStdte() {
		return stdte;
	}

	public void setStdte(Date stdte) {
		this.stdte = stdte;
	}

	public Date getEdte() {
		return edte;
	}

	public void setEdte(Date edte) {
		this.edte = edte;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}	
	
}
