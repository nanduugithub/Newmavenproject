package pack;

public class SingleInheritance2 extends SingleInheritance1 {
String collage="AMRITA";
	public static void main(String[] args) {
		
		SingleInheritance2 c=new SingleInheritance2();
		c.parentClassMethod();
		System.out.println(c.name);
		System.out.println(c.collage);
	}

}
