package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sizeOfArray=scanner.nextInt();
        int array[]=new int[sizeOfArray];
        for(int counter=0;counter<sizeOfArray;counter++){
            array[counter]=scanner.nextInt();
        }
        for(int arrayValue:array){
            System.out.print(arrayValue+"\t");
        }
        System.out.println("\n"+Arrays.toString(array));
    }
}
