package ArrayCheck;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ibnahmad
 */
public class StringArrayExample1 {
    
    public static void main(String[] args){
        
        String[] alphabet = new String[]{"A", "B", "C"};
        
        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);
        
        if (list.contains("A")) {
            System.out.println("Hello A");
        }
        
        // In Java 8
        // Convert to stream and test it
        boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
        if (result) {
            System.out.println("Hello A");
        }
    }
}
