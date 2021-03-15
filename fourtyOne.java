import java.util.Scanner;

public class fourtyOne {
    public static int call(int a, int b) {
    
        return  (b != 0) ? a * call(a, b - 1) : 1;
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
