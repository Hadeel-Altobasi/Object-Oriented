public class Person {
private String name ;
private String birthDate;

public Person(String name , String date) {
	// TODO Auto-generated constructor stub
this.name=name;
this.birthDate=date;

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBirthDate() {
	return birthDate;
}

public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
}