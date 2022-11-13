import java.util.*;

class Q5
{
    static String addBinary(String a, String b) 
	{
    
        StringBuilder result = new StringBuilder();
        
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        
        int carry = 0;
        
        while(aLength >= 0 || bLength >= 0){
            
            int sum = carry;
            
            if(aLength >= 0) {
                sum += (a.charAt(aLength--) - '0');        
            }
            
            if(bLength >= 0) {
                sum += (b.charAt(bLength--) - '0');
            }
            
            result.insert(0, sum%2);
            
            carry = (sum / 2);
        }
        
        if (carry > 0) {
            result.insert(0, 1);
        }
        
         return result.toString();
    }
	
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter first binary string");
		String a = sc.next(); 
		System.out.println("Enter second binary string");
		String b = sc.next();
          
        System.out.print(addBinary(a, b));
    }
}