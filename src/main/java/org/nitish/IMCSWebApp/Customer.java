package org.nitish.IMCSWebApp;


public class Customer {

	private String firstName;
	private String lastName;
	private String email;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private Address address;

	public Customer() {

	}

	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [First Name=" + firstName + ", Last Name=" + lastName + ", email =" + email + ", Street address=" + address.getAddress() + ", City " + address.getCity() + ", State =" + address.getState() + " , Zip" + address.getZipCode() + " ]";
	}

}
