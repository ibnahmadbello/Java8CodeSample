package StringToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author ibnahmad
 */
public class TestDateExample5 {
    public static void main(String[] args){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        String dateInString = "2014-10-05T15:23:01Z";
        
        try {
            Date date = dateFormat.parse(dateInString.replaceAll("Z$", "+0000"));
            System.out.println(date);
            
            System.out.println("time zone : " + TimeZone.getDefault().getID());
            System.out.println(dateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
