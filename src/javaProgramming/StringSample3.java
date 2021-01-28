package javaProgramming;

public class StringSample3 
{
	public static void main(String[] args) {
		String s = "hello123how@#are$456you*78a9s1&2";
		String s1 = "";
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isAlphabetic(s.charAt(i))) 
			{
				s1 = s1 + s.charAt(i);
			}
			else 
			{
				if (!s1.equals("")) 
				{
					for (int j = s1.length()-1; j >= 0; j--) 
					{
						System.out.print(s1.charAt(j));
					}
					s1="";
				}
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		for (int i = 0; i < s.length(); i++)
		{
			if (Character.isDigit(s.charAt(i))) 
			{
				s1 = s1 + s.charAt(i);
			}
			else 
			{
				if (!s1.equals("")) 
				{
					for (int j = s1.length()-1; j >= 0; j--) 
					{
						System.out.print(s1.charAt(j));
					}
					s1="";
				}
				System.out.print(s.charAt(i));
			}
		}
		System.out.println(s1);
		
	}

}
