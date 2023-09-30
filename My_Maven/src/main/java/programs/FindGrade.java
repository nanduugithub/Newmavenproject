package programs;

public class FindGrade {
	public static void main(String arg[]){
		int mark=74;
		if(mark>=40&&mark<=60){
		System.out.println("grade D");
		}
		else if(mark>=61&&mark<=70){
		System.out.println("grade C");
		}
		else if(mark>=71&&mark<=80){
		System.out.println("grade B");
		}
		else if(mark>=81&&mark<=100){
		System.out.println("grade A");
		}
		else{
		System.out.println("failed");
		}
		}}