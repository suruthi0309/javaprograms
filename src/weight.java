import java.util.Scanner;
public class weight {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double weight;
        double new_weight;
        int choice;
        System.out.println("welcome to weight conversion program:");
        System.out.println("1.Convert lbs into kg:");
        System.out.println("2.Convert kgs into lbs:");
        System.out.println("Enter the choice:");
        choice =scanner.nextInt();
        if(choice==1){
            System.out.print("Enter the weight in lbs:");
            weight= scanner.nextDouble();
            new_weight=weight*0.453592;
            System.out.printf("The new weight in kgs:%.2f",new_weight);

        }
        else if(choice==2){
            System.out.print("Enter the weight in kgs:");
            weight= scanner.nextDouble();
            new_weight=weight*2.20462;
            System.out.printf("The new weight in lbs:%.2f",new_weight);

        }
        else{
            System.out.println("you not entered the valid choice:");
        }
        scanner.close();
    }

}
