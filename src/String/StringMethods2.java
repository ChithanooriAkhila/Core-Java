package String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str="hello World hello world";//immutable
        str=str.toUpperCase();
        System.out.println(str);

        str=str.toLowerCase();
        System.out.println(str);

        String substring=str.substring(0);
        System.out.println(substring);

        substring=substring.substring(6,substring.length());
        System.out.println(substring);

        System.out.println(str.indexOf(substring));//>0 substring is a substring of str
        //world is substring of hello world and returns the starting index where it matches first
        //which is 6

        System.out.println(substring.indexOf(str));//-1

        String ref="world";

        System.out.println(str.indexOf(ref));//12

        System.out.println(str.lastIndexOf(ref));//18

        System.out.println(str.indexOf(ref,12));
    }
}
