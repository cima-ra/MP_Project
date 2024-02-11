package bill;

public class GreetingsBillDecorator extends BillDecorator {

	public GreetingsBillDecorator(Bill billDecorated) {
		super(billDecorated);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Arrivederci e buona giornata.";
	}

}
