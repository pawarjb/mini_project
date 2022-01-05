package entity;

public class CustomerDetails {

	
	public int acc_no;
	public String customer_name;
	public String contact;
	public String bank_name;
	public String acc_name;
	
	public int getAcc_no() {
		return acc_no;
	}
	
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getBank_name() {
		return bank_name;
	}
	
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
	public String getAcc_name() {
		return acc_name;
	}
	
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	
	public CustomerDetails(int acc_no, String customer_name, String contact, String bank_name, String acc_name) {
		super();
		this.acc_no = acc_no;
		this.customer_name = customer_name;
		this.contact = contact;
		this.bank_name = bank_name;
		this.acc_name = acc_name;
	}
	
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
