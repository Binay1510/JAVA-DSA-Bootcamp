package linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {18,12,-9,14,55,2};
        int target=55;
        System.out.println(linears(arr,target,1,4));


    }
    static int  linears(int[] arr, int target,int start, int end){
        if(arr.length==0){
            return -1;

        }
        for (int index = start; index <= end; index++) {
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
