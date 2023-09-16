import java.util.Scanner;

class SwapTwoNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = scan.nextInt();

        System.out.println("Before Swapping the values of Number 1 and Number 2");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Appraoch 01 | using the third variable 
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // here are the other Approaches
        /*\
            Approach 2 | Using + and - without using third variable
                num1 = num1 + num2
                num2 = num1 - num2
                num1 = num1 - num2
            
            Approach 3 | Using * and / without using third variable
                num1 = num1 * num2
                num2 = num1 / num2
                num1 = num1 / num2

            Approach 4 | using Bitwise XOR(^)
                num1 = num1 ^ num2
                num2 = num1 ^ num2
                num1 = num1 ^ num2

            Approach 5 | using sinlge statement 
                num2 = num1 + num2 - (num1 = num2)
        */
        

        System.out.println("After Swapping the values of Number 1 and Number 2");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}