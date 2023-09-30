package programs;

public class StudentParameterised {
	int age;
	String name;
	public StudentParameterised(int a,String s){
	age=a;
	name=s;
	}
	public static void main(String args[]){
	StudentParameterised s=new StudentParameterised(22,"nandu");
	System.out.println(s.age);
	System.out.println(s.name);
	}
	}