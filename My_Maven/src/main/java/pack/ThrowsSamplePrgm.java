package pack;

public class ThrowsSamplePrgm {
	public void divNum(int a,int b) throws ArithmeticException{
		int div=a/b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		ThrowsSamplePrgm c=new ThrowsSamplePrgm();
		try {
			c.divNum(40, 0);
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("Rest of the code");
	}

}
