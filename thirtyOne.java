import java.util.Scanner;

public class thirtyOne {

    public static void call(int a) {
        // int factor;
        if (a != 0) {
            System.out.println("Factors of " + a + " are:");
            
            for (int i = 1; i <= a; i++) {
                 if (a % i == 0) {
                   System.out.print(i+",");
                    
                 }
             }
         }
           
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int  m;
         m = sc.nextInt();
         sc.close();
         call(m);
      
     }
 }