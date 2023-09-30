package programs;

public class ThisKeywordUses {

	//Using ‘this’ keyword to refer current class instance variables
	int rollno;
	String name;
	
public ThisKeywordUses(int rollno, String name) {
		this.rollno=rollno;
		this.name=name;
	}

//	public void display(int rollno,String name) {
//		this.rollno=rollno;
//		this.name=name;	
//	}
//
//	public static void main(String[] args) {
//		ThisKeywordUses s=new ThisKeywordUses();
//		s.display(10,"Java");
//		System.out.println(s.rollno);
//		System.out.println(s.name);
//	}
	public static void main(String[] args) {
		ThisKeywordUses s=new ThisKeywordUses(10,"Java");
		System.out.println(s.rollno);
		System.out.println(s.name);
	}

	

}