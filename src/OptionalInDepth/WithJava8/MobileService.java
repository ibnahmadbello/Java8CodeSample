package OptionalInDepth.WithJava8;

import java.util.Optional;

/**
 *
 * @author ibnahmad
 */
public class MobileService {
    
    public int getMobileScreenWidth(Optional<Mobile> mobile){
        return mobile.flatMap(Mobile::getDisplayFeatures)
                .flatMap(DisplayFeatures::getResolution)
                .map(ScreenResolution::getWidth)
                .orElse(0);
    }
        
}
