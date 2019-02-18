package FileRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ibnahmad
 */
public class TestReadFile3 {
    
    public static void main(String[] args){
        
        // Using Windows OS
        String fileName = "c://lines.txt";
        List<String> list = new ArrayList<>();
                
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))){
            
            //br returns as stream and convert it into a List
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        list.forEach(System.out::println);
    }
}
