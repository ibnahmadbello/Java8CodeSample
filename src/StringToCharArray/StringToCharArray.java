package StringToCharArray;

/**
 *
 * @author ibnahmad
 */
public class StringToCharArray {
    public static void main(String[] args){
        
        String password = "password123";
        
        char[] passwordInCharArray = password.toCharArray();
        
        for (char temp : passwordInCharArray) {
            System.out.println(temp);
        }
    }
}
