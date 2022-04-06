package com.virtualproject;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShowFiles {
	
	public void showfiles() {
		
		//We need to specify directory (one time)
		
		File file = new File("D:\\Virtual Key");
		if(file.isDirectory()) {
			List<String> listfile = Arrays.asList(file.list());
            //Using sort method in Collections to sort the files in the directory
            Collections.sort(listfile);
            
          //For each loop to print all the files in the directory after sorting
            for(String i :listfile) {
            	System.out.println(i);
            }       
		}
		else {
			System.out.println(file.getAbsolutePath() + " doesn't exists. Please give a valid path.");
		}
	}

}
