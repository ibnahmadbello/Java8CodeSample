package ArrayToStream.PrimitiveArray;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author ibnahmad
 */
public class TestJava8 {
    
    public static void main(String[] args){
        int[] intArray = {1, 2, 3, 4, 5};
        
        // 1. Arrays.stream -> IntStream
        IntStream intStream1 = Arrays.stream(intArray);
        intStream1.forEach(x -> System.out.println(x));
        
        System.out.println();
        
        // 2. Stream.of -> Stream<int[]>
        Stream<int[]> temp = Stream.of(intArray);
        
        // Cant print Stream<int[]> directly, convert/flat it to IntStream
        IntStream intStream2 = temp.flatMapToInt(x -> Arrays.stream(x));
        intStream2.forEach(x -> System.out.println(x));
    }
}

// For primitive array, the Arrays.stream and Stream.of will return different output