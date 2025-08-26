import java.util.Scanner;

public class Find_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program to Find an interest :-) \n");
        System.out.println("You want to find Simple Interest :");
        boolean SimpleInterest = input.nextBoolean();
        System.out.println("You want to find Compound Interest :");
        boolean CompoundInterest = input.nextBoolean();

        if (SimpleInterest) {
            System.out.println("Enter  Principal : ");
            double principal = input.nextDouble();
            System.out.println("Principal : " + principal);
            System.out.println("Enter Rate : ");
            double rate = input.nextDouble();
            System.out.println("Rate : " + rate);
            System.out.println("Enter Time : ");
            double time = input.nextDouble();
            System.out.println("Time : " + time);
            System.out.println("Calculate Simple Interest : ");
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest is : " + simpleInterest);
            System.out.println("Thanks!");
        } else if (CompoundInterest) {
            System.out.println("\nEnter the Principal :");
            int p = input.nextInt();
            System.out.print("principal :" + p);
            System.out.println("\nEnter the Simple Interest : ");
            float r = input.nextFloat();
            System.out.print("interest :" + r);
            System.out.println("\nEnter the Time : ");
            float t = input.nextFloat();
            System.out.println("time :" + t);
            System.out.println("Compound Interest is :");
            double result = p * Math.pow((1 + r / 100), t);
            System.out.println(result);
            System.out.println("Thanks!");
        } else {
            System.out.println("Its mean you don't want to find any Interest ");
        }


    }
}






