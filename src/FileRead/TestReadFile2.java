package FileRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ibnahmad
 */
public class TestReadFile2 {
    
    public static void main(String[] args){
        
        //Using Windows OS
        String fileName = "c://lines.txt";
        List<String> list = new ArrayList<>();
        
        // read file into stream, try-with resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))){
            
            //1. filter line 3
            //2. convert all content to upper case
            //3. convert it into a list
            list = stream
                    .filter(line -> !line.startsWith("line3"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        list.forEach(System.out::println);
    }
}
