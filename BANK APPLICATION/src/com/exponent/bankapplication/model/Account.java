package com.exponent.bankapplication.model;

/**
 * @author Sarvadnya Sonawane
*/

public class Account {
	
	//POJO CLASS --> TABLE
	//MEMBER --> COLUMN
	private long password;
	private long accountNo;
	private String accountName;
	private String aadharCardNo;
	private String panCardNo;
	private long contactNo;
	private String mailId;
	private double accountBalance;
	private double updateBalance;
	
	public void setPassword(long pass) {
		password = pass;
	}
	
	public long getPassword() {
		return password;
	}
	
	public void setAccountNumber(long acNo) {
		accountNo = acNo;
	}
	
	public long getAccountNumber() {
		return accountNo;
	}
	
	public void setAccountHolderName(String name) {
		accountName = name;
	}
	
	public String getAccountHolderName() {
		return accountName;
	}
	
	public void setAadharCardNo(String aadhar) {
		aadharCardNo = aadhar;
	}
	
	public String getAadharCardNo() {
		return aadharCardNo;
	}
	
	public void setPanCardNo (String pan) {
		panCardNo = pan;
	}
	
	public String getPanCardNo() {
		return panCardNo;
	}
	
	public void setContactNo(long contact) {
		contactNo = contact;
	}
	
	public long getContactNo() {
		return contactNo;
	}
	
	public void setMailId(String mail) {
		mailId = mail;
	}
	
	public String getMailId() {
		return mailId;
	}
	
	public void setAccountBalance(double balance) {
		accountBalance = balance;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	

	@Override
	public String toString() {
		return      "-------------------------------------------------"
				+ "\n| >>>>>>>>>   ACCOUNT HOLDER DETAILS   <<<<<<<< |"
				+ "\n-------------------------------------------------"
				+ "\n| Generated Account No.   :- " + getAccountNumber()                                               
				+ "\n| Account Holder Name     :- " + getAccountHolderName()           
				+ "\n| Aadhar Card No.         :- " + getAadharCardNo()              
				+ "\n| Pan Card No.            :- " + getPanCardNo()                   
				+ "\n| Contact No.             :- " + getContactNo()                  
				+ "\n| Email Address           :- " + getMailId()                      
				+ "\n| Current Account Balance :- Rs." + getAccountBalance() + " /-"
				+ "\n-------------------------------------------------";
	}
	
	

}
