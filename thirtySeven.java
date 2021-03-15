import java.util.Scanner;

public class thirtySeven {
    
    public static int call1(long num) {
        int decimal = 0, k = 0;
        long remainder;

        while (num != 0) {
            remainder = num % 10;
            num /= 10;
            decimal += remainder * Math.pow(2, k);
            k++;
        }

        return decimal;
    }

   
    public static long call2(int a) {
        long binary = 0;
        int remainder, k = 1;

        while (a != 0) {
            remainder = a % 2;
            a /= 2;
            binary += remainder * k;
            k *= 10;
        }

        return binary;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter a binary Number");
        m = sc.nextInt();
        sc.close();

        System.out.println(m + " Binary to Decimal = " + call1(m));
        System.out.println(call1(m)+ " Decimal to Binary = " + call2(call1(m)));
            
        }
    
}