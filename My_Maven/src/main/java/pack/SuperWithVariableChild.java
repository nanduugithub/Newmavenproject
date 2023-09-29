package pack;

public class SuperWithVariableChild extends SuperWithVariableParent {
	String color="Black";
	public void run() {
		System.out.println("Run Method-Child");
	}
	public void printColor() {
		System.out.println(color);
		System.out.println(super.color);
		System.out.println(a);
		run();
		super.run();
	}
	public static void main(String[] args) {
		SuperWithVariableChild c=new SuperWithVariableChild();
		c.printColor();
		
	}

}
