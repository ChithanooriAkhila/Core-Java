package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8Rectangle {
    public static void main(String[] args) {
        Scanner rectangleFile;
        ArrayList<Rectangle> RectangleRef = new ArrayList<>();
        try{
            rectangleFile=new Scanner(new File("C:\\Users\\cakhi\\IdeaProjects\\Java\\Core Java\\src\\Files\\rectangle_data.txt"));
            while(rectangleFile.hasNext()){
                String dimensions=rectangleFile.nextLine();
                int space=dimensions.indexOf(" ");
                double length=Double.parseDouble(dimensions.substring(0,space));
                double width=Double.parseDouble(dimensions.substring(space+1));
                Rectangle rect=new Rectangle(length,width);
                RectangleRef.add(rect);
            }
            rectangleFile.close();
            for(Rectangle rect:RectangleRef){
                getDetails(rect);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
    public static void getDetails(Rectangle rect){
        System.out.println("length = " + rect.getLength());
        System.out.println("width = " + rect.getWidth());
        System.out.println("Area = " + rect.area());
        System.out.println("Circumference = " + rect.perimeter());
        System.out.println("=========\n");
    }
}
