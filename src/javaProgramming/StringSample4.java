package javaProgramming;

public class StringSample4 {

	public static void main(String[] args) {
		String[] s = {"teju" , "pradeep" , "rushi" , "amay" , "ujwal" , "amar" };
		for (int i = 0; i < s.length; i++) {
			if(s[i].charAt(0)=='a' || s[i].charAt(0)=='e' || s[i].charAt(0)=='i' ||s[i].charAt(0)=='o' || s[i].charAt(0)=='u' )
			{
				System.out.println(s[i]);
			}
			
		}

	}

}
