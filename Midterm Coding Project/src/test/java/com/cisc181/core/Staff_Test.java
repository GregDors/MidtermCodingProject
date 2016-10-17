package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;



public class Staff_Test {

	@BeforeClass
	public static void setup() {
	} 


	@Test
	public void Stafftest() throws ParseException, PersonException{
		ArrayList<Staff> staff = new ArrayList<Staff>();

		String dateString = "08/04/1983";
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date date = df.parse(dateString);
		
		SimpleDateFormat format_hired = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired = "07/27/2005";
		Date date_hired = format_hired.parse(dateString_hired);
		
		Staff staff1 = new Staff("Kyle", "Jose", "Canton", date, "7 Jollyville Lane", "(302)-456-2134", "gmars@gmail.com",
				"9am - 5pm", 12, 125000, date_hired, eTitle.MR);
		
		String dateString1 = "04/04/1980";
		SimpleDateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = df1.parse(dateString1);
		
		SimpleDateFormat format_hired1 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired1 = "11/2/2000";
		Date date_hired1 = format_hired1.parse(dateString_hired1);
		
		Staff staff2 = new Staff("Ron", "John", "Goldman", date1, "8 Amityville Lane", "(302)-477-2135", "ronnyg@gmail.com",
				"9am - 5pm", 6, 115000, date_hired1, eTitle.MR);
		
		String dateString2 = "01/26/1985";
		SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
		Date date2 = df2.parse(dateString2);
		
		SimpleDateFormat format_hired2 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired2 = "11/2/2005";
		Date date_hired2 = format_hired2.parse(dateString_hired2);
		
		Staff staff3 = new Staff("Lisa", "Jenine", "Cassenova", date2, "11 Johnsonville Rd", "(215)-342-2009", "L_Cass@gmail.com",
				"10am - 6pm", 4, 135000, date_hired2, eTitle.MS);

		String dateString3 = "03/31/1983";
		SimpleDateFormat df3 = new SimpleDateFormat("MM/dd/yyyy");
		Date date3 = df3.parse(dateString3);
		
		SimpleDateFormat format_hired3 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired3 = "11/2/2001";
		Date date_hired3 = format_hired.parse(dateString_hired3);
		
		Staff staff4 = new Staff("Kyra", "Jessica", "Long", date3, "6 Carson Lane", "(223)-235-4395", "KLong@yahoo.com",
				"9am - 6pm", 3, 165000, date_hired3, eTitle.MRS);
		
		String dateString4 = "12/25/1975";
		SimpleDateFormat df4 = new SimpleDateFormat("MM/dd/yyyy");
		Date date4 = df4.parse(dateString4);
		
		SimpleDateFormat format_hired4 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired4 = "06/04/1998";
		Date date_hired4 = format_hired.parse(dateString_hired4);
		
		Staff staff5 = new Staff("Leroy", "Anthony", "Jenkins", date4, "6 Carson Lane", "(223)-235-4395", "blk_gallagher@yahoo.com",
				"9am - 9pm", 1, 200000, date_hired4, eTitle.MR);

		
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		double sal1 = staff1.getSalary();
		double sal2 = staff2.getSalary();
		double sal3 = staff3.getSalary();
		double sal4 = staff4.getSalary();
		double sal5 = staff5.getSalary();
		double total = sal1 + sal2 + sal3 + sal4 + sal5;
		double average = total / ((double)5);
		assertEquals((int)average, 148000);
		
		
	}
	
	@Test(expected = PersonException.class)
	public void StaffExceptionTest1() throws ParseException, PersonException{
		ArrayList<Staff> staff = new ArrayList<Staff>();
		//Invalid DOB
		String dateString = "08/04/1894";
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date date = df.parse(dateString);
		
		SimpleDateFormat format_hired = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired = "07/27/2005";
		Date date_hired = format_hired.parse(dateString_hired);
		
		Staff staff1 = new Staff("Kyle", "Jose", "Canton", date, "7 Jollyville Lane", "(302)-456-2134", "gmars@gmail.com",
				"9am - 5pm", 12, 125000, date_hired, eTitle.MR);
		
		String dateString1 = "04/04/1980";
		SimpleDateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = df1.parse(dateString1);
		
		SimpleDateFormat format_hired1 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired1 = "11/2/2000";
		Date date_hired1 = format_hired1.parse(dateString_hired1);
		
		Staff staff2 = new Staff("Ron", "John", "Goldman", date1, "8 Amityville Lane", "(302)-477-2135", "ronnyg@gmail.com",
				"9am - 5pm", 6, 115000, date_hired1, eTitle.MR);
		
		String dateString2 = "01/26/1985";
		SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
		Date date2 = df2.parse(dateString2);
		
		SimpleDateFormat format_hired2 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired2 = "11/2/2005";
		Date date_hired2 = format_hired2.parse(dateString_hired2);
		
		Staff staff3 = new Staff("Lisa", "Jenine", "Cassenova", date2, "11 Johnsonville Rd", "(215)-342-2009", "L_Cass@gmail.com",
				"10am - 6pm", 4, 135000, date_hired2, eTitle.MS);

		String dateString3 = "03/31/1983";
		SimpleDateFormat df3 = new SimpleDateFormat("MM/dd/yyyy");
		Date date3 = df3.parse(dateString3);
		
		SimpleDateFormat format_hired3 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired3 = "11/2/2001";
		Date date_hired3 = format_hired.parse(dateString_hired3);
		
		Staff staff4 = new Staff("Kyra", "Jessica", "Long", date3, "6 Carson Lane", "(223)-235-4395", "KLong@yahoo.com",
				"9am - 6pm", 3, 165000, date_hired3, eTitle.MRS);
		
		String dateString4 = "12/25/1975";
		SimpleDateFormat df4 = new SimpleDateFormat("MM/dd/yyyy");
		Date date4 = df4.parse(dateString4);
		
		SimpleDateFormat format_hired4 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired4 = "06/04/1998";
		Date date_hired4 = format_hired.parse(dateString_hired4);
		
		Staff staff5 = new Staff("Leroy", "Anthony", "Jenkins", date4, "6 Carson Lane", "(223)-235-4395", "blk_gallagher@yahoo.com",
				"9am - 9pm", 1, 200000, date_hired4, eTitle.MR);

		
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		double sal1 = staff1.getSalary();
		double sal2 = staff2.getSalary();
		double sal3 = staff3.getSalary();
		double sal4 = staff4.getSalary();
		double sal5 = staff5.getSalary();
		double total = sal1 + sal2 + sal3 + sal4 + sal5;
		double average = total / ((double)5);
		assertEquals((int)average, 148000);

	



	}
	@Test(expected = PersonException.class)
	public void StaffExceptionTest2() throws ParseException, PersonException{
		ArrayList<Staff> staff = new ArrayList<Staff>();
		
		String dateString = "08/04/1983";
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date date = df.parse(dateString);
		
		SimpleDateFormat format_hired = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired = "07/27/2005";
		Date date_hired = format_hired.parse(dateString_hired);
		
		Staff staff1 = new Staff("Kyle", "Jose", "Canton", date, "7 Jollyville Lane", "(302)-456-2134", "gmars@gmail.com",
				"9am - 5pm", 12, 125000, date_hired, eTitle.MR);
		
		String dateString1 = "04/04/1980";
		SimpleDateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
		Date date1 = df1.parse(dateString1);
		
		SimpleDateFormat format_hired1 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired1 = "11/2/2000";
		Date date_hired1 = format_hired1.parse(dateString_hired1);
		
		Staff staff2 = new Staff("Ron", "John", "Goldman", date1, "8 Amityville Lane", "(302)-477-2135", "ronnyg@gmail.com",
				"9am - 5pm", 6, 115000, date_hired1, eTitle.MR);
		
		String dateString2 = "01/26/1985";
		SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy");
		Date date2 = df2.parse(dateString2);
		
		SimpleDateFormat format_hired2 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired2 = "11/2/2005";
		Date date_hired2 = format_hired2.parse(dateString_hired2);
		
		Staff staff3 = new Staff("Lisa", "Jenine", "Cassenova", date2, "11 Johnsonville Rd", "(215)-342-2009", "L_Cass@gmail.com",
				"10am - 6pm", 4, 135000, date_hired2, eTitle.MS);

		String dateString3 = "03/31/1983";
		SimpleDateFormat df3 = new SimpleDateFormat("MM/dd/yyyy");
		Date date3 = df3.parse(dateString3);
		
		SimpleDateFormat format_hired3 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired3 = "11/2/2001";
		Date date_hired3 = format_hired.parse(dateString_hired3);
		//Invalid Phone Number
		Staff staff4 = new Staff("Kyra", "Jessica", "Long", date3, "6 Carson Lane", "223 235-4395", "KLong@yahoo.com",
				"9am - 6pm", 3, 165000, date_hired3, eTitle.MRS);
		
		String dateString4 = "12/25/1975";
		SimpleDateFormat df4 = new SimpleDateFormat("MM/dd/yyyy");
		Date date4 = df4.parse(dateString4);
		
		SimpleDateFormat format_hired4 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString_hired4 = "06/04/1998";
		Date date_hired4 = format_hired.parse(dateString_hired4);
		
		Staff staff5 = new Staff("Leroy", "Anthony", "Jenkins", date4, "6 Carson Lane", "(223)-235-4395", "blk_gallagher@yahoo.com",
				"9am - 9pm", 1, 200000, date_hired4, eTitle.MR);

		
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		staff.add(staff5);
		double sal1 = staff1.getSalary();
		double sal2 = staff2.getSalary();
		double sal3 = staff3.getSalary();
		double sal4 = staff4.getSalary();
		double sal5 = staff5.getSalary();
		double total = sal1 + sal2 + sal3 + sal4 + sal5;
		double average = total / ((double)5);
		assertEquals((int)average, 148000);

	


 
	}

}
