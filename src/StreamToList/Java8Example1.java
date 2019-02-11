/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
