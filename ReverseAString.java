import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String to be Reverse : ");
        String inpuString = scan.nextLine();
        String reverseString = "";

        int lengthOfInputString = inpuString.length();

        // Approach 1 | Using the Algorithm

        
        for (int i = lengthOfInputString-1; i >= 0; i--) {
            reverseString += inpuString.charAt(i);
        }

        // Approach 2 | Uisng the Character Array

        // char[] arr = inpuString.toCharArray();

        // for (int i = lengthOfInputString - 1; i >= 0 ; i--) {
        //     reverseString += arr[i];
        // }

        System.out.print("After Reversing the Input String : "+reverseString);

    }
}
