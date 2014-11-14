import java.util.Random;
import java.util.Scanner;


public class RandomHands5Cards {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
         int numb = in.nextInt();
        
         String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
         String[] suit = { "♣", "♦", "♥", "♠" };
        
         Random random = new Random();
        
         int randomNumber = 0;
        
         for (int i = 0; i < numb; i++) {  
             for (int j = 0; j < 5; j++) {
                   	randomNumber = random.nextInt(13);
                    System.out.print(cards[randomNumber]);
                    randomNumber = random.nextInt(4);     
                    System.out.print(suit[randomNumber]+" ");         
              }
             System.out.println();
         }
	}

}
