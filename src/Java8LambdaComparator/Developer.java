/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java8LambdaComparator;

import java.math.BigDecimal;

/**
 *
 * @author ibnahmad
 */
public class Developer {
    
    public String name;
    public BigDecimal salary;
    public int age;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Developer[" + "name=" + name + ", salary=" + salary + ", age=" + age + ']';
    }
    
   
}
