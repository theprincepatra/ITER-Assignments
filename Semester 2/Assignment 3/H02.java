
package Assignment3;

public class HQ2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,9,11,23,46,89};
        System.out.println(BinarySearch( a,0,a.length-1,9));
        
    }
    static int  BinarySearch(int[] list , int start , int end , int target){
        int mid = start +(end-start)/2 ;
        if(start > end){
            return -1;
        }else if (list[mid] == target) {
            return mid; 
        }else if(list[mid] > target){
            return BinarySearch(list, start, mid-1, target);
        }
        return BinarySearch(list, mid+1, end, target);

    }

}
/*
Output:-
6
 */
