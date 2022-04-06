package com.virtualproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	
	public void addfile() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		File fdir = new File("D:\\Virtual Key");
		fdir.mkdir();
		
		System.out.println("Enter the file name you want to search(with .txt .docx etc..):");
		String fname = sc.nextLine();
		
		//One time path for the directory
		File file = new File("D:\\Virtual Key\\"+fname);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File Created Successfully");
			while(true) {
				System.out.println("Do you want to write to the file");
				System.out.println("Press y-to write or e-to exit");
				String response = sc.nextLine();
				
				if(response.equalsIgnoreCase("y")) {	
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
				else if(response.equals("e")) {
					System.out.println("Thanks for creating file on LockedMe..\n You can use this file later at time");
					break;
				}
				else {
					System.out.println("Invalid choice! Please enter a valid choice..");
				}
			}
		}
		
	}

}
