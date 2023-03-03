package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-19, -3, -1, 0, 2, 4, 8, 14, 22, 44, 98};
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    //return the index

    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            //find middle element
            //int mid= (start+end)/2;  -> but int has fixed size -> might be poosible that start+end excede range of int in java

            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                 end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }
            else {
                return mid;
            }


        }
        return -1;// elemnt not exist
    }
}
