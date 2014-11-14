
public class FullHouse {

	public static void main(String[] args) {
		  String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		  String[] suits = {"♣", "♦", "♥", "♠" };

		   
		    int numberOfCombos = 0;

		    //Loop over all card values. This outer for loop is for the 3 of kind values. 3 Aces, 3 Twos, 3 Threes, etc
		    for(int card = 0; card < ranks.length; card++)
		    {
		        String firstCard = ranks[card]; 

		        for(int suit1 = 0; suit1 < suits.length; suit1++)
		        {
		            for(int suit2 = suit1+1; suit2 < suits.length; suit2++)
		            {
		                for(int suit3 = suit2+1; suit3 < suits.length; suit3++)
		                {
		                    //Loop over all card values that aren't equal to the firstCard.So we won't have 3 Aces and 2 Aces
		                    for(int card2 = 0; card2 < ranks.length; card2++)
		                    {
		                        String secondCard = ranks[card2]; 

		                        //Dont Compare the 3 of a Kind and 2 pair when they are the same rank. ie Aces and Aces
		                        if(firstCard.compareTo(secondCard) != 0){
		                            for(int othersuit1 = 0; othersuit1 < suits.length; othersuit1++)
		                            {
		                                for(int othersuit2 = othersuit1+1; othersuit2 < suits.length; othersuit2++)
		                                {
		                                    //Found a valid combo if 3 of a kind have different suits, 2 pair have different suits, and card1 is not equal to card2
		                                    numberOfCombos++;
		                                    System.out.println(numberOfCombos+". "+firstCard+" "+suits[suit1]+" "+firstCard+" "+suits[suit2]+" "+firstCard+" "+suits[suit3]+ " "
		                                                       +secondCard+" "+suits[othersuit1]+" "+secondCard+" "+suits[othersuit2]);
		                                }
		                            }
		                        }
		                    }               
		                }
		            }
		        }

		    }
		    System.out.println("Full House=" +numberOfCombos);
	}
}	


