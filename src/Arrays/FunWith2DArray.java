package Arrays;

import java.util.Random;

public class FunWith2DArray {
    public static void main(String[] args) {
        int twoDarr[][]=new int[3][3];
        fill2DArray(twoDarr);
        print2DArray(twoDarr);
        twice2DArray(twoDarr);
        print2DArray(twoDarr);
    }
    public static void fill2DArray(int twoDarr[][]){
        Random random=new Random();
        for(int i=0;i<twoDarr.length;i++){
            for(int j=0;j<twoDarr[i].length;j++){
                twoDarr[i][j]=random.nextInt(10);
            }
        }
    }
    public static void print2DArray(int twoDarr[][]){
        for(int arr[]:twoDarr){
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void twice2DArray(int twoDarr[][]){
        for(int i=0;i<twoDarr.length;i++){
            for(int j=0;j<twoDarr[i].length;j++){
                twoDarr[i][j]*=2;
            }
        }
    }
}
