package InstantToZonedDateTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author ibnahmad
 */
public class InstantZonedDateTime1 {
    
    public static void main(String[] args){
        
        // Z = UTC+0
        Instant instant = Instant.now();
        
        System.out.println("Instant : " + instant);
        
        // Japan = UTC+9
        ZonedDateTime jpTime = instant.atZone(ZoneId.of("Asia/Tokyo"));
        
        System.out.println("ZonedDateTime : " + jpTime);
        
        System.out.println("Offset : " + jpTime.getOffset());
    }
    
}
