import java.util.Scanner;
public class cart {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String item;
        double price;
        int quantity;
        double total;
        System.out.print("ENTER ITEM NAME:");
        item=scanner.nextLine();
        System.out.print("ENTER EACH PRICE:");
        price=scanner.nextDouble();
        System.out.println("ENTER QUANTITY TO BUY:");
        quantity=scanner.nextInt();
        total=price*quantity;
        System.out.println("total price is "+total);
        scanner.close();



    }

}
