import java.util.Scanner;


public class AngelUnitConverter {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int convCount=Integer.parseInt(scan.nextLine());
		String[] commands=new String[convCount*2];
		
		for (int i = 0, lastCommmand=0; i < convCount; i++, lastCommmand+=2) {
			String query=scan.nextLine();
			String[] queryAsArray=query.split(" ");
			commands[lastCommmand]=queryAsArray[0];
			
			char[] typeAction=queryAsArray[1].toCharArray();
			if(typeAction[0]=='r'){
				commands[lastCommmand+1]="r";
			}
			else {
				commands[lastCommmand+1]="d";
			}
		}
		
		for (int i = 0, lastCommmand=0; i < convCount; i++, lastCommmand+=2) {
			if(commands[lastCommmand + 1]=="r") {
				System.out.printf("%.6f deg\n", Math.toDegrees(Double.parseDouble(commands[lastCommmand])));
			}
			else {
				System.out.printf("%.6f rad\n", Math.toRadians(Double.parseDouble(commands[lastCommmand])));
			}
		
		}
	}

}
