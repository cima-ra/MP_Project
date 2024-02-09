package bill;

import java.time.LocalTime;

import greetings.GreeetingsStrategy;
import greetings.HollidayGreetings;
import greetings.NormalGreetings;

public class CompleteBill extends BillDecorator{
	
	private GreeetingsStrategy greetings= new NormalGreetings();
	private GreeetingsStrategy specialGreetings = new HollidayGreetings();

	public CompleteBill(Bill billDecorated) {
		super(billDecorated);
	}
	
	@Override
	public String description() {
		return super.description() + "Totale euro: " + new Double(price()).toString() +" Arrivederci. " + LocalTime.now() + greetings.getGreetings() + specialGreetings.getGreetings();
	}
	
	@Override
	public double price() {
		return super.price() + 1.50;
	}
}
