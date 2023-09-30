package programs;

public class StudentDetails {

	static int age;
	static String name;
	public static void setDetails(){
	age=22;
	name="nandu";
	getDetails();
	}
	public static void getDetails(){
	System.out.println(age);
	System.out.println(name);
	}
	public static void main(String args[]){
	setDetails();
	}
	}