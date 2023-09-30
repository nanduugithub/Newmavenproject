package programs;

public class SamplePrgm {
	int age=22;

	public void addTwoNumbers(int a,int b) {
		int sum=a+b;
		System.out.println("age is"+age);
		printResult(sum);
	}
	public void printResult(int s) {
		System.out.println("sum="+s);
	}
	
	
	public static void main(String[] args) {
		SamplePrgm s=new SamplePrgm();
		s.addTwoNumbers(10,10);

	}

}

