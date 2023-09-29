package pack;

public class HierarchicalInheritanceB extends HierarchicalInheritanceA{
	String child1="Child 1 of A";
	public void runB() {
		System.out.println("Run B");
	}
	public static void main(String[] args) {
		HierarchicalInheritanceB b=new HierarchicalInheritanceB();
		b.runA();
		b.runB();
		System.out.println(b.child1);
		System.out.println(b.parent);

	}

}
