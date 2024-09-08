package edu.bit.training.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static final String fileName = "privacy.txt";
	
	public static void main(String[] args) {
		File file = new File(fileName);
		if(!file.exists())//checking whether a file exists 
		{
			try {
				if(file.createNewFile())//returns true if the file is created 
				{
					System.out.println("File created....");
					addContent();
					readContent();
				}else {
					System.out.println("Failed to create a file....");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("File already exists....");
		}
	}

	//method to write text to a file
	public static void addContent() {
		try {
			FileWriter writer = new FileWriter(fileName, true);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.append("Samantha and Sairam is together.....");
			bw.newLine();
			bw.append("Sairam was killed by wife.....");
			bw.close();
			writer.close();
			System.out.println("Content added to file...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//method to read from a file
	public static void readContent() {
		try {
			FileReader fw = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fw);
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("End of file.....");
			br.close();
			fw.close();
 		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}