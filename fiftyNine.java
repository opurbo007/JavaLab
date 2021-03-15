public class fiftyNine {

    public static void call(int[] a, int[] b) {
       
        int[] crr = new int[a.length + b.length];
        
        int count = 0;
  
        for(int i = 0; i<a.length; i++) {
           crr[i] = a[i];
           count++;
        }
  
        for(int j = 0;j<b.length;j++) {
           crr[count++] = b[j];
        }
  
        for (int i = 0; i < crr.length; i++){
            System.out.print(crr[i] + " ");
        }
     }
    

    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        int[]brr = {5,6,7,8,9,0};
        call(arr, brr);
}
}