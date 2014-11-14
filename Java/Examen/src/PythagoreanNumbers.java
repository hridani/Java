import java.util.Arrays;
import java.util.Scanner;


public class PythagoreanNumbers {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int c=0;
		boolean findDes=false;
		
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		int[] numbersQuares=new int[n];
		
		for (int i = 0; i < n; i++) {
			numbersQuares[i]=scan.nextInt();
		}	
		Arrays.sort(numbersQuares);
		
		for (int i = 0; i < numbersQuares.length; i++) {
			for (int j = i; j < numbersQuares.length; j++) {
				for (int j2 = j; j2 < numbersQuares.length; j2++) {
					a=numbersQuares[i]*numbersQuares[i];
					b=numbersQuares[j]*numbersQuares[j];
					c=numbersQuares[j2]*numbersQuares[j2];
					if(a+b==c){
						System.out.printf("%d*%d + %d*%d = %d*%d\n",
								numbersQuares[i],numbersQuares[i],
								numbersQuares[j],numbersQuares[j],
								numbersQuares[j2],numbersQuares[j2]);
						findDes=true;
					}
				}
			}
		}
		if(findDes==false)
				System.out.println("No");
	}
	
}
