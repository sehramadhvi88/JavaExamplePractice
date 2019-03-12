package PlayExceptions;

public class ExceptionExample {
	
	public static void main(String[] args) {
		AmountAdder.addAmount(new Amount("RUPEE",5),new Amount("DOLLAR",5));
	}
	
}

class Amount{
	
	String currency;
	int amount;
	
	public Amount(String currency,int amount){
		this.currency=currency;
		this.amount=amount;
	}
	
}

class AmountAdder{
	
	static Amount addAmount(Amount a1,Amount a2){
		if(!a1.currency.equals(a2.currency)){
			throw new RuntimeException("dont match");
		}
		
		return new Amount(a1.currency,a1.amount+a2.amount);
	}
	
	
}



