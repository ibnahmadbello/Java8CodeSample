package StringJoiner;


import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 *
 * @author ibnahmad
 */
public class StringJoinerExample {
    
    public static void main(String[] args){
        
        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        String result = sj.toString();
        System.out.println(result);
        System.out.println();
        
        StringJoiner sj1 = new StringJoiner("/", "prefix-", "-suffix");
        sj1.add("2016");
        sj1.add("02");
        sj1.add("26");
        String result1 = sj1.toString();
        System.out.println(result1);
        System.out.println();
        
        String result2 = String.join("-", "2015", "10", "31");
        System.out.println(result2);
        System.out.println();
        
        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
        String result3 = String.join(", ", list);
        System.out.println(result3);
        System.out.println();
        
        List<String> list1 = Arrays.asList("java", "python", "nodejs", "ruby");
        String result4 = list1.stream().map(x -> x).collect(Collectors.joining(" | "));
        System.out.println(result4);
        
    }
    
}
