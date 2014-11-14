import java.util.Scanner;


public class _5_CountAllWords {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String text=scan.nextLine();
		System.out.println(text.split("\\W+").length);

	}

}
