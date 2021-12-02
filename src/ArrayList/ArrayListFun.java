package ArrayList;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        //ArrayList list=new ArrayList<>();
        // -->accepts all types of data same as that of list in python(heterogeneous data)
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thursday");
        arrayList.add("Friday");
        arrayList.add("Saturday");
        arrayList.add("Sunday");

        for(String day:arrayList){
            System.out.println(day);
        }
    }
}
