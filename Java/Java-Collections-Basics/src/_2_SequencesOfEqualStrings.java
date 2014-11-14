import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _2_SequencesOfEqualStrings {

	public static void main(String[] args) {
		HashMap<String,Integer> wordsCounts=new HashMap<>();
		try (Scanner scan= new Scanner(System.in)){
			
				String text=scan.nextLine();
				String[] word=text.split(" ");
				for (int j = 0; j < word.length; j++) {
					Integer count=wordsCounts.get(word[j]);
					if(count==null){
						count=0;
					}
					wordsCounts.put(word[j],count+1);
				}
				for(HashMap.Entry<String, Integer> wordEntry: 
					wordsCounts.entrySet()){
					for (int i = 0; i < wordEntry.getValue(); i++) {
						System.out.print(wordEntry.getKey()+" ");
					}
					System.out.println();
				}
		 }
	}
}


 
