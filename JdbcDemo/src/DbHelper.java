import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper{
	
	private String userName="root";
	private String password="20011002";
	private String dbUrl="jdbc:mysql://localhost:3306/gs_app";
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl, userName, password);
	}
	
	public void showErrorMessage(SQLException exception) {
		System.out.println("Error : " + exception);
		System.out.println("Error code : " + exception.getErrorCode());
	}
}
