package FileRead;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ibnahmad
 */
public class TestReadFileBeforeJava8WithScanner {
    
    public static void main(String[] args){
        
        // Using Windows OS
        String fileName = "c://lines.txt";
                
        try (Scanner scanner = new Scanner(new File(fileName))){
                        
            while (scanner.hasNext()) {                
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
                
    }
}
