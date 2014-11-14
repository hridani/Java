
import java.util.Scanner;
import java.util.Set;

import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Set<String> words= new TreeSet<>();
		Scanner scan= new Scanner(System.in);
		
		String[] wordInText=scan.nextLine().toLowerCase().split("\\W+");
		for (String string : wordInText) {
			words.add(string);
		}
		for (String string : words) {
			System.out.print(string+ " ");
		}
	}

}
