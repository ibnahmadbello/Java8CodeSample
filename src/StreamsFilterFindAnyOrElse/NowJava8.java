/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamsFilterFindAnyOrElse;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ibnahmad
 */
public class NowJava8 {
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
        
        Person result1 = persons.stream()                   // Convert to stream
                .filter(x -> "jack".equals(x.getName()))    // we want "jack" only
                .findAny()                                  // If 'findAny' then return found
                .orElse(null);                              // If not found, return null
        
        System.out.println(result1);
        
        Person result2 = persons.stream()                   
                .filter(x -> "ahmook".equals(x.getName()))    
                .findAny()
                .orElse(null);
        
        System.out.println(result2);
    }

}
