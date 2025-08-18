import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		String fileName = "privacy.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String text;
			while ((text = reader.readLine()) != null) {
				System.out.println("File content: " + text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}