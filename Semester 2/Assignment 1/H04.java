package Assignment1;

public class HQ4 {
    public static void main(String[] args) {
        
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] sum = new double[a.length][a[0].length];
            for (int i = 0; i < sum.length; i++) {
                for (int j = 0; j < sum[0].length; j++) {
                    sum[i][j] = a[i][j] + a[i][j] ;
                }
            }
        return sum ;
    }
}
