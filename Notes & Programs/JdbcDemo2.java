import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JdbcDemo2 {
	public static void main(String[] args) {
		try (
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/indigodb", "indigosa",
						"indigosa");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from flight")) {
			while (rs.next()) {
				System.out.println(rs.getString("id") + "..." + rs.getString("name") + "..." + rs.getString("source") + "..."
						+ rs.getString("destination"));
			}
		} catch (SQLException e) {
			System.out.println("Exception raised with message : " + e.getMessage());
		}
	}
}