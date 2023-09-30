package programs;

public class StaticMethodReturn {
	public static int addTwoNumbers(int a,int b){
		int sum=a+b;
		return sum;
		}
		public static void main(String args[]){
		int s=StaticMethodReturn.addTwoNumbers(10,20);
		System.out.println(s);
		int n=addTwoNumbers(20,40);
		System.out.println(n);

		}
		}