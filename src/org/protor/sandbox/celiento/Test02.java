package org.protor.sandbox.celiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {
		
		System.out.println(System.getenv("INPUTS_DIR"));
		

		if (args.length != 0 ) {
			String filePath = args[0];
			File carsFile = new File(filePath);


			try {
				FileReader fileReader = new FileReader(carsFile);
				System.out.println("Found file: " + carsFile.getAbsolutePath());
				System.out.println("----------------------------------------");
				
				System.out.println("Reading file, line by line..");
				
				BufferedReader br = new BufferedReader(fileReader);
				String currentLine;
				int counter = 0;
				
				while ((currentLine = br.readLine()) != null ) {
					System.out.println(++counter + ": " + currentLine);
				}
			} 
				catch (FileNotFoundException e) {
				// e.printStackTrace();
				System.err.println("File " + carsFile.getAbsolutePath() + " not found \nTerminating");
				System.exit(1);
			} 	catch (IOException e) {
				// e.printStackTrace();
				System.err.println("An I/O problem occurred with this file: " + carsFile.getAbsolutePath() + "\nTerminating");
			}


		}

		else {
			System.err.println("You must run this program with arguments");
			System.exit(1);
		}


	}

}
