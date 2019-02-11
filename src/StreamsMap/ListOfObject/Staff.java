/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamsMap.ListOfObject;

import java.math.BigDecimal;

/**
 *
 * @author ibnahmad
 */
public class Staff {
    
    private String name;
    private int age;
    private BigDecimal salary;

    public Staff(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }
    
    
    
}
