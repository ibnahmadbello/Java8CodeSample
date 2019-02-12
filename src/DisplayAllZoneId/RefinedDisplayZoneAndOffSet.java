package DisplayAllZoneId;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map;

/**
 *
 * @author ibnahmad
 */
public class RefinedDisplayZoneAndOffSet {
    
    public static final boolean SORT_BY_REGION = false;
    
    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();
        
        long total = ZoneId.getAvailableZoneIds()
                .stream()
                .map(ZoneId::of)
                .map(zoneId -> new SimpleEntry<>(zoneId.toString(), localDateTime.atZone(zoneId)
                .getOffset()
                .getId()
                .replaceAll("Z", "+00:00")))
                .sorted(SORT_BY_REGION ? Map.Entry.comparingByKey() : Map.Entry.<String, String>comparingByValue().reversed())
                .peek(e -> System.out.printf(String.format("%35s (UTC%s) %n", e.getKey(), e.getValue())))
                .count();
        
        System.out.println("\nTotal Zone IDS " + total);
    }
}
