package programs;
import java.util.Scanner;
public class SingleDimensionalArray {

	public static void main(String arg[]){
	int arr[]=new int[5];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	for(int i=0;i<=4;i++){
	System.out.println(arr[i]);
	}
	System.out.println("second array");
	int brr[]={10,20,30,40,50};
	for(int i=0;i<=4;i++){
	System.out.println(brr[i]);
	}
	System.out.println("input from keyword");
	Scanner sc=new Scanner(System.in);
	int crr[]=new int[5];
	for(int i=0;i<=4;i++){
	crr[i]=sc.nextInt();
	System.out.println(crr[i]);
	}
	}
	}
