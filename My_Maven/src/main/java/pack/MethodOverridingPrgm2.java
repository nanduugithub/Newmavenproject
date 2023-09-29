package pack;
public class MethodOverridingPrgm2 extends MethodOverridingPrgm1{
	@Override
	public void run() {
		System.out.println("Child class run");
	}
	public void display() {
		run();
		super.run();
	}
	public static void main(String[] args) {
		
		MethodOverridingPrgm2 n=new MethodOverridingPrgm2();
		n.display();

	}

}
