package programs;

public class DetailsOfStudent {
	int rollNo;
	String name;
	static String college="CET";
	public DetailsOfStudent(int r,String n){
	rollNo=r;
	name=n;
	}
	public void printDetails(){
	System.out.println(rollNo+" "+name+" "+college);
	}
	public static void main(String args[]){
	DetailsOfStudent s1=new DetailsOfStudent(12,"eva");
	s1.printDetails();
	DetailsOfStudent s2=new DetailsOfStudent(13,"evaana");
	s2.printDetails();
	}
	}

