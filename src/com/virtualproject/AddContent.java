package com.virtualproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddContent {
	public void addcontent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name you want to search(with .txt .docx etc..)");
		String fname=sc.nextLine();
		
		
		//One time path for the directory
		File file = new File("D:\\Virtual Key\\"+fname);
		
		if(file.exists()) {
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
				System.out.println("Enter the content to write to the file");
				String content =sc.nextLine();
				bw.write(content);
				System.out.println("Writing to the file has successfully completed!");
				bw.close();
				
			} catch (IOException e) {
				System.out.println("Error occurred while writing to the file");
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("File doesn't exists please add file and write content to the file.");
		}
		
	}

}
