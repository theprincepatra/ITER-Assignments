package Assignment1;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(maxmin(new int[]{3,644,1,5,6,2,4,55,6,4,644,1,63})));
	}
	public static int[] maxmin(int[] list) {
		int[] a = {list[0],list[0],0,0,0 ,0};//{ max , min , position max , position min, max count, min count}
		for (int i = 0 ; i < list.length ; i++) {
			if(list[i]>a[0]) {
				a[0] =list[i];
				a[2]= i;
				a[4] = 1;
			}else if(list[i] == a[0]) {
					a[4]++;
			}  
			
			if(list[i]< a[1]) {
				a[1] =list[i];
				a[5] =1;
				a[3] = i;
			}else if(list[i] == a[1]) {
				a[5]++;
				a[2] = i ;
				
			}
			
		}
		return a;
	}
}

// Output:-
// [644, 1, 11, 2, 2, 2]
