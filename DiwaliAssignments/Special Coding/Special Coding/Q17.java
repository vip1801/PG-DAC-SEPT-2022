import java.util.*;
  
public class Q17
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter queries");
		String str1 = sc.nextLine();
		
		String filtered1 = str1.replaceAll("\\[|\\]|\"| ","");
		
		String queries [] = filtered1.split(",");
		
		System.out.println("Enter words");
		String str2 = sc.nextLine();
		
		String filtered2 = str2.replaceAll("\\[|\\]|\"| ","");
		
		String words [] = filtered2.split(",");
		
		HashMap<Character,Integer> queriesMap=new HashMap<Character,Integer>();
		
		HashMap<Character,Integer> wordsMap=new HashMap<Character,Integer>();
		
		int totalWords = 0;
		int totalQueries = 0;
		for(int i = 0;i<queries.length;i++){
		    String temp = queries[i];
		    for(int j = 0; j<temp.length();j++){
		        char ch = temp.charAt(j);
		        if(queriesMap.containsKey(ch)){
		            int total = queriesMap.get(ch);
		            queriesMap.put(ch,++total);
		            if(totalQueries<total){
		                totalQueries = total;
		            }
		        }else{
		            queriesMap.put(ch,1);
		        }
		    }
		}
		
		for(int i = 0;i<words.length;i++){
		    String temp = words[i];
		    for(int j = 0; j<temp.length();j++){
		        char ch = temp.charAt(j);
		        if(wordsMap.containsKey(ch)){
		            int total = wordsMap.get(ch);
		            wordsMap.put(ch,++total);
		            if(totalWords<total){
		                totalWords = total;
		            }
		        }else{
		            wordsMap.put(ch,1);
		        }
		    }
		}
		
		if(totalWords==totalQueries){
		    System.out.println(0);
		}else if (totalQueries<totalWords){
		    System.out.println(totalWords);
		}else{
		    System.out.println(totalQueries);
		}
	}
}