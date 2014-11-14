import java.util.Scanner;


public class VideoDuration {

	public static void main(String[] args) {
		int hours=0;
		int minutes=0;
		
		boolean endCount=false;
		try (Scanner scan= new Scanner(System.in)){
			do{
				String[] time=scan.nextLine().split(":");
				if(time[0].compareTo("End")!=0){
					hours+=Integer.parseInt(time[0]);
					minutes+=Integer.parseInt(time[1]);
				}
				else
					endCount=true;
			}
			while(endCount==false);
			int newMinutes=minutes % 60;
			hours+=minutes/60;
			System.out.printf("%d:%02d",hours,newMinutes);
		}
	}

}
