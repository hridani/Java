import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _8_ExtractEmails {

	public static void main(String[] args) {
		 Pattern pattern=null;
		 Matcher matcher;
		
		//v1. String emailPattern="[A-Za-z0-9]+[.-_]*[A-Za-z0-9]*+@[A-Za-z]+[-]*[.A-Za-z]{2,}";
		//v2.
		 String emailPattern="[A-Za-z0-9]+(\\.[-_A-Za-z0-9]+)*+@[A-Za-z]+[-]*[.A-Za-z]{2,}"; 
		 Scanner scan= new Scanner(System.in);
		 String text=scan.nextLine();
		 pattern=Pattern.compile(emailPattern);
		 matcher=pattern.matcher(text);
		 while(matcher.find()){
			System.out.println(matcher.group());
		 }
	}
}
