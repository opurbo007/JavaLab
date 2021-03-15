import java.util.Scanner;

public class twentySeven {
    public static int call(int a) {
        int sum = 0, reminder;
        while (a != 0) {
            reminder = a % 10;
            sum += reminder * reminder * reminder;
            a /= 10;
        }
       return sum;
    }
 
     public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int m;
         String result;
         m = sc.nextInt();
         sc.close();
         result = (call(m) == m) ? " " : " not ";
         System.out.println(m+" is an"+result+"Armstrong Number");
     }    
}