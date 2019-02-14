package RandomPackage;

import java.util.Random;

/**
 *
 * @author ibnahmad
 */
public class TestRandom2 {
    public static void main(String[] args){
        
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomNumberInRange(33, 38));
        }
        
        System.out.println();
        
        //Java 8 only
        //Generate random integers in a range between 33 (inclusive) and 38 (exclusive)
        //with a stream size of 10. And print out the items with forEach
        new Random().ints(10, 33, 38).forEach(System.out::println);
    }
    
    private static int getRandomNumberInRange(int min, int max){
        
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }
}
