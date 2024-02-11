package bill;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import item.Item;
import item.SingleItem;

public class TestGreetingsBillDecorator {
	private List<Item> items;

	@Before
	public void inInizializeList() {

		items = new LinkedList<>();
		items.add(new SingleItem(50, "Ite", 0));
		items.add(new SingleItem(20, "Arc", 1));
		items.add(new SingleItem(15, "WWF", 2));

	}

	@Test
	public void testGetDescription() {
		SimpleBillDecorator simpleBill = new SimpleBillDecorator(items);
		GreetingsBillDecorator greetingBill = new GreetingsBillDecorator(simpleBill);

		assertThat(greetingBill.getDescription())
				.isEqualTo("Scontrino Acquisto: Ite, Arc, WWF, 85.0 Arrivederci e buona giornata.");
	}
}
