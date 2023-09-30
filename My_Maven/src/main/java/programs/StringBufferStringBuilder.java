package programs;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		String s="Hello World";
		s.replace('H', 'M');
		System.out.println(s);
		StringBuffer sb=new StringBuffer("Hello World");
		sb.reverse();
	    System.out.println(sb);
	    
	    
	    StringBuilder sbildr=new StringBuilder("Hello World");
		sbildr.reverse();
	    System.out.println(sbildr);

	}

}
