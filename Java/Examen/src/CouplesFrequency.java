import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class CouplesFrequency {

	public static void main(String[] args) {
		Map<String,Integer> wordsCounts=new LinkedHashMap<>();
		int numberCouples=0;
		try (Scanner scan= new Scanner(System.in)){
	
				String[] word=scan.nextLine().split(" ");
				for (int j = 1; j < word.length; j++) {
					numberCouples++;
					String newWord=word[j-1]+" " + word[j];
					Integer count=wordsCounts.get(newWord);
					if(count==null){
						count=0;
					}
					wordsCounts.put(newWord,count+1);
				}
				for(HashMap.Entry<String, Integer> wordEntry: 
					wordsCounts.entrySet()){
					double frequency=(double)(wordEntry.getValue() *100) /(double) numberCouples;
					System.out.printf("%s -> %.2f%%\n",wordEntry.getKey(),frequency);
					}
					System.out.println();
				
		 }
	}

}
