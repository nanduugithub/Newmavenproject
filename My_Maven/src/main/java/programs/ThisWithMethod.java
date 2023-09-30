package programs;

public class ThisWithMethod {

	int age=22;

	public void addTwoNumbers(int a,int b) {
		int sum=a+b;
		System.out.println("age is"+age);
		printResult(sum);
		//or 
		this.printResult(sum);
	}
	public void printResult(int s) {
		System.out.println("sum="+s);
	}
	
	
	public static void main(String[] args) {
		ThisWithMethod s=new ThisWithMethod();
		s.addTwoNumbers(10,10);

	}

}
