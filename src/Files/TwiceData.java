package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner numsFile;
        try{
            numsFile = new Scanner(new File("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\nums.txt"));
            PrintWriter pw = new PrintWriter("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\twice_nums.txt");
            while(numsFile.hasNext()){
                int num = numsFile.nextInt();
                pw.println(2*num);
            }
            numsFile.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found!!!!");
            System.out.println(e.getMessage());
        }
    }
}
