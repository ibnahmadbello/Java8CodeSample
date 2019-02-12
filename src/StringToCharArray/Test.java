package StringToCharArray;

/**
 *
 * @author ibnahmad
 */
public class Test {
    public static void main(String[] args){
        
        String password = "password123";
        
        password.chars() //IntStream
                .mapToObj(x -> (char) x) //Stream<Character>
                .forEach(System.out::println);
    }
}
