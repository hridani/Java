import java.util.ArrayList;
import java.util.Scanner;


public class _9_CombineListsOfLetters {

	public static void main(String[] args) {
		ArrayList<Character> strFirst= new ArrayList<>();
		ArrayList<Character> strSecond= new ArrayList<>();
		ArrayList<Character> strUnion= new ArrayList<>();
		Scanner scan= new Scanner(System.in);
		char[] curCharLine;
		curCharLine=scan.nextLine().replaceAll("\\W+", "").toCharArray();
		for (int i = 0; i <curCharLine.length; i++) {
			strFirst.add(curCharLine[i]);
		}
	
		curCharLine=scan.nextLine().replaceAll("\\W+", "").toCharArray();
		for (int i = 0; i <curCharLine.length; i++) {
			strSecond.add(curCharLine[i]);
		}
		strUnion.addAll(strFirst);
		for (char c : strSecond) {
			if(!strFirst.contains(c)){
				strUnion.add(c);
			}
		}
		for (char c : strUnion) {
			System.out.print(c+" " );
		}
	}

}
