package OptionalInDepth.WithoutJava8;

/**
 *
 * @author ibnahmad
 */
public class MobileTesterWithoutOptional {
    
    public static void main(String[] args){
        
        ScreenResolution resolution = new ScreenResolution(750, 1334);
        DisplayFeatures displayFeatures = new DisplayFeatures("4.7", resolution);
        Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", displayFeatures);
        
        MobileService mobileService = new MobileService();
        
        int mobileWidth = mobileService.getMobileScreenWidth(mobile);
        System.out.println("Apple iPhone 6s Screen Width = " + mobileWidth);
        
        ScreenResolution resolution1 = new ScreenResolution(0, 0);
        DisplayFeatures displayFeatures1 = new DisplayFeatures("0", resolution1);
        Mobile mobile1 = new Mobile(2015001, "Apple", "iPhone 6s", displayFeatures1);
        int mobileWidth1 = mobileService.getMobileScreenWidth(mobile1);
        System.out.println("Apple iPhone 6s Screen Width = " + mobileWidth1);
    }
}
