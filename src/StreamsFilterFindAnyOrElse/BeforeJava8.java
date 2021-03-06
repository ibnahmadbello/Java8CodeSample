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
public class BeforeJava8 {
    
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
        
        Person result = getStudentByName(persons, "jack");
        System.out.println(result);
    }

    private static Person getStudentByName(List<Person> persons, String name) {
        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
    
}
