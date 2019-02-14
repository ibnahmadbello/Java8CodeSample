package OptionalInDepth.WithJava8;

import java.util.Optional;

/**
 *
 * @author ibnahmad
 */
public class MobileTesterWithOptional {
    
    public static void main(String[] args){
        ScreenResolution resolution = new ScreenResolution(750, 1334);
        DisplayFeatures displayFeatures = new DisplayFeatures("4.7", Optional.of(resolution));
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", Optional.of(displayFeatures));
        
        MobileService mobileService = new MobileService();
        
        int width = mobileService.getMobileScreenWidth(Optional.of(mobile));
        System.out.println("Apple iPhone 6s Screen Width = " + width);       
       
        Mobile mobile1 = new Mobile(2015001, "Apple", "iPhone 6s", Optional.empty());
        int width1 = mobileService.getMobileScreenWidth(Optional.of(mobile1));
        System.out.println("Apple iPhone 6s Screen Width = " + width1);
    }
    
}
