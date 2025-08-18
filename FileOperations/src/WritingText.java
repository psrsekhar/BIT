import java.io.FileWriter;
import java.io.IOException;

public class WritingText {

	public static void main(String[] args) {
		String fileName = "privacy.txt";
		String text = "This is my personal file. dont look into it.";
		try(FileWriter writer = new FileWriter(fileName)) {
			writer.write(text);
			System.out.println("Text added to file..");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}