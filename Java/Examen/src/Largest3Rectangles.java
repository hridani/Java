import java.util.Scanner;


public class Largest3Rectangles {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);	
		String text=scan.nextLine().replace(" ", "");
		text=text.replace("[", "");
		String[] rect=text.split ("]");
		
		int numberTr=rect.length;
		int ab[]=new int[numberTr];
		int i=0;
		int maxSum=Integer.MIN_VALUE;
		int curSum=0;
		int begin=0;
		
		for (String string : rect) {
			String[] abTrian=string.split("x");
			ab[i]=Integer.parseInt(abTrian[0]) * Integer.parseInt(abTrian[1]);
			i++;
		}
		for (int j = 2; j < numberTr; j++) {
			
			curSum=ab[j-2]+ab[j-1]+ab[j];
			if(curSum>maxSum){
				maxSum=curSum;
				begin=j-2;
			}
			
		}
		
		System.out.printf("%d",maxSum);
	}
}
