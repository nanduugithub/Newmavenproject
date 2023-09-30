package programs;

public class Student {

	int age;
	String name;
	public Student(){
	age=22;
	name="nandu";
	}
	public static void main(String args[]){
	Student s=new Student();
	System.out.println(s.age);
	System.out.println(s.name);
	}
	}