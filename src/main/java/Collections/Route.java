package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Route implements Iterable<Location>{
    private ArrayList<Location> locations = new ArrayList<>();

    public ArrayList<Location> getLocation() {
        return locations;
    }

    public void addLocation(Location location){
        this.locations.add(location);
    }

    public void addIndexLocation(int index,Location location){
        this.locations.add(index,location);
    }

    public void removeLocation(int index){
        this.locations.remove(index);
    }

    public Location getFirstLocation(){
        return locations.get(0);
    }

    public Location getLastLocation(){
        return locations.get(locations.size()-1);
    }

    @Override
    public Iterator<Location> iterator() {
        return new Iterator() {
            private Location location = getFirstLocation();
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < getLocation().size();
            }

            @Override
            public Location next() {
                if (!(hasNext())){
                    throw new NoSuchElementException();
                } else {
                    location = locations.get(count++);
                    return location;
                }
            }
        };
    }
}
