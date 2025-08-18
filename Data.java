import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		String filePath = "student.csv";
		File file = new File(filePath);
		try {
			if(file.createNewFile()) {
				System.out.println(filePath + " created.");
				FileWriter writer =  new FileWriter(file);			
				for(Integer i=0; i< args.length; i++) {
					writer.append(args[i]).append("\n");
				}				
				writer.close();
			}else {
				System.out.println("File exists.");
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
//java Data 1,Samantha,5.0 2,Trisha,4.9



