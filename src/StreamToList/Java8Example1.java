package StreamToList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ibnahmad
 */
public class Java8Example1 {
    public static void main(String[] args){
        
        Stream<String> language = Stream.of("java", "python", "node");
        
        //Convert a Stream to list
        List<String> result = language.collect(Collectors.toList());
        
        result.forEach(System.out::println);
    }
}
