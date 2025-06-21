package Assignment1;

public class Q4 {
    public static void main(String[] args) {
		
	// 	char[] a = {'c','a','r','b','o','n'};
		
	// 	int l = a.length;
	// 	for(int i = 0 ; i< l ; i++) {
	// 		for(int j = 0 ; j < l ; j++){
	// 			if(i==j) {
	// 				continue;
	// 			}
	// 			for(int k = 0 ; k < l ; k++) {
	// 				if(k==j) {
	// 					continue;
	// 				}
	// 				for(int m = 0 ; m < l ; m++) {
	// 					if(m==k) {
	// 						continue;
	// 					}
	// 					for(int n = 0 ; n < l ; n++) {
	// 						if(n==m) {
	// 							continue;
	// 						}
	// 						for(int o = 0 ; o < l ; o++) {
	// 							if(o == n) {
	// 								continue;
	// 							}
								
	// 						}
	// 					}
	// 				}
	// 			}
	// 		}
	// 	}
		                     
	// }
	// static void swap(char[] list , int a , int b ) {
	// 	char temp = list[a];
	// 	list[a]=list[b];
	// 	list[b]= temp;
		
	// }
	// static boolean equal(int[] list) {
	// 	for(int i = 0 ; i < list.length-1; i++) {
	// 		for(int j = i; j < list.length; j++ ) {
	// 			if(list[i] == list[j]) {
	// 				return false;
	// 			}
	// 		}
	// 	}
	// 	return true;
	// }

    
        char[] chars = {'c', 'a', 'r', 'b', 'o', 'n'};
        System.out.println("All possible strings using 'c', 'a', 'r', 'b', 'o', 'n' exactly once:");
        generatePermutations(chars, 0);
    }

    public static void generatePermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutations(chars, index + 1);
            swap(chars, index, i); // Backtrack
        }
    }

    static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
// Output:-
// carbon
// carbno
// ...

// ncarob
// ncarbo
