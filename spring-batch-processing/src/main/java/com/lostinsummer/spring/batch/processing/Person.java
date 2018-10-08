package com.lostinsummer.spring.batch.processing;

import java.math.BigDecimal;

public class Person {

	private String lastName;
	private String firstName;
	private BigDecimal personId;

	public Person() {
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(String firstName, String lastName, BigDecimal personId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.personId = personId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getPersonId() {
		return personId;
	}

	public void setPersonId(BigDecimal personId) {
		this.personId = personId;
	}

	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", personId: " + personId;
	}

}
