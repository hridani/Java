import java.util.Scanner;


public class SymmetricNumbers {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int start=scan.nextInt();
		int end=scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			String numberStr="" + i;
			if(numberStr.charAt(0)==numberStr.charAt(numberStr.length()-1)) {
				System.out.println(i);
			}
		}

	}

}
