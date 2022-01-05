package main_package;

import java.util.ArrayList;

import entity.CustomerDetails;
import user_input.CustomerFunctionality;

public class Atm_System {

	public static void main(String[] args) throws Exception {
		CustomerDetails cd = new CustomerDetails();
		CustomerFunctionality fun =new CustomerFunctionality();
		
		ArrayList<CustomerDetails> arr =fun.customerInput();
		System.out.println(".........WELCOME IN BANK OF MAHARASHTRA "+cd.getCustomer_name()+" ..........");
		for(CustomerDetails c : arr)
		{
			System.out.println("Account Number : "+c.getAcc_no());
			System.out.println("Account holder : "+c.getCustomer_name());
			System.out.println("customer contact : "+c.getContact());
			System.out.println("Bank name is : "+c.getBank_name());
			System.out.println("Account name is : "+c.getAcc_name());
			
			
		}
		fun.userlogin();
		fun.userTransaction();
		

	}

}
