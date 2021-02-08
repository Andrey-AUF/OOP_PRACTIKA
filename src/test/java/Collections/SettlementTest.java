package Collections;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SettlementTest {

    @Test
    public void testToString() {
        Settlement city = new Settlement();
        Settlement village = new Settlement();

        city.setType(SettlementType.CITY);
        village.setType(SettlementType.VILLAGE);
        city.setName("Samara");
        village.setName("Sovety");
        city.setLatitude(53.1);
        village.setLatitude(53.15);
        city.setLongitude(50.11);
        village.setLongitude(50.32);

        assertEquals(city.toString(), "Settlement: Type: CITY; Name: Samara; Latitude: 53.1; Longitude: 50.11.");
        assertEquals(village.toString(), "Settlement: Type: VILLAGE; Name: Sovety; Latitude: 53.15; Longitude: 50.32.");
    }
}