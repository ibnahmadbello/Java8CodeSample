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
public class Java8Example2 {
    public static void main(String[] args){
        
        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
        
        
        List<Integer> result2 = number.filter(x -> x!= 3).collect(Collectors.toList());
        
        result2.forEach(System.out::println);
    }
}
