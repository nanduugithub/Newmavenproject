package pack;

public class ExceptionPropagationExample {
	private void methodA() {
	try {
		methodB();	
	}
	catch (ArithmeticException e) {
		System.out.println("handled");
	}
		
	}
	
	private void methodB() throws ArithmeticException{
		methodC();
		
	}
	private void methodC() throws ArithmeticException{
		int a=10/0;
		throw new ArithmeticException();
		
	}
	public static void main(String[] args) {
		ExceptionPropagationExample cc=new ExceptionPropagationExample();
		cc.methodA();

	}

	
		
}
