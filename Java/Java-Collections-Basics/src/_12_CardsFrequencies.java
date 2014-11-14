import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _12_CardsFrequencies {

	public static void main(String[] args) {
		 
		Map<String,Integer> wordsCounts=new LinkedHashMap<>();
		try (Scanner scan= new Scanner(System.in)){
	
				String[] word=scan.nextLine().split("\\W+");
				for (int j = 0; j < word.length; j++) {
					Integer count=wordsCounts.get(word[j]);
					if(count==null){
						count=0;
					}
					wordsCounts.put(word[j],count+1);
				}
				for(HashMap.Entry<String, Integer> wordEntry: 
					wordsCounts.entrySet()){
					double frequency=(double)(wordEntry.getValue() *100) /(double) word.length;
					System.out.printf("%s -> %.2f%%\n",wordEntry.getKey(),frequency);
					}
					System.out.println();
				
		 }

	}

}
