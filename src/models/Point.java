package models;

public class Point {
    // coordinates
    private double x;
    private double y;

    // initialization of a point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // calculation of the distance from the current to the destination point
    public double distance(Point destination) {
        double dx = this.x - destination.x;
        double dy = this.y - destination.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // string representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
