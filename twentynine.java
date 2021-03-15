import java.util.Scanner;

public class twentynine {
    public static int call(int a) {

            for (int i =2 ; i <=a/2; i++) {
             if(a%i==0){
                
                return 0;
             }
            }      
            return 1;
     }
 
     public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int m, n;
         System.out.println("Enter start number ");
         m = sc.nextInt();
         System.out.println("Enter Last number ");
         n = sc.nextInt();
         sc.close();
       
        
         if (m < n) {
            if (m == 0) {
                m += 2;
              }
            if (m == 1) {
                m += 1;
            }
             System.out.println("All prime number between "+m+" and "+n+" are :");
             for (int i = m; i <= n; i++) {
                 if (call(i) == 1) {
                     System.out.print(i + ", ");                    
                }
            }
         }
         else {
             System.out.println("Start number cannot be larger then last number");
         }
     } 
}
