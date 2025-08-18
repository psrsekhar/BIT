import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		String fileName = "privacy.txt";
		File file = new File(fileName);
		
		try {
			//file.exists() -> 
			//file.length() -> size of a file
			//file.canRead() -> to check read permission
			//file.canWrite() -> to check write permission
			//file.list() -> to get list of files in directory
			//file.isDirectory()
			//file.isFile()
			
			if(file.createNewFile()) {
				System.out.println(fileName + " is created.");				
			}else {
				System.out.println("File exists in the system.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}