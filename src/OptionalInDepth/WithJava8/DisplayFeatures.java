package OptionalInDepth.WithJava8;

import java.util.Optional;

/**
 *
 * @author ibnahmad
 */
public class DisplayFeatures {
    
    private String size; // In inches
    private Optional<ScreenResolution> resolution;

    public DisplayFeatures(String size, Optional<ScreenResolution> resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public String getSize() {
        return size;
    }

    public Optional<ScreenResolution> getResolution() {
        return resolution;
    }
    
    
}
