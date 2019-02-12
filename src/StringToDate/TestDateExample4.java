package StringToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ibnahmad
 */
public class TestDateExample4 {
    public static void main(String[] args){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
        String dateInString = "Friday, Jun 7, 2013 12:10:56 PM";
        
        try {
            Date date = dateFormat.parse(dateInString);
            System.out.println(date);
            System.out.println(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
