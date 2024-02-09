package bill;

public abstract class BillDecorator implements Bill{
	
	protected Bill billDecorated;
	
	public BillDecorator(Bill billDecorated) {
		this.billDecorated = billDecorated;
	}
	
	@Override
	public String description() {
		return billDecorated.description();
	}

	@Override
	public double price() {
		return billDecorated.price();
	}
	
	
}
