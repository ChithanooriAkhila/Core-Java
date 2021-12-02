package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillArrayList(list);
        System.out.println(printSum(list));
    }
    public static void fillArrayList(ArrayList<Integer> list){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
    }
    public static int printSum(ArrayList<Integer> list){
        int sum = 0;
        for(int val:list){
            sum+=val;
        }
        return sum;
    }
}
