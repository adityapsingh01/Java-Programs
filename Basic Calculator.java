import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        System.out.println("Basic Calculator :-)");
        Scanner input = new Scanner(System.in);
        System.out.print("Please select which operation you would like to perform : ");
        String operation = input.nextLine();
        System.out.println("You select the operation of : "+operation);
        System.out.print("Enter first value : ");
        float first = input.nextFloat();
        System.out.print("Enter second value : ");
        float second = input.nextFloat();

         float summation;
        float subtraction;
        float multiplication;
        float division;
        if (operation.equals("summation")) {
            summation = first + second;
            System.out.println("Summation of the given value is "+summation);
        }
        else if(operation.equals("subtraction")) {
            subtraction = first - second;
            System.out.println("Subtraction of the given value is "+subtraction);
            }
        else if(operation.equals("multiplication")) {
            multiplication = first * second;
            System.out.println("Multiplication of the given value is "+multiplication);
            }
        else{
            division = first / second;
            System.out.println("Division of the given value is "+division);
            }


    }
}
