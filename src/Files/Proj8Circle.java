package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8Circle {
    public static void main(String[] args) {
        Scanner circleFile;
        ArrayList<Circle> CircleRef = new ArrayList<>();
        try {
            circleFile = new Scanner(new File("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\circle_data.txt"));
            PrintWriter pw=new PrintWriter("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\circles_output.txt");
            while (circleFile.hasNext()) {
                double radius = circleFile.nextDouble();
                Circle circle = new Circle(radius);
                CircleRef.add(circle);
            }
            circleFile.close();
            for (Circle circle : CircleRef) {
                printDetailsToConsole(circle);
                pw.append("radius = " + circle.getRadius());
                pw.append("Area = " + circle.area());
                pw.append("Circumference = " + circle.circumference());
                pw.append("=========\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printDetailsToConsole(Circle circle) {
        System.out.println("radius = " + circle.getRadius());
        System.out.println("Area = " + circle.area());
        System.out.println("Circumference = " + circle.circumference());
        System.out.println("=========\n");
    }
}
