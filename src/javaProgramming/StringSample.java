package javaProgramming;

public class StringSample {

	public static void main(String[] args) {
		String s1 = "hello how are you";
		String[] s2 = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] + s2[i].length() + " ");
		}
		System.out.println();
		for (int i = 0; i < s2.length; i++) {
			System.out.print(s2[i] + " : " + s2[i].length() + " ");
		}
		System.out.println();
	
		for (int i = s2.length - 1; i >= 0; i--) {

			System.out.print(s2[i] + " ");
		}
		System.out.println();
		
		char[] c = s1.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (i % 2 == 0) {
				System.out.print(c[i]);
			}
		}
		System.out.println();
		for (int i = c.length-1 ; i >= 0; i--) 
		{
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 0; i < s2.length; i++) 
		{
			if (i % 2 == 0) 
			{
				System.out.print(s2[i] + " ");
			}
			else
			{
				char[] c1 = s2[i].toCharArray();
				for (int j = c1.length - 1 ; j >= 0; j--) 
				{
					System.out.print(c1[j]);
				}
				System.out.print(" ");
			}
		}
		System.out.println();
		
			
	}

}
