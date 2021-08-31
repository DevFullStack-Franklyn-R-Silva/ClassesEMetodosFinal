package entities;

public class SavingsAccountPlus extends SavingsAccount {// extends SavingsAccount{ // erro por causa final na class
														// SavingsAccount
	@Override
	public void withdraw(double amount) { // coloquei final em withdraw em SavingsAccount
		balance -= amount + 2.0;
	}
}
