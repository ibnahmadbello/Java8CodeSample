package ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ibnahmad
 * This example consider from France, Paris(UTC+02:00, DST) to a hard coded (UTC-05:00) time zone (E.g New York)
 * ---Flight Detail---
 * France, Paris -> UTC-05:00
 * Flight Duration : 8 hours 10 minutes
 * 
 * (Depart) 1430, 22 Aug 2016 -> 1540, 22 Aug 2016 (Arrive)
 */
public class DifferentTimeZoneExample2 {
    public static void main(String[] args){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");
        
        //Convert String to LocalDateTime
        String date = "2016-08-22 14:30";
        LocalDateTime localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println("LocalDateTime : " + format.format(localDateTime));
        
        //Paris, 2016 Apr-Oct = DST, UTC+2, other months UTC+1
        //UTC+2
        ZonedDateTime parisDateTime = localDateTime.atZone(ZoneId.of("Europe/Paris"));
        System.out.println("Depart : " + format.format(parisDateTime));
        
        //hard code a zoneoffset like this, UTC-5
        ZoneOffset nyOffSet = ZoneOffset.of("-05:00");
        ZonedDateTime nyDateTime = parisDateTime.withZoneSameInstant(nyOffSet).plusHours(8).plusMinutes(10);
        System.out.println("Arrive : " + format.format(nyDateTime));
        
        System.out.println("\n---Detail---");
        System.out.println("Depart : " + parisDateTime);
        System.out.println("Arrive : " + nyDateTime);
    }
}

// Paris, normally UTC+1 has (DST) Daylight Saving Time (add one hour = UTC+2) from 27/march to 30/Oct 2016