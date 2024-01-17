package databaseConnectivity;
import java.sql.*;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/sys";
		String uname = "root";
		String pass ="Bhavitha@9572";
		int rollno=6;
		String sname="haldi";
		String query="insert into student values (?,?);";
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(query);  //prepared statement
		st.setInt(1, rollno);
		st.setString(2 , sname);
		
		//ResultSet rs =st.executeQuery(query);
		
//		while(rs.next()) {
//		
//		String userData =rs.getInt(1) + "  " +rs.getString(2);
//		
//		System.out.println(userData);
//		}
		int count =st.executeUpdate();
		
		System.out.println(count+ "rows affected");
		
		
		st.close();
		con.close();
		
		
	}

}
