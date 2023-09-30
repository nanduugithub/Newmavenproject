package programs;

public class CallingStaticMethod {
	public static void addTwoNumbers(){
		int a=10,b=20;
		int sum=a+b;
		System.out.println("sum is "+sum);
		}
		public static void main(String args[]){
		CallingStaticMethod.addTwoNumbers();
		//or
		addTwoNumbers();
		}
		} 