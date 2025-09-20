package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class HQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  length of the array");
        int n = sc.nextInt();
        System.out.println("Enter the values of the first Array");
        int[] a = arrays(n, sc);
        // sort(a);
        System.out.println("Enter the values of the second Array");
        int[] b = arrays(n, sc);
        // sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println(Arrays.toString(c));

        sc.close();
    }
    static int[] arrays(int n , Scanner sc ){
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = sc.nextInt();
        }
        return  ans;
    }
 // Insertion sort code
    static void sort(int[] list){
        for (int i = 1; i < list.length; i++) {
            for (int j = i ; j > 0 ; j--){
                if(list[j] < list[j-1]){
                    swap(list, j-1, j);
                }
            }
        }
    }
    static void swap(int[] list , int a , int b ){
        int temp = list[a];
        list[a] = list[b];
        list[b]= temp;
    }

}

/*
Output:- 
Enter the  length of the array
3
Enter the values of the first Array
1
2
3
Enter the values of the second Array
4
3
5
[1, 2, 3]
[4, 3, 5]
[4, 6, 15]
 */
