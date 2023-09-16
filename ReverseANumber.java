import java.util.*;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter A Number to reverse : ");
        
        int num = scan.nextInt();

         // Approach 1 | Using algorithm

        //  int revrseNum = 0;
        //  while (num!=0) {
        //     revrseNum = revrseNum * 10 + num % 10;
        //     num/=10;
        //  }

        //  Approach 2 | Using StringBuffer Class
        
           StringBuffer sb = new StringBuffer(String.valueOf(num));
           StringBuffer revrseNum = sb.reverse();
         

         System.out.println("After Reversing A Number : " + revrseNum);
          

    }
}
