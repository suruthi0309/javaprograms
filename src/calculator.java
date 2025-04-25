import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double firstnum;
        double secondnum;
        char operator;
        double ans=0;
        boolean validoperator=true;
        System.out.println("Enter the first number:");
        firstnum=scanner.nextDouble();
        System.out.println("Enter an operator:(+,-,*,/,^)");
        operator=scanner.next().charAt(0);
        System.out.println("Enter the second number:");
        secondnum=scanner.nextDouble();
        switch (operator) {
            case '+' -> ans = firstnum + secondnum;
            case '-' -> ans = firstnum - secondnum;
            case '*' ->ans = firstnum * secondnum;
            case '/' -> {
                if (secondnum == 0) {
                    System.out.println("couldn't divide by zero");
                    validoperator=false;
                } else {
                    ans= firstnum / secondnum;
                }
            }
            case '^' -> ans = Math.pow(firstnum, secondnum);
            default -> {
                System.out.println("invalid operator!!");
                validoperator=false;
            }
        }
        System.out.println(ans);
        scanner.close();



    }

}
