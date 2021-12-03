package Files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Akhila");
        names.add("Monica");
        names.add("Sam");
        names.add("Doe");
        names.add("john");

        try{
            PrintWriter pw=new PrintWriter("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\names.txt");
            for(String name:names)
            pw.println(name);
            pw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not Found!!!");
        }
    }
}
