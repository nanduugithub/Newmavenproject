package programs;

public class ChangingTheDatatypes {
	public static float sum(int a,float b){
		float s=a+b;
		return s;
		}
		public static int sum(int a,int b){
		int s=a+b;
		return s;
		}
		public static void main(String args[]){
		float a=sum(20,30.5f);
		System.out.println(a);
		int b=sum(10,20);
		System.out.println(b);
		}
		}