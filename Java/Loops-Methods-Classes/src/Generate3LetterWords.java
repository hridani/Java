import java.util.Scanner;


public class Generate3LetterWords {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		char[] inputcharacters=scan.next().toCharArray();
		if(inputcharacters.length==1){
			System.out.printf("%c%c%c",inputcharacters[0],inputcharacters[0],inputcharacters[0]);
		} else {
			for (int i = 0; i < inputcharacters.length; i++) {
				for (int j = 0; j < inputcharacters.length; j++) {
					for (int k = 0; k < inputcharacters.length; k++) {
						System.out.printf("%c%c%c ",inputcharacters[i],
								inputcharacters[j],inputcharacters[k]);
					}
				}
			}
		}

	}

}
