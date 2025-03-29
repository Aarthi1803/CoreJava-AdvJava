package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
	/*
	import package
	load driver and register driver
	create connection
	create statement and execute statement
	process the results
	close the connection
	*/
    	String url = "jdbc:mysql://localhost:3306/aliens";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		int uid=121;
	    String uname="Tom";
//		String sql = "select username from student where userid = 3";
//		String sql = "select * from student";
// 		String sql = "insert into student values (25, 'John')";
// 		String sql = "update student set username = 'Max' where userid = 5";
//	    String sql = "delete from student where userid = 5";
//	    String sql = "insert into student values ("+uid+",'"+uname+"')";
	    String sql = "insert into student values (?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established");
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, uid);
        pst.setString(2, uname);
        pst.execute();
        
//        Statement st = con.createStatement();
//        st.execute(sql); // insert,update,delete data into table
        
//        ResultSet rs = st.executeQuery(sql); // get data from table
//        rs.next();
//        String name = rs.getString("userName");
//        System.out.println("Name of a student is " + name);
        
//        while (rs.next()){
//            System.out.print(rs.getInt("userid") + " - ");
//            System.out.println(rs.getString("userName"));
//        }
        con.close();
        System.out.println("Connection closed");
    }
}