package pack;

public class Employee {
	int id;
	String name;
	Address address;
	
	public Employee(int id,String name,Address address) {
	this.id=id;
	this.name=name;
	this.address=address;
	
	}
	public void display() {
		System.out.println("ID is:  "+id+"\n"+"NAME: "+name+"\n"+"CITY: "+address.city+"\n"+"STATE: "+address.state+"\n"+"COUNTRY: "+address.country);
	}
	
	
	
	
	public static void main(String[] args) {
		Address addr1=new Address("TVM","KERALA","INDIA");
		Employee e=new Employee(5,"Nandu",addr1);
		e.display();

		
		Address addr2=new Address("KOLLAM","KERALA","INDIA");
		Employee e1=new Employee(7,"Nandu",addr2);
		e1.display();
	}

}
