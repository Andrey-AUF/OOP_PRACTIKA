package Collections;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaypointTest {

    @Test
    public void testToString() {
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();

        depot.setType(WaypointType.DEPOT);
        warehouse.setType(WaypointType.WAREHOUSE);
        depot.setName("KUF");
        warehouse.setName("Angar");
        depot.setLatitude(53.3);
        warehouse.setLatitude(53.41);
        depot.setLongitude(50.08);
        warehouse.setLongitude(50.84);

        assertEquals(depot.toString(), "Waypoint: Type: DEPOT; Name: KUF; Latitude: 53.3; Longitude: 50.08.");
        assertEquals(warehouse.toString(), "Waypoint: Type: WAREHOUSE; Name: Angar; Latitude: 53.41; Longitude: 50.84.");
    }
}