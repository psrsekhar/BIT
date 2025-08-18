import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		String fileName = "privacy.txt";
		File file = new File(fileName);
		if(file.delete()) {
			System.out.println(fileName + " is deleted.");				
		}else {
			System.out.println("File deletion failed.");
		}
	}
}