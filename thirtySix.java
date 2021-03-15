import java.util.Scanner;

public class thirtySix {
    
    public static int call(int a, int b) {
          
          return  (b!=0) ?call(b,a%b):a;
        
    }
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0,n=0;
        m = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        int GCD=call(m,n);
        System.out.println("GCD of two numbers are = "+GCD);
    }   
}
