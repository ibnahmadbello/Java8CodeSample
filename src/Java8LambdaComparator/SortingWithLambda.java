/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8LambdaComparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ibnahmad
 */
public class SortingWithLambda {
    
    public static void main(String[] args){
        
        List<Developer> listDevs = getDevelopers();
        
        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }
        
        System.out.println("After Sort by Age");
        
        //lambda here to sort by age!
        listDevs.sort((Developer dev1, Developer dev2) -> dev1.getAge()-dev2.getAge());
        
        //to print the list
        listDevs.forEach((developer)->System.out.println(developer));
        
        System.out.println("After Sort by Name");
        
        //lambda here to sort by name
        listDevs.sort((Developer dev1, Developer dev2)->dev1.getName().compareTo(dev2.getName()));
        
        listDevs.sort((dev1, dev2)->dev1.getName().compareTo(dev2.getName())); //This is kind of redundant, it's similar to previous one
        //to print the list
        listDevs.forEach((developer)->System.out.println(developer));
        
        System.out.println("After Sort by Salary");
        
        //lambda here to sort by salary
        listDevs.sort((Developer dev1, Developer dev2)->dev1.getSalary().compareTo(dev2.getSalary()));
        
        listDevs.sort((dev1, dev2)->dev1.getSalary().compareTo(dev2.getSalary())); //This is kind of redundant, it's similar to previous one
        //to print the list
        listDevs.forEach((developer)->System.out.println(developer));
        
        //Lambda expression to sort a list using their salary
        Comparator<Developer> salaryComparator = (dev1, dev2)->dev1.getSalary().compareTo(dev2.getSalary());
        listDevs.sort(salaryComparator);
        
        //to print the list
        listDevs.forEach((developer)->System.out.println(developer));
        
        //Lambda expression to sort a list using their salary in reversed order
        Comparator<Developer> reversedSalaryComparator = (dev1, dev2)->dev1.getSalary().compareTo(dev2.getSalary());
        listDevs.sort(reversedSalaryComparator.reversed());
        
        //to print the list
        listDevs.forEach((developer)->System.out.println(developer));
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
