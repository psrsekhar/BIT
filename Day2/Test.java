import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // get connection object
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit", "root",
                    "Duck@!4#");
            // create sql query (DDL/DML/TCL)
            String sql = "select id, user_id, product_id, address_id from bit.orders";

            // prepare statement
            Statement statement = connection.createStatement();

            // execution of query
            ResultSet response = statement.executeQuery(sql);
            while (response.next()) {
                System.out.println("Id: " + response.getString("id") + "\tUser ID: " + response.getString("user_id"));
            }
        } catch (SQLException sqlException) {
            System.err.println(sqlException.getMessage());
        } finally {
            // closing the connection
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}