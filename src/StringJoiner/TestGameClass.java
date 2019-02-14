package StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ibnahmad
 */
public class TestGameClass {
    
    public static void main(String[] args){
        
        test();
        
    }
    
    public static void test(){
        List<Game> list = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );
        
        String result = list.stream().map(x -> x.getName()).collect(Collectors.joining(", ", "{", "}"));
        
        System.out.println(result);
    }
    
}
