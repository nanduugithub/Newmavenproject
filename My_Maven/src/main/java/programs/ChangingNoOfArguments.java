package programs;

public class ChangingNoOfArguments {

	public static int sum(int a,int b){
		int s=a+b;
		return s;
		}
		public static int sum(int a,int b,int c){
		int s=a+b+c;
		return s;
		}
		public static void main(String args[]){
		int a=sum(20,30,40);
		System.out.println(a);
		int b=sum(10,20);
		System.out.println(b);
		}
		}