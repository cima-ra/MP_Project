package item;

import java.util.LinkedList;

public class CompoundItem implements Item{
	private LinkedList<Item> itemsList;
	private double price;
	private String name;
	private int id;
	
	public CompoundItem(String name, int id) {
		itemsList = new LinkedList<Item>();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public void addItem(Item item) {
		itemsList.add(item);
		price += item.getPrice();
	}

	@Override
	public void removeItem(Item item) {
		itemsList.remove(item);
		price -= item.getPrice();
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int getId() {
		return id;
	}
	
	public LinkedList<Item> getItems(){
		return itemsList;
	}
	
	@Override
	public String toString() {
		String items = new String(name + ": - ");
		for(Item i : itemsList) {
			items += i.toString() + " - ";
		}
		return items;
	}

}
