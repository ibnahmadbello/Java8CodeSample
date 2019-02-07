/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamsFilterMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        
        String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)                       // Convert stream to string
                .findAny()
                .orElse("");
        
        System.out.println("name : " + name);
        
        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        
        collect.forEach(System.out::println);
    }
}
