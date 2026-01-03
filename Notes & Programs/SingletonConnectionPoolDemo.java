import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class ConnectionPool {
	private static ConnectionPool instance;
	private List<Connection> availableConnections = new ArrayList<>();
	private final int POOL_SIZE = 5;

	private ConnectionPool() {
		try {
			for (int i = 0; i < POOL_SIZE; i++) {
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
				availableConnections.add(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static synchronized ConnectionPool getInstance() {
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

	public synchronized Connection getConnection() {
		if (availableConnections.isEmpty()) {
			throw new RuntimeException("No available connections!");
		}
		return availableConnections.remove(availableConnections.size() - 1);
	}

	public synchronized void releaseConnection(Connection conn) {
		availableConnections.add(conn);
	}
}

public class SingletonConnectionPoolDemo {
	public static void main(String[] args) {
		ConnectionPool pool = ConnectionPool.getInstance();

		Connection conn1 = pool.getConnection();
		Connection conn2 = pool.getConnection();

		System.out.println("Got two connections from the pool.");

		pool.releaseConnection(conn1);
		pool.releaseConnection(conn2);

		System.out.println("Connections returned to the pool.");
	}
}
