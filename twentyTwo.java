
import java.util.Scanner;

public class twentyTwo {
    
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
        System.out.println("Reverse Number are = "+ call(m));
    } 
    
}

  