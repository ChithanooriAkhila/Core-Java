package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesFile,agesFile;
        try{
            namesFile = new Scanner(new File("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\student_names.txt"));
            agesFile = new Scanner(new File("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\student_ages.txt"));
            PrintWriter pw = new PrintWriter("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\names_ages.txt");
            while(namesFile.hasNext() && agesFile.hasNext()){
                String name = namesFile.nextLine();
                int age = agesFile.nextInt();
                pw.println(name + " is " + age +" years old.");
            }
            namesFile.close();
            agesFile.close();
            pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("file not Found!!!!");
            System.out.println(e.getMessage());
        }
    }
}
