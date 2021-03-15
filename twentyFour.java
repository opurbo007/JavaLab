import java.util.Scanner;

public class twentyFour {
    public static int call(int a) {
        int reverse = 0;
 
         while (a != 0) {
             reverse *= 10;
             reverse += a % 10;
             a /= 10;
         }
       
         return reverse;
     }
 
     public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int m;
         m = sc.nextInt();
         sc.close();
         if (m == call(m)) {
             System.out.println("The number is Palindrome");
         }
         else {
            System.out.println("The number is not Palindrome");
        }
     } 
     
}
