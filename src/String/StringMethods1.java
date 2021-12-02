package String;

public class StringMethods1 {
    public static void main(String[] args) {
        String name1="john";
        String name2="joseph";
        for(int i=0;i<name1.length();i++){
            System.out.println(name1.charAt(i));
        }

        if(name1.equals(name2)){
            System.out.println("names are equal");
        }
        else{
            System.out.println("Names are different");
        }

        if(name1.compareTo(name2)>0){
            System.out.println("name1 > name2");
        }
        else if(name1.compareTo(name2)<0){
            System.out.println("name1 < name2");
        }
        else{
            System.out.println("name1 == name2");
        }
    }
}
