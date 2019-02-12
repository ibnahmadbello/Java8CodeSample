package InstantToLocalDateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

/**
 *
 * @author ibnahmad
 */
public class InstantExample2 {
    
    public static void main(String[] args){
        
        // Hard code a date time
        LocalDateTime dateTime = LocalDateTime.of(2016, Month.AUGUST, 18, 6, 17, 10);
        
        System.out.println("LocalDateTime : " + dateTime);
        
        // Convert LocalDateTime to Instant, UTC+0
        Instant instant = dateTime.toInstant(ZoneOffset.UTC);
        
        System.out.println("Instant : " + instant);
    }

}
