package programs;

public class StringMethods {

	public static void main(String[] args) {
		String s="Hello World";
		String s1="My Java World";
		String s2="Hello World";
		//length
		int len=s.length();
		System.out.println("length of the given string is:"+len);
		//return a character at specific index
		char specific_char=s.charAt(6);
		System.out.println("character at specific index: "+specific_char);
		//concatenation of two string
		String resultant_string=s.concat(s1);
		System.out.println("concatenation of two string: "+resultant_string);
		//equal and equalIgnoreCase
		boolean equalIgnore_or_not=s.equals(s2);
		System.out.println(equalIgnore_or_not);
		//lower case
		String lower_case=s.toLowerCase();
		System.out.println( lower_case);
		//upper case
		String upper_case=s.toUpperCase();
		System.out.println(upper_case);
		//replace specific character
		String replaced_string=s.replace('l','j');
		System.out.println(replaced_string);
		
		}

}
