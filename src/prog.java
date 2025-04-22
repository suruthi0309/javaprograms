
import java.util.Scanner;
public class prog {
    public static void main(String[] args){
        double area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length=scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth=scanner.nextDouble();
        area=length*breadth;
        System.out.println("The area of the rectangle is  "+area);
        scanner.close();


    }


}
