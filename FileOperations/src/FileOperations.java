import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	private String filePath;

	public FileOperations(String filePath) {
		this.filePath = filePath;
	}

	public void create() {
		File file = new File(this.filePath);
		try {
			if (file.createNewFile()) {
				System.out.println(this.filePath + " is created.");
			} else {
				System.out.println("File exists in the system.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeToFile(String content) {
		try (FileWriter writer = new FileWriter(this.filePath)) {
			writer.write(content);
			System.out.println("Content added to file..");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void appendToFile(String content) {
		try (FileWriter writer = new FileWriter(this.filePath, true)) {
			writer.write(content);
			System.out.println("Content appended to file..");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void read() {
		try (BufferedReader reader = new BufferedReader(new FileReader(this.filePath))) {
			String content;
			while ((content = reader.readLine()) != null) {
				System.out.println("File content: " + content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void delete() {
		File file = new File(this.filePath);
		if (file.delete()) {
			System.out.println(this.filePath + " is deleted.");
		} else {
			System.out.println("File deletion failed.");
		}
	}
}