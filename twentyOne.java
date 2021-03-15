import java.util.Scanner;

public class twentyOne {

    public static int call(int a) {
        int count = 0;
        while (a != 0) {
          a/= 10;
          count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        m = sc.nextInt();
        sc.close();
        int count=call(m);
        System.out.println("Number of digits are = "+count);
    }   
    
}
