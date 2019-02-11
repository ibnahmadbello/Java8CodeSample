/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemporalAdjusters.CustomTemporalAdjuster;

import java.time.LocalDate;

/**
 *
 * @author ibnahmad
 */
public class TestDate {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        System.out.println("current date : " + localDate);
        
        localDate = localDate.with(new NextChristmas());
        System.out.println("Next Christmas : " + localDate);
        
        // localDate = localDate.with(temporal -> temporal.with(ChronoField.MONTH_OF_YEAR, 12).with(ChronoField.DAY_OF_MONTH, 25));
    }
}
