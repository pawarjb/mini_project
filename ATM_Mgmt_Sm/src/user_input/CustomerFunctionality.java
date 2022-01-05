package user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import entity.CustomerDetails;


public class CustomerFunctionality {

	ArrayList<CustomerDetails> list;
	CustomerDetails cust;
	Scanner sn;
	InputStreamReader r;
	BufferedReader br;
	
	
	
	
	
	
	public CustomerFunctionality() {
		sn=new Scanner(System.in);
		r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		cust = new CustomerDetails();
		list = new ArrayList<CustomerDetails>();
	}


	public ArrayList<CustomerDetails> customerInput() throws Exception{
		 
		
		
		System.out.println("Enter the Account Number : ");
		int acc_no = sn.nextInt();
		 cust.setAcc_no(acc_no);
		 
		System.out.println("Enter the Customer Name :");
		String customer_name = br.readLine();
		cust.setCustomer_name(customer_name);

		System.out.println("Enter the Customer Contact :");
		String contact = br.readLine();
          cust.setContact(contact);		

		System.out.println("Enter the Customer Bank Name :");
		String bank_name = br.readLine();
		cust.setBank_name(bank_name);
         
		System.out.println("Enter the Customer Account Name :");
		String acc_name = br.readLine();
		cust.setAcc_name(acc_name);
		
		list.add(cust);
		
		
		return list;
	}
	
	public void userlogin() {
		System.out.println("Enter Your Pin");
		int pin =sn.nextInt();
		
		if(pin <0) {
			System.out.println("Incorrect pin");
		}
		else if(pin>=32546)
		{
			System.out.println("Incorrect pin");
		}
		else
		{
			System.out.println("............Login Successfully.............");
			
		}
		System.out.println(" ");
	}
	
	
	public void userTransaction() throws IOException {
		int deposit,withdraw,balance=0;
		
		System.out.println("Enter your choice");

		System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance");
		int ch=sn.nextInt();
		String z;
		do {
		switch(ch) {
		
		case 1: 
		System.out.println("Enter Deposite Amount");
		deposit=sn.nextInt();
		deposit=balance+deposit;
	
		System.out.println(" U Deposited :"+deposit);
		balance=deposit;
		System.out.println("Total Balance is :"+balance);
		break;
		
		case 2:
			System.out.println("Enter Withdraw Amount");
			withdraw=sn.nextInt();
			withdraw=balance-withdraw;
			System.out.println(" U Withdraw :"+withdraw);
			balance=withdraw;
			System.out.println("Total Balance is :"+balance);
			break;
			
		case 3 :
			System.out.println("Your Current Balance is :"+balance);
		    break;
		    default :
		    	System.out.println("Invalid Choice");
		    	
		    	
		}
		System.out.println("Do you want to continue Y/N");
		 z=br.readLine();
		}while(z.equals("y"));
		
	}

}
