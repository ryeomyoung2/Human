package Exercise_19;

public class Account {
	
	private int balance;
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	
	public Account() {
		this.balance = 0;
	}

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			//0 <= x <= 1 // MIN_BALANCE <= x and x <= MAX_BALANCE
			this.balance = balance;
		}
		else {
			System.out.println ("입력값이 잘못되었습니다.");
		}	
	}

	public int getBalance() {
		return this.balance;
	}

}
