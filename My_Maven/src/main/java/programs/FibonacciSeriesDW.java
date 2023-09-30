package programs;

public class FibonacciSeriesDW {

	public static void main(String arg[]){
		int n=6,f1=0,s1=1,i=1;
		do{
		for(i=1;i<=n;i++){
		System.out.println(f1);
		int next_term=f1+s1;
		f1=s1;
		s1=next_term;}
		}
		while(i<=6);
		}
		}
