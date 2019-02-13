package StringtoLocalDate;

import java.time.LocalDate;

/**
 *
 * @author ibnahmad
 */
public class TestNewDate1 {
    
    public static void main(String[] args){
        
        String date = "2019-02-13";
        
        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.parse(date);
        
        System.out.println(localDate);
                
    }
}
