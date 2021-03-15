class fiftyTwo{

    public static void call(double[] a, double[] d) {

        double com;

        for (int j = 0; j < d.length; j++) {
            com = a[j] - d[j];
            System.out.print(com + " , ");
        }
    }
    
    public static void main(String[] args) {

        double[] start = { 20.55, 30.3};
        double[] end = { 2.6, 55.9};
        call(start, end);

    }


}