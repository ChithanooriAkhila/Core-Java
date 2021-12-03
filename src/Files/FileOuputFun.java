package Files;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileOuputFun {
    public static void main(String[] args) {
        try{
           PrintWriter pw=new PrintWriter("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\output.txt");
           pw.println("hello there!!!");
           pw.println("My name is akhila chithanoori");
           pw.append("pursuing b.tech in computer science");
           pw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("couldn't write to the file");
        }
    }
}
