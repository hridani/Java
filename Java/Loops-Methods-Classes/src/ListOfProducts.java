import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



public class ListOfProducts {

	public static void main(String[] args) {
		
		ArrayList<Product> productList= new ArrayList<Product>();
		BufferedWriter fw=null;
		
		try( BufferedReader fileReader= new BufferedReader(
				new FileReader("data/input.txt"));
		){
			while(true){
				String line=fileReader.readLine();
				if(line==null){
					break;
				}
				String[] lineProdPrice=line.split(" ");
				productList.add(new Product(lineProdPrice[0],
						Double.parseDouble(lineProdPrice[1])));
			} 
			
			Collections.sort(productList);
			
			fw=new BufferedWriter(new FileWriter("data/output.txt"));
			for(Product product:productList){
				fw.write(product.getName() + " " + product.getPrice() +"\r\n" );
			}
			fw.close();
			
		}catch (IOException ioex) {
			System.err.println("Cannot read file");
		}
	}

}
