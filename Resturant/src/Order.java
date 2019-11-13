import java.util.ArrayList;
import java.util.List;

public class Order {
List<Item> itemes = new ArrayList<Item>();
private int orderId=0;
Custmor custmor;

public Order(List<Item> list , Custmor cust) {
	// TODO Auto-generated constructor stub
	itemes=list;
	custmor=cust;
	orderId++;
}
public double getTotalPrice() {
	// TODO Auto-generated method stub
double sum=0;
	for (int i=0 ;i<itemes.size();i++)
	sum=sum+itemes.get(i).getPrice();
	return sum;
}
public int getOrderId() {
	return orderId;
}
public List<Item> getOrderItaem() {
	// TODO Auto-generated method stub
	return itemes;

}


}