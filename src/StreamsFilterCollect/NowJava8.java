/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamsFilterCollect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ibnahmad
 */
public class NowJava8 {
    
    public static void main(String[] args){
        
        List<String> lines = Arrays.asList("spring", "node", "mkyong");
        
        List<String> result = lines.stream()                 // convert list to stream
                .filter(line -> !"mkyong".equals(line))      // we dont like mkyong
                .collect(Collectors.toList());               // collect the output and convert streams to a list
        
        result.forEach(System.out::println);                // output : spring, node
    }
    
}
