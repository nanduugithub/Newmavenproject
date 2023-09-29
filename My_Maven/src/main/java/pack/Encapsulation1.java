package pack;

public class Encapsulation1 {
	
	private String name;
	private int age;
	
	public void setDetails(int a,String n) {
	age=a;
	name=n;
	}
	public void getDetails() {
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
