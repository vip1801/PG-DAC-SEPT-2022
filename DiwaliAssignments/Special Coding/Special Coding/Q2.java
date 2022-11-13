import java.util.*;

public class Q2
{
    public static void detectCapitalUse(String word) 
	{
		String word1 = word.replaceAll("[,;:.'\\s]", "");
		
        if (word1.matches("[A-Z]*|[A-Z][a-z]+|[a-z]+"))
		{
			System.out.println("The given string is properly Capitalized.");
		}
		else
		{
			System.out.println("The given string is not properly Capitalized.");
		}
    }
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		
		String word = sc.nextLine();
		
		detectCapitalUse(word);
	}
}