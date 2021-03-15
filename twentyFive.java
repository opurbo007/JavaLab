import java.util.Scanner;

public class twentyFive {
    public static void call(int a) {
      
        int count = 0;
            for (int i =2 ; i <= a/2; i++) {
                if (a % i == 0) {
                    count++;
                    break;
                }
            }      
            if ( a <= 1) {
                System.out.println("The number " + a + " is  not prime or composite");
            }
            else {
                if (count == 0) {
                    System.out.println("The number " + a + " is prime");
                }
                else{
                    System.out.println("The number " + a + " is not prime");
                }             
            }   
     }
 
     public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int m;
         m = sc.nextInt();
         sc.close();
         call(m);
        //  System.out.println("Reverse Number are = "+ call(m));
     } 
     
    
}
