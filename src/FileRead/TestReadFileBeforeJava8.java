package FileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ibnahmad
 */
public class TestReadFileBeforeJava8 {
    
    public static void main(String[] args){
        
        // Using Windows OS
        String fileName = "c://lines.txt";
                
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            
            String line;
            while ((line = br.readLine()) != null) {                
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
                
    }
}
