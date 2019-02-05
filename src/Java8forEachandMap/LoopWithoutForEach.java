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
public class LoopWithoutForEach {
    public static void main(String[] args){
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);
        
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());                      
        }
        
         //looping through a list
    List<String> item = new ArrayList<>();
    item.add("A");
    item.add("B");
    item.add("C");
    item.add("D");
    item.add("E");
        
    }
}
