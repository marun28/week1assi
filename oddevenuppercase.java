package week1assignment;

public class oddevenuppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
				//test.toUpperCase()
				char[] ch = test.toCharArray();
				int  length = ch.length;
				for (int i = 0; i < length; i++) {
				
				//System.out.print(ch[i]);
					
				if (i%2==0) {
					System.out.println(ch[i]);
					
				} else {
				System.out.println(Character.toUpperCase(ch[i]));

				}	
				}

	}

}
