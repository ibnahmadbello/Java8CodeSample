/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RamadanCalculator;

import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author ibnahmad
 */
public class RamadanDate {
    
    public static void main(String[] args){
        // first day of Ramadan, 9th month
        HijrahDate ramadan = HijrahDate.now()
                .with(ChronoField.DAY_OF_MONTH, 1)
                .with(ChronoField.MONTH_OF_YEAR, 9)
                .with(ChronoField.YEAR, 1440);
        
        System.out.println("HijrahDate : " + ramadan);
        
        //HijrahDate -> LocalDate
        System.out.println("\n--- Ramadan 2019");
        System.out.println("Start : " + LocalDate.from(ramadan));
        
        //until the end of the month
        System.out.println("End : " + LocalDate.from(ramadan.with(TemporalAdjusters.lastDayOfMonth())));
    }
    
}
