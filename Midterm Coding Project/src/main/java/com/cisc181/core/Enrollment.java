package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	private Enrollment() {
		 
	}
	public Enrollment(UUID SectionID, UUID StudentID){
		this.EnrollmentID = UUID.randomUUID();
	}
	
	
	
	public void SetGrade(double Grade){ 
		this.Grade = Grade;
	} 
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public void setSectionID(UUID sectionID ){
		SectionID = sectionID;
	}
	public UUID getStudentID(){
		return StudentID;
	}
	
	public void setStudentID(UUID studentID ){
		SectionID = studentID;
	}
	
	public UUID getEnrollmentID(){
		return EnrollmentID;
	}
	
	public void setEnrollmentID(UUID enrollmentID ){
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		// TODO Auto-generated method stub
		return Grade;
	}



}
