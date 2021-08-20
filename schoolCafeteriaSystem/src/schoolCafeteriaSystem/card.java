package schoolCafeteriaSystem;


public class card {
	
	Double balance;
	
	public card(Double balance) {
		this.balance =balance;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double deductCost(Double balance, Double cost) {
		
	         this.balance = balance;
	         Double newBalance = balance - cost;
	
		return newBalance;
	}

}
