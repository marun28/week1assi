package week1assignment;

public class reversevenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		/* Pseudo Code:
//		 
//		 * Declare the input as Follow
//	      		String test = "I am a software tester"; 
//		a) split the words and have it in an array
//		b) Traverse through each word (using loop)
//		c) find the odd index within the loop (use mod operator)
//		
//		d)split the words and have it in an array
//		
//		e)print the even position words in reverse order using another loop (nested loop)
//		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
//		
		String test = "I am a software tester";
		String rev ="";
		String[] split = test.split(" ");
		
		int  length = split.length;
		for (int i = 0; i < length; i++) 
		{
		
		//System.out.print(ch[i]);
			
			if (i%2==0)
			{
				//System.out.println(split[i]);
				char[] ch = split[i].toCharArray();
				int length2=ch.length;
				for (int j = length2 -1; j>=0; j--)
					{
					System.out.println(ch[j]);
				rev=rev+ch[j];
				
					}
				System.out.println(rev+ " ");
			}	
			
			else {
		//System.out.println(split[i]);
			
			}
					}
	}
}
	