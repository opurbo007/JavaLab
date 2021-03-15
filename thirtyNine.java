import java.util.Scanner;

public class thirtyNine {
    public static int call1(long a) {
        int octal = 0, decimal = 0, i = 0;

        while(a != 0)
        {
            decimal += (a % 10) * Math.pow(2, i);
            ++i;
            a /= 10;
        }

        i = 1;

        while (decimal != 0)
        {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octal;

    }

   
    public static long call2(int b) {
        int decimal = 0, i = 0;
        long binary = 0;

        while(b != 0)
        {
            decimal += (b % 10) * Math.pow(8, i);
            ++i;
            b/=10;
        }

        i = 1;

        while (decimal != 0)
        {
            binary += (decimal % 2) * i;
            decimal /= 2;
            i *= 10;
        }

        return binary;
    }
    
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter a binary Number");
        m = sc.nextInt();
        sc.close();

        System.out.println(m + " Binary to Octal = " + call1(m));
        System.out.println(call1(m)+ " Octal to binary = " + call2(call1(m)));
            
        }
}
