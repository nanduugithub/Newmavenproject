package programs;

public class StudentDetailsUsingInvoking {
	static int age;
	static String name;
	public static void setDetails(int a,String n){
	age=a;
	name=n;
	getDetails();
	}
	public static void getDetails(){
	System.out.println(age);
	System.out.println(name);
	}
	public static void main(String args[]){
	setDetails(22,"nandu");
	}
	}