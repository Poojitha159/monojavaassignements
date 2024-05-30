
package com.techlabs.enums;
import java.util.Scanner;
public class StudentTestEnum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr n no.of students");
		int n=scanner.nextInt();
		StudentEnum student[]=new StudentEnum[n];
		
		
		for(int i=0;i<n;i++) {
			
			student[i]=new StudentEnum();
			System.out.println("Enetr rollnumber");
			student[i].setRollnumber(scanner.nextInt());
			
			System.out.println("Enetr the name:");
			student[i].setName(scanner.next());
			
			System.out.println("Enetr age:");
			student[i].setAge(scanner.nextInt());
			
			System.out.println("Enetr mailId");
			student[i].setEmailId(scanner.next());
			

		}
		for(StudentEnum stu:student) {
			System.out.println(stu);
			System.out.println("");
		}
		
		
	}

}
