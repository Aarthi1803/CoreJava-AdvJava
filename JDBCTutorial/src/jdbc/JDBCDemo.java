package jdbc;
import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String userData = null;
		String url = "jdbc:mysql://localhost:3306/aliens";
		String username = "root";
		String password = "root";
		String uname = "Dhanam";
		int uid = 8;
//		String query = "select username from student where userid = 3";
//		String query = "select * from student";
//		String query = "insert into student(userid, userName) values (4,'Amudha'),(5,'Muthaiya'),(6, 'Magesh')";
//		String query = "insert into student(userid, userName) values ("+ uid + ",' "+uname + "')";
		String query = "insert into student(userid, userName) values (?,?)";
//		Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. 
//		The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.		
//		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
//		Statement st = con.createStatement(); // To get values dynamically we use PreparedStatement rather than Statement
//		ResultSet rs = st.executeQuery(query); // firing query to execute table - we use ResultSet rs = st.executeQuery(query);
//		while(rs.next()) {
//			userData = rs.getInt(1)+ " : " + rs.getString(2);
//			System.out.println(userData);
//		}	
//		int count = st.executeUpdate(query); // executeUpdate gives you result of how many rows are affected. Eg: while inserting 3 rows are affected
//		System.out.println(count + " rows(s) affected");
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, uid);
		pst.setString(2, uname);
		int count = pst.executeUpdate();
		System.out.println(count + " rows(s) affected");
		pst.close();
		con.close();
	}
	/* DDL - Data Definition Language - changing the structure of table
	 * DML - Data Manipulation Language - changing values in a table - we use int count = executeUpdate(query); - executeUpdate gives you result of how many rows are affected. Eg: while inserting 3 rows are affected
	 * DQL - Data Query Language - firing query to execute table - we use ResultSet rs = st.executeQuery(query);
	 * TCL - Transaction Control Language - grant permission, revoke permission etc.
	 * DAO - Data Access Object - You should always write your database steps inside DAO layer. 
	 * If you have any problem with the database you will only change the DAO layer not the whole software.
	 * Fetch Multiple records from database | mysql :
	 * Once you successfully logged into database, instantiates a 'Statement' object that carries your SQL language query 
	 * to the database then instantiates a 'ResultSet' object that retrieves the results of your query, and executes a simple while loop, 
	 * which retrieves and displays those results.
	 */
}
