import java.util.Scanner;

public class thirtyTwo {
    public static int call(int a,int b,char c) {
        int result = 0;
               
            switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            }
       
    return result;
    }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int m, n;
         char operator;
         System.out.println("Enter first number");
         m = sc.nextInt();
         System.out.println("Enter second number");
         n = sc.nextInt();
         System.out.println("Enter operator");
         operator = sc.next().charAt(0);
         sc.close();
         
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
         System.out.println("The "+operator+" between "+m+ " and "+n+" is:\n"+call(m,n,operator));  
        }
        else {
            System.out.println("You can use only +, -, * ,/, % as operator ");
        }
      
     }

}