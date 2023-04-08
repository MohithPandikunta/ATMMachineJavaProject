package com.ATMMachine;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		AtmOperationInterf op = new AtmOperationImpl();
		
		int atmnumber=889744;
		int atmpin=1100;
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome To ATM Machine !!!!");
		System.out.println("Enter ATM Nmuber: ");
		int atmNumber=in.nextInt();
		System.out.println("Enter Pin: ");
		int pin=in.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin)){
			while(true) {
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
				System.out.println("Enter Choice: ");
				int ch=in.nextInt();
				if(ch==1) {
					op.viewBalance();
					
					
				}
				else if(ch==2) {
					System.out.println("Enter Withdraw Amount : ");
					double withdrawAmount=in.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(ch==3) {
					System.out.println("Enter Amount to Deposit");
					double depositAmount=in.nextDouble();
					op.depositAmount(depositAmount);
					
					
				}
				else if(ch==4) {
					op.viewMiniStatement();
					
				}
				else if(ch==5) {
					System.out.println("Collect Your ATM Card\n Thank You For Using ATM Machine !!!");
					System.exit(0);
					
				}
				else 
				{
					System.out.println("Please enter correct choice");
				}
				
			}
			
		}	
		
	
		else {
			System.out.println("Incorrect Atm Number or pin");
			System.exit(0);
		}
		
		

	}

}