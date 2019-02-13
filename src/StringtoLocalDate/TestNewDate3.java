package StringtoLocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ibnahmad
 */
public class TestNewDate3 {
        public static void main(String[] args){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        
        String date = "13/02/2019";
        
        LocalDate localDate = LocalDate.parse(date, formatter);
        
        System.out.println(localDate);
        
        System.out.println(formatter.format(localDate));
    }
}
