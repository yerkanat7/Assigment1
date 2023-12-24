package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private List<Point> points;

    // initialization a shape with an empty list of points
    public Shape() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    // the perimeter of the shape
    public double perimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalPerimeter += points.get(i).distance(points.get(i + 1));
        }
        totalPerimeter += points.get(points.size() - 1).distance(points.get(0));
        return totalPerimeter;
    }

    // the length of the longest side in the shape
    public double longestSide() {
        double maxDistance = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            double distance = points.get(i).distance(points.get(i + 1));
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }
        double lastDistance = points.get(points.size() - 1).distance(points.get(0));
        if (lastDistance > maxDistance) {
            maxDistance = lastDistance;
        }
        return maxDistance;
    }

    // the average length of the sides in the shape
    public double averageSide() {
        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).distance(points.get(i + 1));
        }
        totalLength += points.get(points.size() - 1).distance(points.get(0));
        return totalLength / points.size();
    }
}
