package StringToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ibnahmad
 */
public class TestDateExample2 {
    public static void main(String[] args){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "7/06/2013";
        
        try {
            Date date = dateFormat.parse(dateInString);
            System.out.println(date);
            System.out.println(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
