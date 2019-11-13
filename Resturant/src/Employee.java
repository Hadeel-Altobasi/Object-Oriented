
import java.sql.Date;

public class Employee extends Person {
	private static int employeeid = 0;
	private String role;
	
	public Employee(String name, String date , String role) {
		super(name, date);
		this.role=role;
		employeeid++;
	}

	public static int getEmployeeid() {
		return employeeid;
	}

	public String getRole() {
		return role;
	}



}