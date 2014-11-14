import java.util.Arrays;
import java.util.Scanner;


public class _1_SortArrayfNumbers {

	public static void main(String[] args) {
		int[] numbersArray;
		try (Scanner scan= new Scanner(System.in)){
			
			int numberN=scan.nextInt();
			scan.nextLine();
			numbersArray= new int[numberN];
			for (int i = 0; i < numbersArray.length; i++) {
				numbersArray[i]=scan.nextInt();
			}
		}
		Arrays.sort(numbersArray);
		for (int i = 0; i < numbersArray.length; i++)
			System.out.print(numbersArray[i]+" ");
		}
	}


