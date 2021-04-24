package week1assignment;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	String palin ="madam";
	String rev ="";
	
	char[] ch = palin.toCharArray();
	int length=palin.length();
	for (int i = length-1; i >=0; i--) {
		rev = rev+ch[i];
			}
	if (palin.equals(rev)) {
		System.out.println("it is a palidrome");
		
	} else {
		System.out.println("it is a not palidrome");

	}

	}

}
