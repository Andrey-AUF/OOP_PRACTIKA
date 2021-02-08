package Collections;

public class Settlement extends Location {
    private int settlement;
    private SettlementType type;

    public Settlement() {

    }

    public int getSettlement() {
        return settlement;
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }

    public SettlementType getType() {
        return type;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Settlement: Type: " + type  + "; Name: " + getName() + "; Latitude: " + getLatitude() + "; Longitude: " + getLongitude() + ".";
    }
}
