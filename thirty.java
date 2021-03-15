import java.util.Scanner;

public class thirty {
    
    public static int call(int a) {
        int sum = 0, reminder,temp=a, result;
        while (temp != 0) {
            reminder = temp % 10;
            sum += reminder * reminder * reminder;
            temp /= 10;         
        }
        result = (sum == a) ? 1 : 0;
        
          return result;
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



