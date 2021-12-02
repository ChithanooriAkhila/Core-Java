package oops;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(12.75);
        Circle c3 = new Circle();
        getCircleDetails(c1);
        getCircleDetails(c2);
        circleDetails(c3);
    }
    public static void getCircleDetails(Circle circle){
        System.out.println("r = "+circle.getRadius());
        System.out.println("C = "+String.format("%.2f",circle.circumference()));
        System.out.println("A = "+String.format("%.2f",circle.area()));
        System.out.println();
    }
    public static void circleDetails(Circle circle){
        System.out.printf("r = %.2f\n",circle.getRadius());
        System.out.printf("C = %.2f\n",circle.circumference());
        System.out.printf("A = %.2f\n",circle.area());
        System.out.println();
    }
}
