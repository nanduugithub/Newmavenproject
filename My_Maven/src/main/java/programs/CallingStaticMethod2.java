package programs;

public class CallingStaticMethod2 {
	static int age=22;
	public static void addTwoNumbers(){
	int a=10,b=20;
	int sum=a+b;
	System.out.println("sum is "+sum);
	}
	public static void main(String args[]){
	addTwoNumbers();
	CallingStaticMethod2.addTwoNumbers();
	System.out.println(CallingStaticMethod2.age);
	System.out.println(age);
	}
	}