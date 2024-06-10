package com.techlabs.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked {

	public static void main(String[] args) {
		
		 
		
		
		try {
			@SuppressWarnings("resource")
			FileInputStream fileInputStream=new FileInputStream("C:\\\\Users\\\\ChHarshini\\\\eclipse-workspace\\\\checked-unchecked-Exception\\\\src\\\\com\\\\techlabs\\\\exception\\\\checkedTest");
			int ch;
			while((ch=fileInputStream.read())!=-1) {
				System.out.println((char)ch);
				//System.out.println('\n');
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}


