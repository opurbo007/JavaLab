public class fourtyEight {

    
    public static void call(int[][] a, int c, int d) {
 
        int[][] trans = new int[d][c];
        for(int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                trans[j][i] = a[i][j];
            }
        }
    
        System.out.println("The new transport matrix is: ");
        for(int[] m : trans) {
            for (int n : m) {
                System.out.print(n + "    ");
            }
            System.out.println();
        }
    
    }
    
    public static void main(String[] args) {
    
        int row = 2, colum = 3;
    
        int[][] arr = { { 20, 30, 40 }, { 50, 60, 70 } };
     
    
        call(arr,row,colum);
    
    }
    
}
