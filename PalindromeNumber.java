import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the Number to Check Whether it's palindrome or not : ");
        int inputNumber = scan.nextInt();
        int storeInputNumber = inputNumber;
        int reverseNumber = 0;

        while (inputNumber != 0) {
            reverseNumber = reverseNumber*10 + inputNumber%10 ;
            inputNumber /= 10;
        }

        if (storeInputNumber == reverseNumber) {
            System.out.println("The Input Number is Palindrome");
        } else {
            System.out.println("The Input Number is Not a palindrome");
        }
    }
}
