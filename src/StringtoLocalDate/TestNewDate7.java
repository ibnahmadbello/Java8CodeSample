package StringtoLocalDate;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ibnahmad
 */
public class TestNewDate7 {
    
    public static void main(String[] args){
        
        String date = "2019-02-13T15:23:01+01:00";
                
        ZonedDateTime result = ZonedDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
        
        System.out.println("ZonedDateTime : " + result);
        
        System.out.println("TimeZone : " + result.getZone());
        
        LocalDate localDate = result.toLocalDate();
                
        System.out.println("LocalDate : " + localDate);
        
        
        
        
    }
}
