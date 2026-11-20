package com.exponent.bankapplication.serviceImpl;
import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.accountnogenerationvalidation.AccountNumberGeneration;
import com.exponent.bankapplication.model.Account;
import java.util.Scanner;

public class HDFC implements RBI {
	
	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void createAccount() {
		boolean create = false;
		while(!create) {
			System.out.println("");
			System.out.println("------------------------");
			System.out.println("|>>> CREATE ACCOUNT <<<|");
			System.out.println("------------------------");
			System.out.println("");
			System.out.print("--> Create Password               :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid password. Please enter a valid password. ");
				sc.next();
				continue;
			}
			ac.setPassword(sc.nextLong());
			long accountNo =AccountNumberGeneration.generateAccountNo();
			ac.setAccountNumber(accountNo);
			System.out.println("--> Generated account Number      :- " + accountNo);
			sc.nextLine();
			System.out.print("--> Enter Account Holder Name     :- ");
			if(!sc.hasNextLine()) {
				System.out.println("--> [ERROR] Invalid input. Account holder name must contain alphabetic characters only. ");
				sc.next();
				continue;
			}
			ac.setAccountHolderName(sc.nextLine());
			System.out.print("--> Enter Aadhar Card No.         :- ");
			if(!sc.hasNextLine()) {
				System.out.println("--> [ERROR] Invalid input. Please enter a valid numeric value. ");
				sc.next();
				continue;
			}
			ac.setAadharCardNo(sc.nextLine());
			System.out.print("--> Enter Pan Card No.            :- ");
			if(!sc.hasNextLine()) {
				System.out.println("--> [ERROR] Invalid PAN format. Please enter a valid PAN card number. ");
				sc.next();
				continue;
			}
			ac.setPanCardNo(sc.nextLine());
			System.out.print("--> Enter Contact NO.             :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid input. Please enter a valid numeric value. ");
				sc.next();
				continue;
			}
			ac.setContactNo(sc.nextLong());
			sc.nextLine();
			System.out.print("--> Enter Email Address           :- ");
			if(!sc.hasNextLine()) {
				System.out.println("--> [ERROR] Email format is incorrect. Please enter a valid email address. ");
				sc.next();
				continue;
			}
			ac.setMailId(sc.nextLine());
			System.out.print("--> Enter Current Account Balance :- Rs.");
			if(!sc.hasNextDouble()) {
				System.out.println("--> [ERROR] Invalid input. Please enter a valid decimal value. ");
				sc.next();
				continue;
			}
			ac.setAccountBalance(sc.nextDouble());
			System.out.println("");
			System.out.print("--> Confirm Account Creation (true/false) :- ");
			create = sc.nextBoolean();
			if(create == true) {
				System.out.println("");
				System.out.println("------------------------------------");
				System.out.println("|>> Account Created Successfully <<|");
				System.out.println("------------------------------------");
				break;
			}else 
				createAccount();
				break;
		};
	}

	@Override
	public void showAccountDetails() {
		boolean flag = true;
		do {
			System.out.println("");
			System.out.println("--------------");
			System.out.println("|>> LOG IN <<|");
			System.out.println("--------------");
			System.out.println("");
			System.out.print("--> Enter Account No. :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid account number. Please enter a valid numeric account number. ");
				sc.next();
				continue;
			}
			long acc = sc.nextLong();
			System.out.print("--> Enter password    :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid password. Please enter a valid password. ");
				sc.next();
				continue;
			}
			long pass = sc.nextLong();
			if((acc == ac.getAccountNumber()) && (pass == ac.getPassword())) {
				System.out.println("");
				System.out.println("-----------------");
				System.out.println("|>> LOGGED IN <<|");
				System.out.println("-----------------");
				System.out.println("");
				System.out.print(ac);
				System.out.println("");
				flag = false;
				break;
			}else {
				System.out.println("--> [ERROR] Invalid Data !!");
				break;
			}
			
		}while(flag);
		}
	 
	@Override
	public void showAccountBalance() {
		boolean flag = true;
		do {
			System.out.println("");
			System.out.println("--------------");
			System.out.println("|>> LOG IN <<|");
			System.out.println("--------------");
			System.out.println("");
			System.out.print("--> Enter Account No. :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid account number. Please enter a valid numeric account number. ");
				sc.next();
				continue;
			}
			long acc = sc.nextLong();
			System.out.print("--> Enter password    :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid password. Please enter a valid password. ");
				sc.next();
				continue;
			}
			long pass = sc.nextLong();
			if((acc == ac.getAccountNumber()) && (pass == ac.getPassword())) {
				System.out.println("");
				System.out.println("-----------------");
				System.out.println("|>> LOGGED IN <<|");
				System.out.println("-----------------");
				System.out.println("");
				System.out.println("--> Current Account Balance :- Rs." + ac.getAccountBalance() + " /-");
				flag = false;
				break;
			}else {
				System.out.println("--> [ERROR] Invalid Data !!");
				break;
			}
		}while(flag);
	}

	@Override
	public void withdrawMoney() {
		boolean flag = true;
		do {
			System.out.println("");
			System.out.println("--------------");
			System.out.println("|>> LOG IN <<|");
			System.out.println("--------------");
			System.out.println("");
			System.out.print("--> Enter Account No. :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid account number. Please enter a valid numeric account number. ");
				sc.next();
				continue;
			}
			long acc = sc.nextLong();
			System.out.print("--> Enter password    :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid password. Please enter a valid password. ");
				sc.next();
				continue;
			}
			long pass = sc.nextLong();
			if((acc == ac.getAccountNumber()) && (pass == ac.getPassword())) {
				System.out.println("");
				System.out.println("-----------------");
				System.out.println("|>> LOGGED IN <<|");
				System.out.println("-----------------");
				System.out.println("");
				System.out.print("--> Enter Withdraw Amount :- Rs.");
				if(!sc.hasNextDouble()) {
					System.out.println("--> [ERROR] Invalid input. Please enter a valid decimal value. ");
					sc.next();
					continue;
				}
				double withdraw = sc.nextDouble();
				if(ac.getAccountBalance()>=withdraw) {
					ac.setAccountBalance(ac.getAccountBalance() - withdraw);
					System.out.println("");
					System.out.println("--> [SUCCESS] Transaction successful. Rs." + withdraw +  " /- has been withdrawn from your account.");
					flag = false;
					break;
				}else {
					System.out.println("");
					System.out.println("--> [ERROR] Transaction failed. Insufficient balance in the account.");
					break;
				}
			}else {
				System.out.println("--> [ERROR] Invalid Data !!");
				break;
			}
		}while(flag);
	}

	@Override
	public void depositMoney() {
		boolean flag = true;
		do {
			System.out.println("");
			System.out.println("--------------");
			System.out.println("|>> LOG IN <<|");
			System.out.println("--------------");
			System.out.println("");
			System.out.print("--> Enter Account No. :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid account number. Please enter a valid numeric account number. ");
				sc.next();
				continue;
			}
			long acc = sc.nextLong();
			System.out.print("--> Enter password    :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid password. Please enter a valid password. ");
				sc.next();
				continue;
			}
			long pass = sc.nextLong();
			if((acc == ac.getAccountNumber()) && (pass == ac.getPassword())) {
				System.out.println("");
				System.out.println("-----------------");
				System.out.println("|>> LOGGED IN <<|");
				System.out.println("-----------------");
				System.out.println("");
				System.out.print("--> Enter Deposit Amount :- Rs.");
				if(!sc.hasNextDouble()) {
					System.out.println("--> [ERROR] Invalid input. Please enter a valid decimal value. ");
					sc.next();
					continue;
				}
				double deposit = sc.nextDouble();
				ac.setAccountBalance(ac.getAccountBalance() + deposit);
				System.out.println("");
				System.out.println("--> [SUCCESS] Transaction completed. Rs." + deposit + " /- has been credited to your account.");
				flag = false;
				break;
			}else {
				System.out.println("--> [ERROR] Invalid Data !!");
				break;
			}
		}while(flag);
	}

	@Override
	public void updateAccountDetails() {
		boolean flag = false;
		do {
			System.out.println("");
			System.out.println("--------------");
			System.out.println("|>> LOG IN <<|");
			System.out.println("--------------");
			System.out.println("");
			System.out.print("--> Enter Account No. :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid account number. Please enter a valid numeric account number. ");
				sc.next();
				continue;
			}
			long acc = sc.nextLong();
			System.out.print("--> Enter password    :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid password. Please enter a valid password. ");
				sc.next();
				continue;
			}
			long pass = sc.nextLong();
			if((acc == ac.getAccountNumber()) && (pass == ac.getPassword())) {
				System.out.println("");
				System.out.println("-----------------");
				System.out.println("|>> LOGGED IN <<|");
				System.out.println("-----------------");
				System.out.println("");
				
				boolean value = true;
				while(value) {
					updateMenu();
					System.out.println("");
					System.out.print("--> Enter your option :- ");

					if(!sc.hasNextInt()) {
						System.out.println("--> [ERROR] Invalid option. Please enter a valid menu option. ");
						sc.next();
						continue;
					}
					int op = sc.nextInt();
					sc.nextLine();
					
					switch(op) {
					case 1 :
						updateName();
						break;
					case 2 :
						updateEmailId();
						break;
					case 3 :
						updateContactNo();
						break;
					case 4 :
						System.out.println("");
						System.out.print("--> Confirm Updation (true/false) :- ");
						if(!sc.hasNextBoolean()) {
							System.out.println("--> [ERROR] Invalid input. Please enter 'true' to confirm or 'false' to cancel. ");
							sc.next();
							continue;
						}
						boolean confirm = sc.nextBoolean();
						if(confirm == true) {
							System.out.println("");
							System.out.println("------------------------------------");
							System.out.println("|>> Account Updated Successfully <<|");
							System.out.println("------------------------------------");
							System.out.println("");
							value=false;
							break;
						}else {
							System.out.println("");
							break;
						}
					default :
						System.out.println("");
						System.out.println("-------------------------------");
						System.out.println("| INVALID INPUT, TRY AGAIN !! |");
						System.out.println("-------------------------------");
						System.out.println("");
						break;
					}
				}
				
			}else {
				System.out.println("--> [ERROR] Invalid Data !!");
				break;
			}
		}while(flag);
	}

	private void updateMenu() {
		System.out.println("----------------------------");
		System.out.println("|>>>>> UPDATE ACCOUNT <<<<<|");
		System.out.println("----------------------------");
		System.out.println("| 1. Update Name.          |");
		System.out.println("| 2. Update Email Address  |");
		System.out.println("| 3. Update Contact No.    |");
		System.out.println("| 4. Confirm Updation      |");
		System.out.println("----------------------------");
	}
	
	public void updateName() {
		boolean flag = false;
		while(!flag) {
			System.out.println("");
			System.out.print("--> Enter Name          :- ");
			if(!sc.hasNextLine()) {
				System.out.println("--> [ERROR] Invalid account holder name. Please enter a valid name. ");
				sc.next();
				continue;
			}
			String name = sc.nextLine();
			sc.next();
			System.out.println("");
			System.out.print("--> Confirm name update? (true/false) :- ");
			if(!sc.hasNextBoolean()) {
				System.out.println("--> [ERROR] Invalid input. Please enter 'true' to confirm or 'false' to cancel. ");
				sc.next();
				continue;
			}
			flag = sc.nextBoolean();
			if(flag == true) {
				ac.setAccountHolderName(name);
				System.out.println("");
				System.out.println("--> Name Updated Successfully !!");	
				System.out.println("");
				flag = true;
				break;
			}else {
				System.out.println("");
				System.out.println("--> Name update cancelled by user.");
				System.out.println("");
				break;
			}
		}
	}
	
	public void updateEmailId() {
		boolean flag = false;
		while(!flag) {
			System.out.println("");
			System.out.print("--> Enter Email Address :- ");
			if(!sc.hasNextLine()) {
				System.out.println("--> [ERROR] Email format is incorrect. Please enter a valid email address. ");
				sc.next();
				continue;
			}
			String mail = sc.nextLine();
			sc.next();
			System.out.println("");
			System.out.print("--> Confirm Email Update (true/false) :- ");
			flag = sc.nextBoolean();
			if(flag == true) {
				ac.setMailId(mail);
				System.out.println("");	
				System.out.println("--> Email Address Updated Successfully !!");
				System.out.println("");
				flag = true;
				break;
			}else {
				System.out.println("");
				System.out.println("--> Email Address update cancelled by user.");
				System.out.println("");
				break;
			}
		}
	}
	
	public void updateContactNo() {
		boolean flag = false;
		while(!flag) {
			System.out.println("");
			System.out.print("--> Enter Contact No.   :- ");
			if(!sc.hasNextLong()) {
				System.out.println("--> [ERROR] Invalid input. Please enter a valid numeric value. ");
				sc.next();
				continue;
			}
			long mob = sc.nextLong();
			sc.nextLine();
			System.out.println("");
			System.out.print("--> Confirm Contact No. Update (true/false) :- ");
			flag = sc.nextBoolean();
			if(flag == true) {
				ac.setContactNo(mob);
				System.out.println("");	
				System.out.println("--> Contact No. Updated Successfully !!");
				System.out.println("");
				flag = true;
				break;
			}else {
				System.out.println("");
				System.out.println("--> Conatct No. update cancelled by user.");
				System.out.println("");
				break;
			}
		}
	}
}
