package pack;

public class HierarchicalInheritanceC extends HierarchicalInheritanceA{
	String child2="Child 2 of A";
	public void runC() {
		System.out.println("Run C");
	}
	public static void main(String[] args) {
		HierarchicalInheritanceC c=new HierarchicalInheritanceC();
		c.runA();
		c.runC();
		System.out.println(c.child2);
		System.out.println(c.parent);
	}

}
