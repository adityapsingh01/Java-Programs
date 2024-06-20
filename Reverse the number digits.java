import java.util.Scanner;
class Reverse_Number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = input.nextInt();
        int ultakro = reverseNumber(number);
        System.out.println("The reversed number is : "+ultakro);

    }
    public static int reverseNumber(int numbers){
        int newNumber = 0;
        while(numbers > 0){
            int digit = numbers % 10;
            newNumber = newNumber * 10 + digit;
            numbers /= 10;

        }
        return newNumber;
    }
}
