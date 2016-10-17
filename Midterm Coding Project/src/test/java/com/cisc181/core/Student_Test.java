package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Student_Test {

	@BeforeClass
	public static void setup() {
	}
 
	@Test
	public void test() throws PersonException, ParseException {
		ArrayList<Course> course = new ArrayList<Course>();
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		course.add(course1);
		course.add(course2);
		course.add(course3);

		ArrayList<Semester> semester = new ArrayList<Semester>();
		Semester Fall = new Semester();
		Semester Spring = new Semester();
		semester.add(Fall);
		semester.add(Spring);

		ArrayList<Section> section = new ArrayList<Section>();
		Section section1 = new Section();
		Section section2 = new Section();
		Section section3 = new Section();
		Section section4 = new Section();
		Section section5 = new Section();
		Section section6 = new Section();
		section.add(section1);
		section.add(section2);
		section.add(section3);
		section.add(section4);
		section.add(section5);
		section.add(section6);

		ArrayList<Student> students = new ArrayList<Student>();
		// public Student(String FirstName, String MiddleName, String
		// LastName,Date DOB, eMajor Major,
		// String Address, String Phone_number, String Email)
		String DOB = "08/04/1996";
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date date = df.parse(DOB);

		Student student1 = new Student("Kyle", "Jose", "Canton", date, eMajor.BUSINESS, "7 Jollyville Lane",
				"(302)-456-2134", "gmars@gmail.com");

		String DOB2 = "04/04/1995";
		SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
		Date date2 = df2.parse(DOB);

		Student student2 = new Student("Ron", "John", "Goldman", date2, eMajor.CHEM, "8 Amityville Lane",
				"(302)-477-2135", "ronnyg@gmail.com");

		String DOB3 = "01/26/1997";
		SimpleDateFormat df3 = new SimpleDateFormat("MM/dd/yyyy");
		Date date3 = df3.parse(DOB3);

		Student student3 = new Student("Lisa", "Jenine", "Cassenova", date3, eMajor.COMPSI, "11 Johnsonville Rd",
				"(215)-342-2009", "L_Cass@gmail.com");

		String DOB4 = "03/31/1998";
		SimpleDateFormat df4 = new SimpleDateFormat("MM/dd/yyyy");
		Date date4 = df4.parse(DOB4);

		Student student4 = new Student("Kyra", "Jessica", "Long", date4, eMajor.NURSING, "6 Carson Lane",
				"(223)-235-4395", "KLong@yahoo.com");

		String DOB5 = "12/25/1994";
		SimpleDateFormat df5 = new SimpleDateFormat("MM/dd/yyyy");
		Date date5 = df5.parse(DOB5);

		Student student5 = new Student("Leroy", "Anthony", "Jenkins", date5, eMajor.PHYSICS, "6 Carson Lane",
				"(223)-235-4395", "blk_gallagher@yahoo.com");

		String DOB6 = "03/15/1996";
		SimpleDateFormat df6 = new SimpleDateFormat("MM/dd/yyyy");
		Date date6 = df6.parse(DOB6);

		Student student6 = new Student("John", "Carl", "Len", date6, eMajor.PHYSICS, "1 Snake Hill St.",
				"(302)-234-3289", "JCL@yahoo.com");

		String DOB7 = "01/01/1993";
		SimpleDateFormat df7 = new SimpleDateFormat("MM/dd/yyyy");
		Date date7 = df7.parse(DOB7);

		Student student7 = new Student("Kevin", "James", "Hart", date7, eMajor.COMPSI, "7409 Winchester Road",
				"(314)-534-1209", "KjH@aol.com");

		String DOB8 = "04/01/1990";
		SimpleDateFormat df8 = new SimpleDateFormat("MM/dd/yyyy");
		Date date8 = df8.parse(DOB8);

		Student student8 = new Student("Larry", "Ben", "Hopkins", date8, eMajor.CHEM, "85 W. School Drive",
				"(904)-348-4938", "dslkfds_jsfoi@yahoo.com");

		String DOB9 = "07/04/1992";
		SimpleDateFormat df9 = new SimpleDateFormat("MM/dd/yyyy");
		Date date9 = df9.parse(DOB9);

		Student student9 = new Student("Alexis", "Kayla", "Blakely", date9, eMajor.BUSINESS, "263 Monroe Circle",
				"(435)-247-4389", "lex_Blake@gmail.com");

		String DOB10 = "12/25/1975";
		SimpleDateFormat df10 = new SimpleDateFormat("MM/dd/yyyy");
		Date date10 = df10.parse(DOB10);

		Student student10 = new Student("Penny", "Mellanie", "Smith", date10, eMajor.NURSING, "360 Mountainview St.",
				"(238)-920-5784", "PMS@gmail.com");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);

		ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();
		for (int i = 0; i < section.size() + 1; i++) {
			for (int j = 0; j < students.size() + 1; j++) {
				Enrollment enrollments = new Enrollment(section.get(i).getSectionID(), students.get(j).getStudentID());
				enrollment.add(enrollments);
			}

		}
		for (int i = 0; i < enrollment.size() + 1; i++) {
			
		}
		
		student10.setMajor(eMajor.COMPSI);

	}
}