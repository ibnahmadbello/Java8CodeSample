package FileRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author ibnahmad
 */
public class TestReadFile {
    
    public static void main(String[] args){
        
        //Using Windows OS
        String fileName = "c://lines.txt";
        
        // read file into stream, try-with resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))){
            
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
