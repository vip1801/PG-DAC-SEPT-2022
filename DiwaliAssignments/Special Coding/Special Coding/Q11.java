import java.util.*;

class Q11
{
	static String mergeAlternately(String word1, String word2) 
	{
		final int n = Math.min(word1.length(), word2.length());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; ++i) 
		{
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(i));
		}
		return sb.append(word1.substring(n)).append(word2.substring(n)).toString();
	}	
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = sc.next();
		System.out.println("Enter second string");
		String str2 = sc.next();
		System.out.println(mergeAlternately(str1, str2));
	}
}
