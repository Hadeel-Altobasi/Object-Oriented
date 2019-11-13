import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Resturant implements FoodProvider{
private String name ;
private String location;
private Number phoneNumber;
List<Employee> employeeList= new ArrayList<Employee>();
Menue menue ;

public Resturant(String name , String location , Number phoneNumber ,HashMap<String, Item> itemes ) {
	// TODO Auto-generated constructor stub
	
	this.name=name;
	this.location=location;
	this.phoneNumber=phoneNumber;
	this.menue=new Menue(itemes);
	
}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public Number getPhoneNumber() {
		return phoneNumber;
	}
	
	
	public void addEmploee(String name  , String dateBirth ,String role)
	{
	Employee employee= new Employee(name, dateBirth ,role);
	employeeList.add(employee);
		
	}
    public void getMenue() {
		// TODO Auto-generated method stub
    	Collection<Item> items=menue.getMenue();
    	System.out.println("Kind \t"+"Price");
    		for (Item i : items )
    			System.out.println(i.getName()+" \t"+i.getPrice());
	}
    
    public void requestOrder(Custmor customer , List<String> item ) {
		// TODO Auto-generated method stub
    	
    	 List<Item> itemOrder=new ArrayList<Item>(); 
    	for (int i=0 ; i<item.size();i++)
    	{
    		String nameItem=item.get(i);
    	Item it=menue.getItem(nameItem);	
    	itemOrder.add(it);
    		
    	}
    	customer.selectOrder(itemOrder);
	}
    
    public void getBil(Custmor custmor) {
		// TODO Auto-generated method stub
    double valueOfBill=	custmor.getOrdercustomer().getTotalPrice();
    System.out.println("\n \n"+this.name+"\t Customer Name:"+custmor.getName());
    System.out.println("Order Number:"+custmor.getOrdercustomer().getOrderId());
    System.out.println("Kind \tPrice");
    List<Item> OItem=custmor.getOrdercustomer().getOrderItaem();
    for(Item i: OItem)
    	System.out.println(i.getName()+"\t"+i.getPrice());
    System.out.println("Your Bill Is :"+valueOfBill);

	}
	
	
	
	
	
}