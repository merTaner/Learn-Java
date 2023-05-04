import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		DbHelper dbHelper = new DbHelper();
		Statement statetment;
		ResultSet resultSet;
		try {
			connection = dbHelper.getConnection();
			statetment = connection.createStatement();
			resultSet = statetment.executeQuery("select * from products");
			
			ArrayList<Products> products = new ArrayList<>();
			
			while(resultSet.next()) {
				products.add(new Products(
							resultSet.getInt("products_id"),
							resultSet.getInt("uom_id"),
							resultSet.getString("name"),
							resultSet.getDouble("unit_price")));			
						;
			}
			System.out.println(products.size());
			
		} catch (SQLException exception) {
			dbHelper.showErrorMessage(exception);
		}
		finally {
			connection.close();
		}

	}

}
