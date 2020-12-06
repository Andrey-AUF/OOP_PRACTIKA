import static java.lang.Math.sqrt;
public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
    double length(Point p) {
        return sqrt(p.x * p.x + p.y * p.y + p.z * p.z);
    }
}
