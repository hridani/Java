import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Map<String, Integer> wordsSort= new TreeMap<>();
		Scanner scan= new Scanner(System.in);
		int maxCount=Integer.MIN_VALUE;
		
		String[] wordInText=scan.nextLine().toLowerCase().split("\\W+");
		for (int j = 0; j < wordInText.length; j++) {
			Integer count=wordsSort.get(wordInText[j]);
			if(count==null){
				count=0;
			}
			if(count+1 > maxCount )
				maxCount=count+1;
			wordsSort.put(wordInText[j],count+1);

		}
		for(Map.Entry<String, Integer> wordEntry: 
			wordsSort.entrySet()){
			if (wordEntry.getValue()==maxCount) {
				System.out.println(wordEntry.getKey()+"-> " + maxCount +" times" );
				
			}
	
		}
	}
}
