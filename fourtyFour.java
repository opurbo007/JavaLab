public class fourtyFour {

    public static double call(double a[])
    {
        double sum = 0.0, std = 0.0;

        for(double i : a) {
            sum += i;
        }

        double m = sum/a.length;

        for(double j: a) {
            std += Math.pow(j - m, 2);
        }

        return Math.sqrt(std/a.length);
    }
    public static void main(String[] args) {
        double[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Standard Deviation = " +call(arr));
    }

  
}
