import java.util.Scanner;


public class _6_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String text=scan.nextLine();
		String word=scan.nextLine();
		int countWord=0;
		 
		String[] wordsText=text.split("\\W+");
		
		for( String curWord: wordsText){
			if(curWord.compareToIgnoreCase(word)==0)
				countWord++;
		}
			
		System.out.println(countWord);

	}

}
