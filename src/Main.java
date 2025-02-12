import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);

        // WEIGHT CONVERSION PROGRAM

        double userWeight;
        int userInput;
        double converted;

        System.out.println("Welcome to the weight conversion program");
        System.out.println("Please type in your weight: ");
        userWeight = scnr.nextDouble();

        System.out.println("Please choose between converting from lbs to kg or kg to lbs");
        System.out.println("For lbs to kg type 1, for kg to lbs type 2");
        userInput = scnr.nextInt();

        if(userInput == 1){
            converted = userWeight / 2.205;
            System.out.printf("Your weight is %.2f kg",converted );

        }
        else if(userInput == 2){
            converted = userWeight * 2.205;
            System.out.printf("Your weight is %.2f lbs",converted );

        }

        while(userInput != 1 && userInput != 2){
            System.out.println("Not a valid choice");
            System.out.print("Please enter a valid choice: ");
            userInput = scnr.nextInt();

            if(userInput == 1){
                converted = userWeight / 2.205;
                System.out.printf("Your weight is %.2f kg",converted );

            }
            else if(userInput == 2){
                converted = userWeight * 2.205;
                System.out.printf("Your weight is %.2f lbs",converted );

            }
        }
        scnr.close();
    }
}
