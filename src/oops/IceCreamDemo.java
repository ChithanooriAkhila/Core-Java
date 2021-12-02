package oops;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("chocolate",3,2);
        IceCream yourIC = new IceCream("butterscotch",12,2);

        myIC.addTopping("nuts");
        myIC.addTopping("cherries");

        yourIC.addTopping("springles");

        printIC(myIC);
        printIC(yourIC);
    }
    public static void printIC(IceCream icecream){
        System.out.println(icecream.getName());
        System.out.println("Cost : $" + icecream.getCost());
        System.out.println("Topped with:");
        icecream.printToppings();
        System.out.println();
    }
}
