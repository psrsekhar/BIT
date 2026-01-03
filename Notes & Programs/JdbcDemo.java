import java.sql.*;
import java.util.*;
class JdbcDemo {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter username");
    String username = scanner.nextLine();
    System.out.println("Enter password");
    String password = scanner.nextLine();
    String query = "select * from users where username='" + username + "' and password='" + password + "'";
    System.out.println(query); 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_db", "root", "root");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query);
    while (rs.next()) {
      System.out.println(rs.getString("username") + "..." + rs.getString("password"));
    }
    rs.close();
    st.close();
    con.close();
  }
}
