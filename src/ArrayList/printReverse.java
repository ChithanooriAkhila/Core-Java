package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class printReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            int value=scanner.nextInt();
            if(value>=0) list.add(value);
            else break;
        }
        int n= list.size();
        for(int i=n-1;i>=0;i--) System.out.println(list.get(i));
    }
}
