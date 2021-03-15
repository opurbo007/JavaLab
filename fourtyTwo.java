public class fourtyTwo {
    public static int call(int a[]) {
        int total = 0;         
       
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        total /= a.length;
            
        return total;
       }
   
       public static void main(String[] args) {
        
        int [] arr = {10,20,30,40,50};       
        System.out.println("Avarage is = "+ call(arr));
       } 
           
}
