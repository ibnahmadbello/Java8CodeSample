/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterNull;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author ibnahmad
 */
public class Java8ExampleWithFilter {
    public static void main(String[] args){
        Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
        
        //List<String> result = language.collect(Collectors.toList());
        
        List<String> result = language.filter(x -> x!=null).collect(Collectors.toList());
        
        // Alternatively
        //List<String> result = language.filter(Objects::nonNull).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
