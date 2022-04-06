package com.virtualproject;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	
	public void deletefile() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file name you want to search(with .txt .docx etc..)");
			String fname = sc.nextLine();
			
			//One time path for the directory
			File file = new File("D:\\Virtual Key\\"+fname);
			
			if(!file.exists()){
				System.out.println("File doesn't exists in directory");
			}
			else if(file.exists() && file.delete()) {
				System.out.println(fname+" File deleted successfully");
			}
			else {
				System.out.println("Error occurred while deleting the file.");
			}
	}

}
