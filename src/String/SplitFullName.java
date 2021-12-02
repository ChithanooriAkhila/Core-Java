package String;

import java.util.Scanner;

public class SplitFullName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fullName=sc.nextLine();
        int space=fullName.indexOf(" ");
        String firstName=fullName.substring(0,space);
        String lastName=fullName.substring(space+1);

        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());
    }
}
