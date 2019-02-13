package StringtoLocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ibnahmad
 */
public class TestNewDate2 {
    
    public static void main(String[] args){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        
        String date = "13-Feb-2019";
        
        LocalDate localDate = LocalDate.parse(date, formatter);
        
        System.out.println(localDate);
        
        System.out.println(formatter.format(localDate));
    }
}
