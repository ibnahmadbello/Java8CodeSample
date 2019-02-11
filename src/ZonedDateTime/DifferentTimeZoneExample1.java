package ZonedDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ibnahmad
 * Review a flight information from Malaysia Kuala Lumpur(UTC+08:00) to Japan Tokyo Haneda(UTC+09:00)
 * ---Flight Detail---
 * Kuala Lumpur (KUL) -> Tokyo Haneda (HND)
 * Flight Duration : 7 hours
 * 
 * (KUL-Depart) 1430, 22 Aug 2016 -> 2230, 22 Aug 2016 (HND-Arrive)
 * P.S Japan Tokyo is one hour faster than Malaysia Kuala Lumpur
 */
public class DifferentTimeZoneExample1 {
    
    public static void main(String[] args){
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");
        
        LocalDateTime localDateTime = LocalDateTime.of(2016, Month.AUGUST, 22, 14, 30);
        System.out.println("LocalDateTime : " + format.format(localDateTime));
        
        // UTC+8
        ZonedDateTime klDateTime = localDateTime.atZone(ZoneId.of("Asia/Kuala_Lumpur"));
        System.out.println("Depart : " + format.format(klDateTime));
        
        // UTC+9 and flight duration = 7 hours
        ZonedDateTime japanDateTime = klDateTime.withZoneSameInstant(ZoneId.of("Asia/Tokyo")).plusHours(7);
        System.out.println("Arrive : " + format.format(japanDateTime));
        
        System.out.println("\n---Detail---");
        System.out.println("Depart : " + klDateTime);
        System.out.println("Arrive : " + japanDateTime);
    }
}
