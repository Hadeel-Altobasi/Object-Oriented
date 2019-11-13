import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		HashMap<String, Item> itemes = new HashMap<String, Item>();
		Item i1 = new Item("Shawarm", 20);
		Item i2 = new Item("Sh", 50);
		Item i3 = new Item("Shaw", 30);
		itemes.put("Shawarm", i1);
		itemes.put("Sh", i2);
		itemes.put("Shaw", i3);

		Resturant rea = new Resturant("Hadeel Resturant", "irbid", 780155, itemes);

		Custmor cas = new Custmor("Ali", "11/1996", "Irbid", 7821576);
		rea.getMenue();
		List<String> oItem = new ArrayList<String>();
		oItem.add("Shawarm");
		oItem.add("Sh");

		rea.requestOrder(cas, oItem);
		rea.getBil(cas);

	}
}