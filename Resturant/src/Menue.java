import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Menue {

	private Map<String, Item> itemes = new HashMap<String, Item>();
	public Menue(HashMap<String, Item> itemes) {
		// TODO Auto-generated constructor stub
		this.itemes=itemes;
	}

	public void addItem(String name, double price) {
		Item item = new Item(name, price);
		itemes.put(name, item);
	}
public Item getItem(String nameItem) {
	// TODO Auto-generated method stub
Item i=itemes.get(nameItem);
return i;
}
	public Collection<Item> getMenue() {
		// TODO Auto-generated method stub
	return itemes.values();
	
	}
	
}