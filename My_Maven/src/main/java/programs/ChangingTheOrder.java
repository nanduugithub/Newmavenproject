package programs;

public class ChangingTheOrder {

	public static void printDetails(int id,String name){
		System.out.println(id);
		System.out.println(name);
		}
		public static void printDetails(String name,int id){
		System.out.println(name);
		System.out.println(id);
		}
		public static void main(String args[]){
		printDetails("nandu",1);
		printDetails(1,"nandu");
		}
		}