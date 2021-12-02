package StringBuilder;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("akhila");

        sb.append(" chithanoori");//append
        System.out.println(sb);

        sb.insert(7,"baugh ");//insert
        System.out.println(sb);

        sb.replace(7,13,"");//second parameter is exclusive
        System.out.println(sb);

        sb.replace(0,6,"Mrs.");//replace
        System.out.println(sb);

    }
}
