import java.util.Random;

public class RandomClassFun {
    public static void main(String[] args) {
        Random random=new Random();
        int myRandomNumber;

        myRandomNumber=random.nextInt();
        System.out.println("number is "+myRandomNumber);

        myRandomNumber=random.nextInt(10);//0->9
        System.out.println("number is "+myRandomNumber);

        int counter=0;
        while(counter<10){
            myRandomNumber=random.nextInt(6)+1;
            System.out.printf("dice roll face up number in turn %d: %d\n",counter+1,myRandomNumber);
            counter++;
        }
    }
}
