import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;



public class SumNumbersFromTextFile {

	public static void main(String[] args)  {
		   Scanner fileReader=null;    
		   int sum = 0;
           try {
                   fileReader = new Scanner(new FileReader("data/input.txt"));
					while (fileReader.hasNextLine()) {
						String line = fileReader.nextLine();
						int number = Integer.parseInt(line);
						//fileReader.nextLine();
						sum+=number;
                   }
                   System.out.println(sum);
         
           }  catch(Exception ex){
               System.out.println("(missing file)");
			} finally {
			if (fileReader != null) {
				fileReader.close();
			}
		}
}

}
