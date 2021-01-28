package javaProgramming;

public class StringSample2 {

	public static void main(String[] args) {
		String s = "hello123how@#are$456you*78a9s1&2";
		//s+=" ";
		String num = "";
		int sum = 0;
		int j = 0;
		
		//System.out.println(s.length());
		for ( j = 0; j < s.length(); j++) {
			if (Character.isDigit(s.charAt(j))) 
			{
				num = num + s.charAt(j);
			}
			
			else 
			{
				
				if (!num.equals("") ) 
				{
					System.out.print(num + " + ");
					//System.out.println("---------");
					sum = sum + Integer.parseInt(num);
					num = "";
				}
				
			}
		}
		System.out.print( Integer.parseInt(num) + " = ");
		System.out.println(sum + Integer.parseInt(num));
		
		
	
		char[] c = s.toCharArray();
		int n = 0;
		for (int i = 0; i < c.length; i++) 
		{
			if (c[i] >= '0' && c[i]  <= '9') 
			{
				//n = n + Integer.parseInt(String.valueOf(c[i]));	
				if (i < c.length-1) 
				{
					System.out.print(c[i] + " + ");
					 n = n + Character.getNumericValue(c[i]);
					// n = n + Integer.parseInt(String.valueOf(c[i]));	
				}
				else {
					System.out.print(c[i] + " = ");
					 n = n + Character.getNumericValue(c[i]);
					 //n = n + Integer.parseInt(String.valueOf(c[i]));		
				}
				
			}
		}
		System.out.println(n);

	}

}
