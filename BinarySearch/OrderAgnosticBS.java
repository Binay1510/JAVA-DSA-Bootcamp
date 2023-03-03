package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {100,87,56,44,30,15,2,0,-9,-18,-22};
        int target = 56;
        int ans = orderBS(arr, target);
        System.out.println(ans);
    }

    static int orderBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find wheather array is ascending or decsending
        boolean isAsc = arr[start] < arr[end];
//        if(){
//            isAsc=true;
//        }
//        else {
//            isAsc=false;
//        }


        while (start <= end) {
            //find middle element
            //int mid= (start+end)/2;  -> but int has fixed size -> might be poosible that start+end excede range of int in java

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }
            return -1;
        }
    }

