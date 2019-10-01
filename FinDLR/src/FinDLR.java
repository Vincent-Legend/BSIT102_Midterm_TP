import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;


public class FinDLR {
    
    public static void main(String[] args) throws IOException{
    	
    	Scanner scan = new Scanner(System.in);
    	
    		System.out.println("Enter File Name: ");
  			FileWriter fw = new FileWriter(scan.nextLine());
    		
    		System.out.printf("Write Anything:");
    		fw.write(scan.nextLine());
    		fw.close();
    }
}
