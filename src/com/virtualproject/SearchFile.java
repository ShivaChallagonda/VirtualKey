package com.virtualproject;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
	
	public void searchfile() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name you want to search(with .txt .docx etc..)");
		String fname = sc.nextLine();
		
		//One time path for the directory
		File file = new File("D:\\Virtual Key\\"+fname);
		
		if(file.exists()) {
			System.out.println(fname+" file found in the directory");
		}
		else {
			System.out.println("Oops "+fname+" doesn't exists in the directory");
		}
		
	}

}
