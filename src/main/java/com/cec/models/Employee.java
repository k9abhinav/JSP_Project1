package com.cec.models;

import java.util.Objects;

public class Employee {
	private String FirstName;
	private String LastName;
	private String PhoneNo;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(FirstName, LastName, PhoneNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName)
				&& Objects.equals(PhoneNo, other.PhoneNo);
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", PhoneNo=" + PhoneNo + "]";
	}
	public Employee(String firstName, String lastName, String phoneNo) {
		super();
		FirstName = firstName;
		LastName = lastName;
		PhoneNo = phoneNo;
	}
	
	
//	private  String usn ;
	
	
//	private  String name;
//	
//	
//	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, usn);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(name, other.name) && Objects.equals(usn, other.usn);
//	}
//	
//
//	@Override
//	public String toString() {
//		return "Employee [usn=" + usn + ", name=" + name + "]";
//	}
//
//	public Employee(String usn, String name) {
//		super();
//		this.usn = usn;
//		this.name = name;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public String getUsn() {
//		return usn;
//	}
//
//	public void setUsn(String usn) {
//		this.usn = usn;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	
}
