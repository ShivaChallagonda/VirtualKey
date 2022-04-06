package com.virtualproject;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome Virtual Key Project");
		Scanner sc = new Scanner(System.in);
		System.out.println();
		while(true) {
			System.out.println("Enter Your Choice");
			System.out.println("Press 1-To perform file operations or 2- To exit from the application");
			String choice =sc.nextLine();
			if(choice.equals("1")) {
				System.out.println("Select any File Operation below");
				System.out.println("1-To retrieve all files in Ascending order");
				System.out.println("2-To add a new file and add content to the new file");
				System.out.println("3:To add content to the existing file");
				System.out.println("4-To search for file");
				System.out.println("5-To view a file");
				System.out.println("6-To delete a file from a directory");
				System.out.println("7-Exit from the file operations");
				
				System.out.println("------------------------------------------------");
				System.out.println("Enter a valid operation:");
				String operation = sc.nextLine();
				
				switch(operation) {
				case "1":ShowFiles show = new ShowFiles();
				show.showfiles();
				break;
				
				case "2":AddFile add = new AddFile();
				add.addfile();
				break;
				
				case "3":AddContent content = new AddContent();
				content.addcontent();
				break;
				
				case "4":SearchFile search = new SearchFile();
				search.searchfile();
				break;
				
				case "5":ViewFile view = new ViewFile();
				view.viewfile();
				break;
				
				case "6":DeleteFile delete = new DeleteFile();
				delete.deletefile();
				break;
				
				case "7":break;
				
				default:System.out.println("Invalid option!");
				
				}
			}
			else if (choice.equals("2")) {
				Exit e = new Exit();
				e.exit();
				break;
					
				}
			else {
				System.out.println("Invalid choice. Please enter a valid choice.");
			}
			System.out.println("**********************************************************************");
			} 
			
		}

}
