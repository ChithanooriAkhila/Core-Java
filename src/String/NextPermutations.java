package String;

import java.util.ArrayList;
import java.util.Scanner;

public class NextPermutations {
    public static void main(String[] args) { //psvm
        ArrayList<String> firstNames=new ArrayList<>();
        ArrayList<String> lastNames=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextLine();
        }
        for(int i=0;i<5;i++){
            int space=arr[i].indexOf(" ");
            firstNames.add(arr[i].substring(0,space));
            lastNames.add(arr[i].substring(space+1));
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(firstNames.get(i)+ " "+ lastNames.get(j));
            }
        }
    }
}
