import java.util.Scanner;
public class game {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String verb1;

        System.out.println("Enter an adjective(description):");
        adjective1=scanner.nextLine();
        System.out.println("Enter a noun (animal or person):");
        noun1=scanner.nextLine();
        System.out.println("Enter an adjective(description):");
        adjective2=scanner.nextLine();
        System.out.println("Enter a verb end with -ing(action):");
        verb1=scanner.nextLine();
        System.out.println("Enter an adjective(description):");
        adjective3=scanner.nextLine();



        System.out.println("\nToday I went to a "+ adjective1 + "zoo");
        System.out.println("In an exibit, I saw a "+ noun1 +"." );
        System.out.println(noun1 +" was " + adjective2 +" and "+ verb1+"!");
        System.out.println("I was"+ adjective3 + "!" );
        scanner.close();
    }
}
