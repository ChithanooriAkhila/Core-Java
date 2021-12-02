package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class parallelArrayLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<Integer> ages=new ArrayList<>();
        for(int i=0;i<5;i++){
            names.add(sc.nextLine());
            ages.add(sc.nextInt());
            sc.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old");
        }
    }
}
