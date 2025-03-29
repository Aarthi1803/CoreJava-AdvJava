package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_DAO_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDAO dao = new StudentDAO(); //fetching values
//		Student s1 = dao.getStudent(7);
//		System.out.println(s1.username);
		
//		Student s2 = dao.addStudent(); // Inserted data into table using Statement
//		System.out.println(s2.countAffectedRows + " rows(s) affected using Statement");
		
//		Student s3 = new Student(); // Inserted data into table using Prepared Statement
//		s3.userid = 11;
//		s3.username = "Anvi";
//		s3.countAffectedRows = dao.addNewStudent(s3);
//		System.out.println(s3.countAffectedRows + " rows(s) affected using Prepared Statement");
		
//		Student s4 = new Student(); // Removing data from table using Statement
//		s4.countAffectedRows = dao.removeStudent(11); 
//		System.out.println(s4.countAffectedRows + " rows(s) deleted using Statement");
		
		Student s5 = new Student(); // Updating data into table using Statement
		s5.userid = 2;
		s5.username = "Praveen";
		s5.countAffectedRows = dao.updateStudent(s5);
		System.out.println(s5.countAffectedRows + " rows(s) updated using Statement");
	}

}

class StudentDAO{
	
	public Connection connect() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/aliens";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
	

	public Student getStudent(int userid) throws ClassNotFoundException, SQLException {
		String query = "select username from student where userid =" + userid;
		Student s = new Student();
		s.userid = userid;
		Connection con = connect();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			String name = rs.getString(1); // or String name1 = rs.getString("username");
			s.username = name;
		}
		return s;
	}

	public Student addStudent() throws ClassNotFoundException, SQLException { // Inserted data into table using Statement
		String query = "insert into student(userid, userName) values (9,'Dilip')";
		Connection con = connect();
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		Student s = new Student();
		s.countAffectedRows = count;
		return s;
	}
	
	public int addNewStudent(Student s3) throws SQLException, ClassNotFoundException { // Inserted data into table using Prepared Statement
		String query = "insert into student(userid, userName) values (?,?)"; 
		Connection con = connect();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, s3.userid);
		pst.setString(2, s3.username);
		int countAffectedRows = pst.executeUpdate();
		return countAffectedRows;
	}
	
	public int removeStudent(int userid) throws ClassNotFoundException, SQLException {
		String query = "delete from student where userid = " + userid;
		Connection con = connect();
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		return count;
	}
	
	public int updateStudent(Student s5) throws ClassNotFoundException, SQLException {
//		update student set userName = "Aarthi1" where userid = 1;
		String query = "update student set username = '" + s5.username + "' where userid = " + s5.userid; // remember to use '' before " " because it is a string type
		Connection con = connect();
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		return count ;
	}
}

class Student{
	int userid;
	String username;
	int countAffectedRows;
}

/* In computer software, a Data Access Object (DAO) is an object that provides an abstract interface to 
   some type of database or other persistence mechanism. 
   By mapping application calls to the persistence layer, DAO provide some specific data operations 
   without exposing details of the database.
  JDBC is a Java database connectivity technology (Java Standard Edition platform) from Oracle Corporation. 
  This technology is an API for the Java programming language that defines how a client may access a database. 
  It provides methods for querying and updating data in a database.
*/
