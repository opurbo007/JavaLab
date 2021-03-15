public class fourtySix {
    public static void call(int[][] a, int[][] b, int c, int d) {
 
        int[][] total = new int[c][d];
  
          for (int i = 0; i < c; i++) {
        for (int j = 0; j < d; j++) {
            total [i][j] = a[i][j] * b[i][j];
        }
    }

    System.out.println("Sum of 2 matrices are: ");
    for (int[] m : total ) {
        for (int n : m) {
            System.out.print(n + "   ");
        }
        System.out.println();
    }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int row = 2, colum = 3;

        int[][] arr = { { 20, 30, 40 }, { 50, 60, 70 } };
        int[][] brr = { { 80, 90, 10 }, { 20, 30, 40 } };

        call(arr,brr,row,colum);

    }
    
}
