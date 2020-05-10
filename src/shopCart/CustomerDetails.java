package shopCart;

import java.sql.Date;

public class CustomerDetails {
private int customerId;
private String firstName;
private String lastName;
private String emailId;
private long phoneNo;
private Date DateOfBirth;

private CustomerAddress customerAddress;

public CustomerAddress getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(CustomerAddress customerAddress) {
	this.customerAddress = customerAddress;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
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
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public Date getDateOfBirth() {
	return DateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	DateOfBirth = dateOfBirth;
}

}
