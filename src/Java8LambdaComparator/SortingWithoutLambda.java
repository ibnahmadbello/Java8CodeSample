package Java8LambdaComparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibnahmad
 */
public class SortingWithoutLambda {
    
    public static void main(String[] args){
        
        List<Developer> listDevs = getDevelopers();
        
        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
        
        //sort by age
        Collections.sort(listDevs, new Comparator<Developer>(){
            @Override
            public int compare(Developer developer1, Developer developer2) {
                return developer1.getAge() - developer2.getAge();
            }
        });
        
        System.out.println("After Sort by age");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
        
        // sort by name
        Collections.sort(listDevs, new Comparator<Developer>(){
            @Override
            public int compare(Developer dev1, Developer dev2){
                return dev1.getName().compareTo(dev2.getName());
            }
        });
        
        System.out.println("After Sort by name");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
        
        // sort by salary
        Collections.sort(listDevs, new Comparator<Developer>(){
            @Override
            public int compare(Developer dev1, Developer dev2){
                return dev1.getSalary().compareTo(dev2.getSalary());
            }
        });
        
        System.out.println("After Sort by salary");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
    }
    
    private static List<Developer> getDevelopers(){
        
        List<Developer> result = new ArrayList<Developer>();
        
        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));
        
        return result;
    }
    
}
