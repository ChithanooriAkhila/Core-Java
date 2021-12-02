package Method;

public class CountDown {
    public static void main(String[] args) {
        countDownFrom(15);
        countTill(1,10);
    }
    public static void countDownFrom(int val){
        if(val>0){
            //System.out.println(val);
            countDownFrom(val-1);
        }
    }
    public static void countTill(int val,int target){
        if(val>target) return;
        countTill(val,target-1);
        System.out.println(target);
    }
}
