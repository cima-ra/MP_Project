package shopRegister;

import java.util.ArrayList;
import java.util.List;

import bill.Bill;
import bill.GreetingsBillDecorator;
import bill.SimpleBillDecorator;
import item.Item;
import sortingStrategy.SortingStrategy;

public class Register {

	private int operatodId;
	private List<Item> articleList;

	public Register(int operatorId) {
		articleList = new ArrayList<>();
		this.operatodId = operatorId;
	}

	public void addArticle(Item item) {
		articleList.add(item);
	}

	public void removeArticle(Item item) {
		articleList.remove(item);
	}

	public int getOperatorId() {
		return operatodId;
	}

	public List<Item> getArticles() {
		return articleList;
	}

	public double getTotalPRice() {
		double price = 0;

		for (Item i : articleList) {
			price += i.getPrice();
		}

		return price;
	}

	public String getBill(SortingStrategy sortingStrategy) {
		sortingStrategy.sortList(articleList);

		Bill bill = new SimpleBillDecorator(articleList);

		articleList.clear();

		return new GreetingsBillDecorator(bill).getDescription();
	}
}
