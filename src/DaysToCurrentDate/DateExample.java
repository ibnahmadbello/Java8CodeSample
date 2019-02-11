/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaysToCurrentDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ibnahmad
 */
public class DateExample {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    public static void main(String[] args){
        Date currentDate = new Date();
        System.out.println(dateFormat.format(currentDate));
        
        // convert date to calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        
        // manipulate date
        calendar.add(Calendar.YEAR, 1);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DATE, 1); // same with calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.HOUR, 1);
        calendar.add(Calendar.MINUTE, 1);
        calendar.add(Calendar.SECOND, 1);
        
        // convert calendar to date
        Date currentDatePlusOne = calendar.getTime();
        
        System.out.println(dateFormat.format(currentDatePlusOne));
    }
    
}
