package programs;

public class AddTwoMatrix {

	public static void main(String args[]){
		int a[][]={{1,2,3},{2,4,6},{4,5,4}};
		int b[][]={{2,6,3},{5,4,6},{2,1,3}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+"\t");
		}
		System.out.println();
		}
		}}