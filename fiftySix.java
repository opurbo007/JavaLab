public class fiftySix {
    public static void call(int[] a) {

       for (int j = 0; j < a.length; j++) {
           
            System.out.print( a[j]+ " , ");
        }
    }
    
    public static void main(String[] args) {

        int[] arr = { 20, 30, 40,50,60,70,100 };
        call(arr);

    }
}
