package edu.bit;

public class SqlManager {
	public static void main(String[] args) {
		System.out.println(SqlSingleton.getConnection());
		System.out.println(SqlSingleton.getConnection());
	}
}
/**
private static void getTransactionInfo() {
try {
	Connection connection = getConnection();
	// create a statement
	Statement statement = connection.createStatement();
	String sql = "select b.transacted_on, b.transaction_type, c.name, b.amount from (select customer_id, name from icici.customer where customer_id = 1) a inner join icici.customer_transaction b on a.customer_id = b.customer_id inner join icici.transaction_type c on b.transaction_type = c.id";

	// executing the statement and getting response from mysql
	ResultSet response = statement.executeQuery(sql);

	// code to process response from mysql
	while (response.next()) {
		System.out.println(response.getString("transacted_on") + "||" + response.getInt("transaction_type") + "||" + response.getString("name") + "||" + response.getFloat("amount"));
	}

	// close the connection
	closeConnection(connection);
} catch (SQLException e) {
	System.err.println(e.getMessage());
}
}

private static void getCustomerInfo() {
try {
	// authentication with mysql
	Connection connection = getConnection();

	// create a statement
	Statement statement = connection.createStatement();
	String sql = "select customer_id, name, account_number, balance from icici.customer";

	// executing the statement and getting response from mysql
	ResultSet response = statement.executeQuery(sql);

	// code to process response from mysql
	while (response.next()) {
		System.out.println(response.getInt("customer_id") + "||" + response.getString("name") + "||"
				+ response.getInt("account_number") + "||" + response.getFloat("balance"));
	}

	// close the connection
	closeConnection(connection);
} catch (SQLException e) {
	System.err.println(e.getMessage());
}
}
*/