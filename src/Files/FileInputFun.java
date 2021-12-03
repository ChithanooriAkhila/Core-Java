package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile ;
        try{
            infile = new Scanner(new File("input.txt"));
            int input,sum=0;
            while(infile.hasNext()){
                input=infile.nextInt();
                sum+=input;
                //System.out.println(input);
            }
            System.out.println(sum);
            infile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("file not found!!!");
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("error while reading contents of the file");
        }
    }
}
