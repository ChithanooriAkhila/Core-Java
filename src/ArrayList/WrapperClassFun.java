package ArrayList;

import java.util.ArrayList;

public class WrapperClassFun {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(new Integer(10));
        arrayList.add(20);//autoboxing

        for(int value :arrayList){ //automatic unboxing
            System.out.println(value);
        }

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        for(Integer value :arrayList){
            System.out.println(value);
        }

        String value="897";
        int val=Integer.parseInt(value);
        val+=89;
        System.out.println(val);

        String number="897.12";
        double num=Double.parseDouble(number);
        num+=1.88;
        System.out.println(num);
    }
}
