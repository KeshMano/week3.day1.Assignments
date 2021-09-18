package week3.day1;

public class IgnoringCase {

	public static void main(String[] args) {
		// Java program to compare a given string to another string, ignoring case
		// considerations.

		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		if (str1 == str2)
			System.out.println("Strings are same");
		else
			System.out.println("Strings are different");
		
		if (str1.equals(str2))
			System.out.println(" equals:Same text");
		else
			System.out.println("equals:Diff text");
		
		if (str1.equalsIgnoreCase(str2))
			System.out.println("equalsIgnoreCase:Same text");
		else
			System.out.println("equalsIgnoreCase:Diff text");
		
		

	}

}
