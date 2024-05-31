package com.techlabs.stsatictest;

import com.techlabs.model.AccountModel;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountModel account=new AccountModel(234, "poojitha", 100000);
		
		account.display();
		
		AccountModel account2=new AccountModel(165,"harshini",20000);
		account2.display();
		
		

	}
	{
		System.out.println("total accounts created is:");
	}

}
