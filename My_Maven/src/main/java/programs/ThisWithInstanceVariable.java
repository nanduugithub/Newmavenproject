
package programs;

public class ThisWithInstanceVariable {
	int rollno;
	String name;
	public void display(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public static void main(String[] args) {
		ThisWithInstanceVariable s=new ThisWithInstanceVariable();
		s.display(10,"java");
		System.out.println(s.rollno);
		System.out.println(s.name);
	}

}
