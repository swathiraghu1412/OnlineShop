package shopCart;

import java.sql.Date;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		ProductServices productdetail = new ProductServices();
		CustomerService customerdetails = new CustomerService();
		Scanner input = new Scanner(System.in);
		System.out.println("Select your operation ");
		System.out.println("1. Product Register");
		System.out.println("2. Customer Registration ");
		System.out.println("3. Order Details ");
		int opearation = input.nextInt();
		switch (opearation) {
		case 1:
			ProductDetails products = new ProductDetails();
			System.out.println("Inserting data ");
			System.out.println("");
	
			System.out.println("Enter the ProductName : ");
			String ProductName = input.next();
			products.setProductName(ProductName);

			System.out.println("Enter the Category : ");
			String Category = input.next();
			products.setCategory(Category);

			System.out.println("Enter your Price : ");
			double Price = input.nextDouble();
			products.setPrice(Price);
			
			productdetail.addProdDetails(products);
	
			break;
		case 2:
			CustomerDetails custdetails = new CustomerDetails();
			System.out.println("Inserting customerdata ");
			System.out.println("");
			
			System.out.println("Enter the firstName");
			String firstName = input.next();
			custdetails.setFirstName(firstName);
	
			System.out.println("Enter the lasttName");
			String lasttName = input.next();
			custdetails.setLastName(lasttName);
			
			System.out.println("Enter the emailId");
			String emailId = input.next();
			custdetails.setEmailId(emailId);
	
			System.out.println("Enter the phoneNo");
			Long phoneNo = input.nextLong();
			custdetails.setPhoneNo(phoneNo);
			
			System.out.println("Enter the dateOfBirth");
			Date sqldate = new Date(12, 12, 12);
			custdetails.setDateOfBirth(sqldate);

			CustomerAddress address = new CustomerAddress();
			
			System.out.println("Enter apartment number");
			int aptNum = input.nextInt();
			address.setAptNum(aptNum);
			
			System.out.println("Enter street name");
			String stName = input.next();
			address.setStreetName(stName);
			
			System.out.println("Enter city");
			String city = input.next();
			address.setCity(city);
			
			System.out.println("Enter state ");
			String state = input.next();
			address.setState(state);
			
			System.out.println("Enter zip");
			int zip = input.nextInt();
			address.setZip(zip);
			
			System.out.println("Enter country");
			String country = input.next();
			address.setCountry(country);
			
			custdetails.setCustomerAddress(address);
			
			customerdetails.addCustomer(custdetails);
			break;
		case 3:

			break;
		default:
			System.out.println("Invalid Operation Selected ");
		}
		input.close();

	}

}
