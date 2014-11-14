import java.util.Scanner;

public class _3_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		int maxCount=1;
		int count=1;
		int posWord=0;
		try (Scanner scan= new Scanner(System.in)){
			
				String text=scan.nextLine();
				String[] words=text.split(" ");
				
				for (int i = 1; i < words.length; i++) {
					if(words[i].equals(words[i-1])) {
								count++;
						//largestWords.equals(words[i]);
					}
					else{
						count=1;
					}
					if(count > maxCount){
						maxCount=count;
						posWord=i;
					}
				}		
		
				for (int i = 0; i < maxCount-1 ; i++) {
					System.out.print(words[posWord] + " ");
				}
				System.out.println(words[posWord]);
		
		}
	}
}


