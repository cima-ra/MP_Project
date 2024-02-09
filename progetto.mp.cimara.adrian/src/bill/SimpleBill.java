package bill;

import java.util.List;

import item.*;

public class SimpleBill implements Bill{
	
	private List<Item> items;
	
	public SimpleBill(List<Item> items) {
		this.items = items;
	}
	
	@Override
	public String description() {
		String allItems = new String("Scontrino Acquisto: ");
		
		for(Item i : items) {
			allItems += i.toString() + ", ";
		}
		
		return allItems;
	}

	@Override
	public double price() {
		double price = 0;
		
		for(Item i : items) {
			price += i.getPrice();
		}
		
		return price;
	}
	
}
