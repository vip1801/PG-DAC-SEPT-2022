import java.util.*;

class Q3
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide instruction to move Robot (U for up, D for down, R for right & L for Left)");
		
		String inst = sc.next();
		
        Solution sl = new Solution();
		
        System.out.println(sl.roboMoves(inst));
    }
}

class Solution 
{
    public boolean roboMoves(String inst) 
	{
        int x = 0;
        int y = 0;
        
        char[] array = inst.toCharArray();
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 'R')
                x++;    
            else if(array[i] == 'L')
                x--;
            else if(array[i] == 'U')
                y++;    
            else if(array[i] == 'D')
                y--;
        }
        return (x == 0 && y == 0);
    }
}