package shopRegister;

import java.util.ArrayList;
import java.util.List;

import bill.Bill;
import bill.CompleteBill;
import bill.SimpleBill;
import item.Item;

public class Register{
	
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
	
	public String getBill() {
		Bill bill = new SimpleBill(articleList);
		
		return new CompleteBill(bill).description();
	}
}
