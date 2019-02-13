package StringtoLocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ibnahmad
 */
public class TestNewDate4 {
    
    public static void main(String[] args){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM d yyyy");
        
        String date = "Wed, Feb 13 2019";
        
        LocalDate localDate = LocalDate.parse(date, formatter);
        
        System.out.println(localDate);
        
        System.out.println(formatter.format(localDate));
    }
}
