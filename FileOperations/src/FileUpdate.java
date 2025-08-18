import java.io.FileWriter;
import java.io.IOException;

public class FileUpdate {

	public static void main(String[] args) {
		String fileName = "privacy.txt";
		String text = "Still looking in to personal information?";
		try(FileWriter writer = new FileWriter(fileName, true)) {
			writer.write(text);
			System.out.println("Text appended to file..");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
