import java.util.Scanner;

public class thirtyFive {
    
    public static int call(int a) {

        // if (a >0) {
        //     return a* call(a - 1);
        // } else {
        //     return 1;
        // }

        return (a > 0) ? a * call(a - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        String fact;
        m = sc.nextInt();
        sc.close();
        
        fact = (m < 0) ? "Sorry, you must input positive number" : "factorial of the number " + m + " is = " + call(m);
        System.out.println(fact);

    }

}

