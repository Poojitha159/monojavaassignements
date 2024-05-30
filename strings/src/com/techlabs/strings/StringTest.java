package com.techlabs.strings;

public class StringTest {

	public static void main(String[] args) {
		/*StringBuffer s1=new StringBuffer("ABC");
		System.out.println(s1);
		System.out.println(s1.hashcode());
		s1=s1.append("XYZ");
		//System.out.println(s1.hashcode());
		System.out.println(s1);
		//System.out.println(s1.hashcode());
		//s1="XYZ";
		//String s1="XYZ";
		System.out.println(s1);*/
		StringBuffer middleName=new StringBuffer("Poojitha");
		StringBuffer firstName=new StringBuffer("Makkena");
		String lastname=new String("Harshini");
		 lastname="sandhya";
		 System.out.println(lastname);
		 System.out.println(lastname.hashCode());
		
		concat1(middleName);
		System.out.println(middleName);
		concat2(firstName);
		System.out.println(firstName);

		concat3(lastname);
		System.out.println(lastname);
		 System.out.println(lastname.hashCode());


		
	}

	private static void concat1(StringBuffer middleName) {
		//  Auto-generated method stub
		middleName=middleName.append("makkenaharshini");
		
	}

	private static void concat2(StringBuffer firstName) {
		firstName=firstName.append("poojithaharshini");
	}

	private static void concat3(String lastname) {
		lastname=lastname+"makkenapoojitha";
		
		
	}

}
