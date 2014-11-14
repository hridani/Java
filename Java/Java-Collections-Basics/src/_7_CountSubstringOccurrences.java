import java.util.Scanner;


public class _7_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String text=scan.nextLine();
		String word=scan.nextLine();
		int countWord=0;
		 
		String[] wordsText=text.split("\\W+");
		for( String curWord: wordsText){
			for (int i = 0; i <= curWord.length() - word.length(); i++) {
						
			if(curWord.substring(i,i+ word.length()).compareToIgnoreCase(word)==0)
				countWord++;
			}
			
		}
		System.out.println(countWord);
	}

	
	
}
