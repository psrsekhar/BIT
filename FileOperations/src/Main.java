import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String filePath = "actress.txt";
		Integer id = null;
		String name = null;
		Double rating = null;
		File file = new File(filePath);
		try {
			if(file.createNewFile()) {
				System.out.println(filePath + " created.");
				FileWriter writer =  new FileWriter(file);			
				for(Integer i=0; i<= args.length; i++) {
					writer.append(args[i]).append("\n");
				}				
				writer.close();
			}else {
				System.out.println("File exists.");
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String text;
			while ((text = reader.readLine()) != null) {
				System.out.println("File content: " + text);
				String[] data = text.split(",");
				id = Integer.parseInt(data[0]);
				name = data[1];
				rating = Double.parseDouble(data[2]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/**
FileOperations operation = new FileOperations("Samantha.txt");
operation.create();
operation.writeToFile("I love Sai...");
operation.appendToFile("I dont bother about break.");
operation.read();
operation.delete();
*/