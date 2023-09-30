package programs;

public class AdditionReturn {

	public int addTwoNumbers(int r,int d){
		int sum=r+d;
		return sum;
		}
		public static void main(String args[]){
		AdditionReturn a=new AdditionReturn();
		int s=a.addTwoNumbers(10,20);
		System.out.println(s);
		}
		}