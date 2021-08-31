package entities;

public /*final*/ class SavingsAccount extends Account { //	tirei o final para poder usar na classe SavingsAccountPlus

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	// Methods
	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
}
