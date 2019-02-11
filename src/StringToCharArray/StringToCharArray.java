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
public class StringToCharArray {
    public static void main(String[] args){
        
        String password = "password123";
        
        char[] passwordInCharArray = password.toCharArray();
        
        for (char temp : passwordInCharArray) {
            System.out.println(temp);
        }
    }
}
