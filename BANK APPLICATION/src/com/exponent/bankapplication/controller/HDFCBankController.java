package com.exponent.bankapplication.controller;
import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.serviceImpl.HDFC;
import java.util.Scanner;

public class HDFCBankController {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HDFC hd = new HDFC();
		
		System.out.println("-------------------------------------------------"
				         + "\n| >>>>>>>>>>  WELCOME TO HDFC BANK  <<<<<<<<<<< |"
				         + "\n-------------------------------------------------");
		
		boolean accountCreated = false;
		boolean flag = true;
		
		while(flag) {
			
			displayMenu();
			
			System.out.println("");
			System.out.print("--> Enter your preferred option :- ");
			
			if(!sc.hasNextInt()) {
				System.out.println("--> [ERROR] Invalid option. Please enter a valid menu option. ");
				sc.next();
				continue;
			}
			
			int op = sc.nextInt();
			
			if(op == 1) {
				hd.createAccount();
				accountCreated = true;
			}
			
			switch(op) {
			case 1 :

				break;
			case 2 :
				if(!accountCreated) {
					System.out.println("-----------------------------");
					System.out.println("| CREATE YOUR ACCOUNT FIRST |");
					System.out.println("-----------------------------");
					System.out.println("");
					break;
				}
				System.out.print("");
				hd.showAccountDetails();
				break;
			case 3 :
				if(!accountCreated) {
					System.out.println("-----------------------------");
					System.out.println("| CREATE YOUR ACCOUNT FIRST |");
					System.out.println("-----------------------------");
					System.out.println("");
					break;
				}
				hd.showAccountBalance();
				break;
			case 4 :
				if(!accountCreated) {
					System.out.println("-----------------------------");
					System.out.println("| CREATE YOUR ACCOUNT FIRST |");
					System.out.println("-----------------------------");
					System.out.println("");
					break;
				}
				hd.withdrawMoney();
				break;
			case 5 :
				if(!accountCreated) {
					System.out.println("-----------------------------");
					System.out.println("| CREATE YOUR ACCOUNT FIRST |");
					System.out.println("-----------------------------");
					System.out.println("");
					break;
				}
				hd.depositMoney();
				break;
			case 6 :
				if(!accountCreated) {
					System.out.println("-----------------------------");
					System.out.println("| CREATE YOUR ACCOUNT FIRST |");
					System.out.println("-----------------------------");
					System.out.println("");
					break;
				}
				hd.updateAccountDetails();
				break;
			case 7 : 
				System.out.println("----------------------------");
				System.out.print("--> Exit the Menu (true/false) :- ");
				boolean exit = sc.nextBoolean();
				if(exit == true) {
					System.out.println("");
					System.out.println("-------------------");
					System.out.println("|>> Menu Closed <<|");
					System.out.println("-------------------");
					System.out.println("");
					flag = false;
					break;
				}else {
					System.out.println("--> Returning to Main Menu");
					displayMenu();
					break;
				}
			default :
				System.out.println("");
				System.out.println("-------------------------------");
				System.out.println("| INVALID INPUT, TRY AGAIN !! |");
				System.out.println("-------------------------------");
			}
		}
	}

	private static void displayMenu() {
		System.out.println("");
		System.out.println("-------------------------------------------------"
				       + "\n| >>>>>>>   ACCOUNT MANAGEMENT MENU    <<<<<<<< |"
				       + "\n-------------------------------------------------"
				       + "\n| 1. Create Account.                            |"
				       + "\n| 2. Show Account Details.                      |"
				       + "\n| 3. Show Account Balance.                      |"
				       + "\n| 4. Withdraw Money.                            |"
				       + "\n| 5. Deposit Money.                             |"
				       + "\n| 6. Update Account Details.                    |"
				       + "\n| 7. Exit.                                      |"
				       + "\n-------------------------------------------------");
	}
	
}
