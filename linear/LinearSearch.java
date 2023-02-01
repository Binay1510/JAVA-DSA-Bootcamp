package linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums ={23,55,12,9,-7,10,-8,14};
        int target=55;
        int ans=linears(nums,target);
        System.out.println(ans);
    }
    // search array :return index if item found
    // otherwise if item not found return -1
    static int  linears(int[] arr, int target){
        if(arr.length==0){
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            //check for elemet at every index if it is = target
             int element = arr[index];
             if(element== target){
                 return index;
             }
        }
        // if element is not found in the arr then
        return -1;
    }
}
