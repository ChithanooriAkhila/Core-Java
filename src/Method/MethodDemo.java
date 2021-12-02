package Method;

public class MethodDemo {
    public static void main(String[] args) {
        parameterless();
        parameterized(100);
        System.out.println(return10());
        System.out.println(sum(10,20));//actual arguments
        System.out.println(square(1.2));
    }
    public static void parameterless(){
        System.out.println("hello");
    }
    public static void parameterized(int val){
        System.out.println("the value is : "+val);
    }
    public static int return10(){//parameterless ,return
        return 10;
    }
    public static int sum(int num1,int num2){//parameterized and return
        //formal parameters
        return num1+num2;
    }
    public static double square(double val){
        return val*val;
    }
}
