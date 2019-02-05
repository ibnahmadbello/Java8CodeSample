/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8forEachandMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ibnahmad
 */
public class LoopWithforEach {
    public static void main(String[] args){
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        
        items.forEach((k, v)->System.out.println("Item : " + k + "Count : " + v));
        
        System.out.println();
        
        items.forEach((k, v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });
        
         //looping through a list
        List<String> item = new ArrayList<>();
        item.add("A");
        item.add("B");
        item.add("C");
        item.add("D");
        item.add("E");
        
        //lambda
        //Output : A, B, C, D, E
        item.forEach(listItem->System.out.println(listItem));
        
        System.out.println();
        
        //Output : C
        item.forEach(singleItem->{
            if ("C".equals(singleItem)) {
                System.out.println(singleItem);
            }
        });
        
        System.out.println();
        
        //method reference
        //Output : A, B, C, D, E
        item.forEach(System.out::println);
        
        System.out.println();
        
        //Stream and filter
        //Output : B
        item.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
    }
}
