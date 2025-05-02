import java.util.Scanner;
public class nested {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the # of rows:");
        int row = scanner.nextInt();
        System.out.print("Enter the # of coloumns:");
        int coloumn = scanner.nextInt();
        System.out.print("Enter the symbol to use:");
        char symbol= scanner.next().charAt(0);
        for(int i=1;i<=row;i++){
            for(int j=1;j<=coloumn;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
