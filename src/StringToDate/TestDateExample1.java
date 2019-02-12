package StringToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ibnahmad
 */
public class TestDateExample1 {
    
    public static void main(String[] args){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String dateInString = "7-Jun-2013";
        
        try {
            Date date = dateFormat.parse(dateInString);
            System.out.println(date);
            System.out.println(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
