import java.util.Scanner;
class Armstrong_number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = input.nextInt();
        boolean armstrong = isArmstrong(number);
        if (armstrong){
            System.out.println("Yes! the number is a Armstrong number.");

        }
        else{
            System.out.println("No! the number is not a Armstrong number");
        }

    }

    public static boolean isArmstrong(int num){
        int TotalDigits = NoOfdigits(num);
        int numcopy = num;
        int FinalNumber = 0;
        while(num>0){
            int lastDigit = num%10;
            num  = num/10;
            FinalNumber += power(lastDigit,TotalDigits);
        }
        return FinalNumber == numcopy;

    }
    public static int power(int lastDigit , int TotalDigits){
        int result = 1;
        int i = 0;
        while(i<TotalDigits){
            result *= lastDigit;
            i++;
        }
        return result;
    }

    public static int NoOfdigits(int n){
        int digits = 0;
        while(n>0){
            digits++;
            n /= 10;

        }
        return digits;
    }
}

