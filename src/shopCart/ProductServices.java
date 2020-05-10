package shopCart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductServices {
	Connection connection;

	public ProductServices() {
		this.connection = ShopCartDatabase.getDBConnection();
	}

	public void addProdDetails(ProductDetails product) {
		PreparedStatement smt;
		try {
			String sql = "INSERT INTO productTable(productName,category,price) VALUES (?,?,?)";
			smt = connection.prepareStatement(sql);
			smt.setString(1, product.getProductName());
			smt.setString(2, product.getCategory());
			smt.setDouble(3, product.getPrice());
			int count = smt.executeUpdate();
			if (count >= 1) {
				System.out.println("INSERTED Sucessfully.....");
			} else {
				System.out.println("Oops.......! Something went wrong....");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;
	}

}

