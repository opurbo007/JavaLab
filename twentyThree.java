import java.util.Scanner;

public class twentyThree {
    public static int call(int a,int b) {
      while (b != 1) {
             a *= a;
             b--;                
         }
       
         return a;
     }
 
     public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int m, n;
         System.out.println("Enter the base number");
         m = sc.nextInt();
         System.out.println("Enter the power number");
         n = sc.nextInt();
         sc.close();
         System.out.println("Caulation is = "+ call(m,n));
     } 
     
    
}
