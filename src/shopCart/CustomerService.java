package shopCart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerService {
	Connection connection;

	public CustomerService() {
		this.connection = ShopCartDatabase.getDBConnection();
	}
	
public void addCustomer(CustomerDetails customer) {
	PreparedStatement smt;
	try {
		String sql = "INSERT INTO CustomerDetails(firstName,lastName,emailId,phoneNo,DateOfBirth) VALUES (?,?,?,?,?)";
		smt = connection.prepareStatement(sql);
		smt.setString(1, customer.getFirstName());
		smt.setString(2, customer.getLastName());
		smt.setString(3, customer.getEmailId());
		smt.setLong(4, customer.getPhoneNo());
		smt.setDate(5, customer.getDateOfBirth());
		int count = smt.executeUpdate();
		if (count >= 1) {
			System.out.println("customer details INSERTED Sucessfully.....");
			//get max(customer_id from customer table)
			
			String customerIdSql = "Select max(customerId) from CustomerDetails ";
			
			smt = connection.prepareStatement(customerIdSql);
			ResultSet rs = smt.executeQuery();
			int customerId = -1;
			while(rs.next()) {
				 customerId = rs.getInt(1);
			}
			
			CustomerAddress address = customer.getCustomerAddress();
			String sql1 = "INSERT INTO CustomerAddress(customerId,aptNum,streetName,city,state,zip,country) VALUES (?,?,?,?,?,?,?)";
			smt = connection.prepareStatement(sql1);
			smt.setInt(1, customerId);
			smt.setInt(2, address.getAptNum());
			smt.setString(3, address.getStreetName());
			smt.setString(4, address.getCity());
			smt.setString(5, address.getState());
			smt.setInt(6, address.getZip());
			smt.setString(7, address.getCountry());
			int count1 = smt.executeUpdate();
			if(count1 >= 1) {
				System.out.println("CustomerAddress INSERTED Sucessfully.....");
				
			}
			
		} else {
			System.out.println("Oops.......! Something went wrong....");
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
	return;	
}
}
