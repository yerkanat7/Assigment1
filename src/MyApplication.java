import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\kanam\\IdeaProjects\\untitled1\\src\\coordinates.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        // read coordinates from the file and add them to the Shape
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        // perimeter, longest side, and average side
        System.out.println("Perimeter of the shape: " + shape.perimeter());
        System.out.println("Longest side of the shape: " + shape.longestSide());
        System.out.println("Average side length of the shape: " + shape.averageSide());
    }
}
