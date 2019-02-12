package StringToDate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 *
 * @author ibnahmad
 */
public class TestDateExample6 {
    
    public static void main(String[] args){
        
        String dateInString = "2014-10-05T15:23:01Z";
        
        Instant instant = Instant.parse(dateInString);
        
        System.out.println(instant);
        
        // get date time only
        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));
        
        System.out.println(result);
        
        // get date time + timezone
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Tripoli"));
        System.out.println(zonedDateTime);
        
        // get date time + timezone
        ZonedDateTime zonedDateTime2 = instant.atZone(ZoneId.of("Europe/Athens"));
        System.out.println(zonedDateTime2);
    }
}
