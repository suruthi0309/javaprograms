import java.util.Scanner;
public class temperature {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;
        System.out.println("Enter the temperature:");
        temp = scanner.nextDouble();
        System.out.println("Convert the celsius to fahrenheit? (C or F):");
        unit =scanner.next().toUpperCase();
        newtemp=(unit.equals(("C")) ? (temp-32)* 5/9:(temp * 5/9) +32);
        System.out.printf("%.2f° %s",newtemp,unit);
        scanner.close();
    }

}
