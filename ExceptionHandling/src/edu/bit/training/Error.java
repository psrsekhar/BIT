package edu.bit.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Exception handling for error
public class Error {
	public static void main(String[] args){
		mental();//non-recursive
	}
	
	public static void mental(){
		BufferedReader br = null;
		try {
			String filePath = "downloads";
			try {
				br = new BufferedReader(new FileReader(filePath));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			mental();//recursive
		}
		catch(StackOverflowError ex) {
			System.out.println(ex);
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
