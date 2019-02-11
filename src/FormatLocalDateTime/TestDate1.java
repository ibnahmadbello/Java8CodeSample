/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormatLocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ibnahmad
 */
public class TestDate1 {
    public static void main(String[] args){
        // Get current date time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before : " + now);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        String formatDateTime = now.format(formatter);
        
        System.out.println("After : " + formatDateTime);
    }
}
