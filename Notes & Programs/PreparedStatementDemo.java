import java.sql.*;
import java.util.*;
class PreparedStatementDemo {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter username");
    String username = scanner.nextLine();
    System.out.println("Enter password");
    String password = scanner.nextLine();
    //String query = "select * from users where username='" + username + "' and password='" + password + "'";
    String query = "select * from users where username=? and password=?";
    System.out.println(query); 
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce_db", "root", "root");
    //Statement st = con.createStatement();
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, username);
    pst.setString(2, password);
    ResultSet rs = pst.executeQuery();
    while (rs.next()) {
      System.out.println(rs.getString("username") + "..." + rs.getString("password"));
    }
    rs.close();
    pst.close();
    con.close();
  }
}
