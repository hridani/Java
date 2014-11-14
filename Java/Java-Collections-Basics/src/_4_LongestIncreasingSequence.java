import java.util.ArrayList;
import java.util.Scanner;


public class _4_LongestIncreasingSequence {

	public static void main(String[] args) {
		
	    ArrayList<String> wordsArray = new ArrayList<>();
	    int countWords=1;
	    int maxCount=Integer.MIN_VALUE;
		try (Scanner scan= new Scanner(System.in)){
			
			String newLineWords=null;
			String largestLine=null;
			String text=scan.nextLine();
			String[] words=text.split(" ");
			int numberText=Integer.parseInt(words[0]);
			newLineWords=words[0];
			for (int i = 1; i < words.length; i++) {
				
					int numbernextText=Integer.parseInt(words[i]);
					if(numberText < numbernextText){
						countWords++;
						newLineWords=newLineWords.concat(" ");
						newLineWords=newLineWords.concat(words[i]);
					}
					else {
						wordsArray.add(newLineWords);
						if(countWords > maxCount){
							maxCount=countWords;
							largestLine=newLineWords;
						}
						countWords=1;
						newLineWords=words[i];
					}	
					if(i==words.length-1){
						wordsArray.add(newLineWords);
						if(countWords > maxCount){
							largestLine=newLineWords;
						}
					}
					numberText=numbernextText;
			}
			
			for (String string : wordsArray) {
				System.out.println(string);
			}
			System.out.println("Longest:" + largestLine );
		}
	}
}


