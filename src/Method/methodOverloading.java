package Method;

public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(20,30,40));
        System.out.println(sum(10,"12"));
        System.out.println(sum("akhila","chithanoori"));
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }
    public static int sum(int x,String y){
        return x+Integer.parseInt(y);
    }
    public static String sum(String x,String y){
        return x+" "+y;
    }
}
