package com.bridge;

public class Person {
	

	private String FirstName;
	private String LastName;
	//private long phoneNumber;
	public Address address;

	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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
	}@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", address=" + address + "]";
	}
}

	/*public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}*/
