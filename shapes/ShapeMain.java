package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of shapes

        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {

            String type = sc.next();
            String color = sc.next();
            boolean filled = sc.nextBoolean();

            if (type.equalsIgnoreCase("RECTANGLE")) {

                double width = sc.nextDouble();
                double length = sc.nextDouble();

                shapes[i] = new Rectangle(color, filled, width, length);

            } 
            else if (type.equalsIgnoreCase("CIRCLE")) {

                double radius = sc.nextDouble();

                shapes[i] = new Circle(color, filled, radius);
            }
        }

        // OUTPUT
        for (Shape s : shapes) {

            System.out.println(s);
            System.out.println("Area = " + s.getArea());
            System.out.println("Perimeter = " + s.getPerimeter());
            System.out.println();
        }

        sc.close();
    }
}