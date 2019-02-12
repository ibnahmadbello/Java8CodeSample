package InstantToLocalDateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 *
 * @author ibnahmad
 */
public class InstantExample1 {
    
    public static void main(String[] args){
        
        // Parse a ISO 8601 Date directly
        // Instant instant = Instant.parse("2016-08-18T06:17:10.225Z");
        
        Instant instant = Instant.now();
        
        System.out.println("Instant : " + instant);
        
        // Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        
        System.out.println("LocalDateTime : " + localDateTime);
        
    }
}
