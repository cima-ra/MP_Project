package bill;

public class CompleteBill extends BillDecorator{

	public CompleteBill(Bill billDecorated) {
		super(billDecorated);
	}
	
	@Override
	public String description() {
		return super.description() + "Totale euro: " + new Double(price()).toString() +" Grazie per l'acquisto buona giornata."; //Qui ci metto lo strategy
	}
	
	@Override
	public double price() {
		return super.price() + 1.50;
	}
}
