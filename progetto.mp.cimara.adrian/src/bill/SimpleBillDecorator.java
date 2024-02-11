package bill;

import java.util.List;

import item.Item;

public class SimpleBillDecorator implements Bill {

	private List<Item> items;

	public SimpleBillDecorator(List<Item> items) {
		this.items = items;
	}

	@Override
	public String getDescription() {
		String allItems = new String("Scontrino Acquisto: ");

		for (Item i : items) {
			allItems += i.toString() + ", ";
		}

		return allItems + Double.toString(getPrice());
	}

	private double getPrice() {
		double price = 0;

		for (Item i : items) {
			price += i.getPrice();
		}

		return price;
	}

}
