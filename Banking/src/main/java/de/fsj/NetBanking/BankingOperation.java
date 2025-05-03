package de.fsj.NetBanking;

public class BankingOperation {
	public String doPayment( long accNumber, double amount) {
		return amount  + "amount is paid to Account number "+ accNumber;
	}

}
