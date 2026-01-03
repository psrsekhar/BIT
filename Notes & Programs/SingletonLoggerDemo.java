import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Logger {
	private static Logger instance;
	private PrintWriter writer;

	private Logger() {
		try {
			writer = new PrintWriter(new FileWriter("app.log", true), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static synchronized Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void log(String message) {
		writer.println(message);
		System.out.println("Logged: " + message);
	}
}

public class SingletonLoggerDemo {
	public static void main(String[] args) {
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();

		logger1.log("Application started.");
		logger2.log("User logged in.");

		// Both references point to the same instance
		System.out.println(logger1 == logger2); // true
	}
}
