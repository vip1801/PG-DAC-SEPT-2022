import java.util.*;

public class Q16
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String filtered = str.replaceAll("\\[|\\]|\"| ","");
		
		String data [] = filtered.split(",");
		int noOfChanges = 0;
		
		int max = 0;
		int maxIndex = 0;
		for(int i = 0;i < data.length; i++){
		   if(max<data[i].length()){
		       max = data[i].length();
		       maxIndex = i;
		   }
		}
		
		for(int i = 0;i<data.length;i++){
		    if(maxIndex!=i){
		        String temp = data[i];
		        noOfChanges += ( max - temp.length());
		    }
		}
		
		System.out.println(noOfChanges);
	}
}