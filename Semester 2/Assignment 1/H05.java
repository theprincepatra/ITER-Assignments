package Assignment1;

import java.util.Arrays;

public class HQ5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for(int i = 0 ; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int)(Math.random()*2);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        int rowmax = maxRow(matrix) ; 
        int  colmax= maxCol(matrix)  ;

        System.out.println("The largest row index: "+ rowmax);

        System.out.println("The largest column index: "+ colmax);
    }

    static int maxCol(int[][] matrix){
        int col = 0;
        int max =  0 ;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0 ;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == 1){
                    count++;
                }
            }
            if(count > max ){
                max = count ;
                col = i ;
            }
        }
        return col ;
    }

    static int  maxRow(int[][] matrix ){
        int row = 0 ; 
        int max = 0 ;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0 ;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > max ) {
                max = count;
                row = i ;
            }
        }
        return row ; 
    }
}

/*
Output:- 
[1, 0, 0, 1]
[0, 1, 0, 0]
[1, 1, 1, 1]
[1, 1, 0, 1]
The largest row index: 2
The largest column index: 0
 */
