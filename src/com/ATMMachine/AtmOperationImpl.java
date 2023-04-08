package com.ATMMachine;
import java.util.Map;
import java.util.HashMap;


public class AtmOperationImpl implements AtmOperationInterf {
	ATM atm=new ATM();
	Map<Double,String> ministmt=new HashMap<>();
	
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				ministmt.put(withdrawAmount, "Amount Withdrawn");
				System.out.println(withdrawAmount+"Collect The Cash And Card");
				atm.setBalance(atm.getBalance() - withdrawAmount);
				viewBalance();
				 
			}
			else {
				System.out.println("Insufficient Balance !!!");
			}
		}
		else {
			System.out.println("Please Enter The Amount in Multiple of 500");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount, "Amount Deposited");
		System.out.println(depositAmount+" Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
				
		
	}

	@Override
	public void viewMiniStatement() {
		
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

	

}
