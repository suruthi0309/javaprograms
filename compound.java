import java.util.Scanner;
public class compound {
    public static void main(String[] args){
        Scanner scanner =new Scanner (System.in);
        double amount;
        double principle;
        double intrest;
        int year;
        int time;
        System.out.println("Enter the principle amount:");
        principle = scanner.nextDouble();
        System.out.println("Enter the rate of intrest:");
        intrest =scanner.nextDouble() /100;
        System.out.println("Enter the year:");
        year=scanner.nextInt();
        System.out.println(" Enter the time taken:");
        time=scanner.nextInt();
        amount  = principle * Math.pow(intrest+year/time,year*time);
        System.out.println("total amount of the compound intrest:"+amount);
        scanner.close();

    }

}