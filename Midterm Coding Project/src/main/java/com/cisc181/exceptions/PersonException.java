package com.cisc181.exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception{
	private Person p;

	public PersonException(Person p) {
		this.p = p;
		
	}
	public Person getPerson(){
		return p;
	}

}
 