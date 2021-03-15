import java.util.Scanner;

public class thirtyEight {
    public static int call1(int a) {
        int decimal = 0, i = 0;

        while(a != 0)
        {
            decimal += (a % 10) * Math.pow(8, i);
            ++i;
            a/=10;
        }

        return decimal;

    }

   
    public static int call2(int b) {
        int octal = 0, i = 1;

        while (b != 0)
        {
            octal += (b % 8) * i;
            b /= 8;
            i *= 10;
        }

        return octal;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter a Octal Number");
        m = sc.nextInt();
        sc.close();

        System.out.println(m + " Octal to Decimal = " + call1(m));
        System.out.println(call1(m)+ " Decimal to Octal = " + call2(call1(m)));
            
        }
    
}
