package Collections;

import org.testng.annotations.Test;
import ru.ssau.tk.andreyauf.ooppractika.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {
    List<Location> locations = new ArrayList<>();
    Location location0 = new Waypoint();
    Location location1 = new Settlement();
    Location location2 = new Location();
    Location location3 = new Location();
    Location location4 = new Location();

    @Test
    public void testAddAndGetLocation() {
        List<Location> locations1 = new ArrayList<>();
        Route route = new Route();


        route.addLocation(location0);
        locations1.add(location0);
        assertEquals(route.getLocation(), locations1);

        route.addLocation(location1);
        locations1.add(location1);
        assertEquals(route.getLocation(), locations1);

        route.addLocation(location2);
        locations1.add(location2);
        assertEquals(route.getLocation(), locations1);
    }

    @Test
    public void testAddIndexLocationAndGet() {
        List<Location> locations2 = new ArrayList<>();
        Route route = new Route();

        route.addIndexLocation(0, location2);
        locations2.add(location2);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(1, location2);
        locations2.add(location2);
        assertEquals(route.getLocation(), locations2);

        route.addIndexLocation(2, location1);
        locations2.add(location1);
        assertEquals(route.getLocation(), locations2);
    }

    @Test
    public void testRemoveLocation() {
        List<Location> locations3 = new ArrayList<>();
        Route route = new Route();

        route.addIndexLocation(0, location1);
        route.addIndexLocation(1, location2);
        route.addIndexLocation(2, location0);

        locations3.add(location1);
        locations3.add(location0);

        route.removeLocation(1);
        assertEquals(route.getLocation(), locations3);
    }
    @Test
    public void testIterator() {
        Route route = new Route();
        int count = 0;

        route.addLocation(location0);
        route.addLocation(location1);
        route.addLocation(location2);

        location0.setId(0);
        location1.setId(1);
        location2.setId(2);

        for (Location locations : route) {
            assertEquals(locations.getId(), count++);
        }
        assertEquals(count, 3);
    }
    @Test
    public void testRemove() {
        List<Location> locations4 = new ArrayList<>();
        Route route1 = new Route();

        route1.addIndexLocation(0, location1);
        route1.addIndexLocation(1, location2);
        route1.addIndexLocation(2, location0);

        locations4.add(location1);
        locations4.add(location0);

        route1.remove(location2);
        assertEquals(route1.getLocation(), locations4);

        List<Location> locations5 = new ArrayList<>();
        Route route2 = new Route();

        route2.addIndexLocation(0, location0);
        route2.addIndexLocation(1, location1);
        route2.addIndexLocation(2, location2);
        route2.addIndexLocation(3, location3);
        route2.addIndexLocation(4, location4);

        location0.setId(1);
        location1.setId(2);
        location2.setId(3);
        location3.setId(2);
        location4.setId(2);

        location1.setName("One");
        location3.setName("Two");
        location4.setName("One");

        route2.remove(location4);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location0, location1, location2, location3)));

        route2.remove(location4);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location0, location1, location2)));

        route2.remove(location4);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location0 , location1, location2)));

        route2.remove(location1);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location0, location2)));
    }
    @Test
    public void testEquals() {
        Route route1 = new Route();
        Route route2 = new Route();
        Route route3 = new Route();
        Route route4 = new Route();

        Location city1 = new Settlement();
        Location city2 = new Settlement();
        Location village1 = new Settlement();
        Location village2 = new Settlement();
        Location village3 = new Settlement();

        Location warehouse1 = new Waypoint();
        Location warehouse2 = new Waypoint();
        Location warehouse3 = new Waypoint();
        Location warehouse4 = new Waypoint();

        Point point = new Point(1,2,3);

        city1.setId(1);
        city2.setId(2);
        village1.setId(3);
        village2.setId(1);
        village3.setId(2);
        warehouse1.setId(4);
        warehouse2.setId(2);
        warehouse3.setId(3);
        warehouse4.setId(3);

        route1.addLocation(village2);
        route1.addLocation(city2);
        route1.addLocation(warehouse3);
        route1.addLocation(warehouse1);

        route2.addLocation(city1);
        route2.addLocation(village3);
        route2.addLocation(warehouse4);
        route2.addLocation(warehouse1);

        route3.addLocation(village2);
        route3.addLocation(warehouse1);
        route3.addLocation(warehouse2);
        route3.addLocation(warehouse3);

        route4.addLocation(village2);
        route4.addLocation(warehouse2);
        route4.addLocation(village2);

        assertTrue(route1.equals(route2));
        assertFalse(route1.equals(route3));
        assertFalse(route1.equals(route4));
        assertFalse(route1.equals(point));

        route3.addIndexLocation(1, village3);
        route3.remove(warehouse2);
        route3.remove(warehouse3);
        route3.addIndexLocation(2, warehouse4);
        assertTrue(route1.equals(route3));
    }
}