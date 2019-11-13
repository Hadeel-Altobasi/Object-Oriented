import java.sql.Date;
import java.util.List;

public class Custmor extends Person {
	
	private String location ;
	private Number phoneNumber;
	private Order ordercustomer;

	public Custmor(String name , String date ,String location, Number phoneNumber ) {
		super(name, date);
		// TODO Auto-generated constructor stub
		this.location=location;
		this.phoneNumber=phoneNumber;
	}
	
public void selectOrder(List<Item> itemOrder){
	ordercustomer=new Order(itemOrder, this);	
}

public Order getOrdercustomer() {
	return ordercustomer;
}
	

}