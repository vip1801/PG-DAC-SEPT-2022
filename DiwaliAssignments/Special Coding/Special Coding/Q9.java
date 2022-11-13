
import java.util.*;

class Q9
{
	static boolean isPalindrome(String str, int low, int high)
	{
		while (low < high)
		{
			if (str.charAt(low) != str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}

	static int possiblePalinAfterRemovingOneChar(String str)
	{
		int low = 0, high = str.length() - 1;

		while (low < high)
		{

			if (str.charAt(low) == str.charAt(high))
			{
				low++;
				high--;
			}
			else
			{

				if (isPalindrome(str, low + 1, high))
					return low;

				if (isPalindrome(str, low, high - 1))
					return high;
				return -1;
			}
		}

		return -2;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string without space ");
		String str = sc.next();
		
		int idx = possiblePalinAfterRemovingOneChar(str);

		if (idx == -1)
			System.out.println("It is not possible to convert this String into a Palindrome ");
		else if (idx == -2)
			System.out.println("String is already a Palindrome");
		else
			System.out.println("String can be converted into a Palindrome by removing character at index " + idx);
	}
}
