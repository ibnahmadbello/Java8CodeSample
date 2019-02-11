/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringToCharArray;

/**
 *
 * @author ibnahmad
 */
public class Test {
    public static void main(String[] args){
        
        String password = "password123";
        
        password.chars() //IntStream
                .mapToObj(x -> (char) x) //Stream<Character>
                .forEach(System.out::println);
    }
}
