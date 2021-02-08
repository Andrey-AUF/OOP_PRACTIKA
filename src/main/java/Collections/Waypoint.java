package Collections;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;

    public Waypoint() {

    }

    public WaypointType getType() {
        return type;
    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }
}

