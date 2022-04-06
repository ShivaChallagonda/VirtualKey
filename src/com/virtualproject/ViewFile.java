package com.virtualproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ViewFile {
	
	public void viewfile() throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name you want to search(with .txt .docx etc..)");
		String fname = sc.nextLine();
		//One time path for the directory
		File file = new File("D:\\Virtual Key\\"+fname);
		
		if(file.exists() && file.length()>0) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
				br.close();
			} 
			catch (FileNotFoundException e) { 
				System.out.println("FileNotFoundException");
			} 
			catch (IOException e) {
				System.out.println("IOException");
			}
			
		}
		else if(file.exists() && file.length()==0) {
			System.out.println("File exists but there is no content to display!");
		}
		else {
			System.out.println("File doesn't exists. Please check the file name once again!");
		}
		
	}

}
