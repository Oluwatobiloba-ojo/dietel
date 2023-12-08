package leet_code;

public class MergeSort {

    public static int[] merge(int[] nums1,int m, int[] nums2, int n){
        int count = m;
        for (int secondIndex = 0; secondIndex < n; secondIndex++){
            nums1[count] = nums2[secondIndex];
            count++;
        }
        return sort(nums1);
    }
    private static int[] sort(int[] arrays){
        for(int count = 0; count < arrays.length; count++){
            sortOfArray(arrays, count);
        }
        return arrays;
    }

    private static void sortOfArray(int[] arrays, int count) {
        for(int counter = count + 1; counter < arrays.length; counter++){
            if(arrays[counter] < arrays[count]){
                int temp = arrays[counter];
                arrays[counter] = arrays[count];
                arrays[count] = temp;
            }
        }
    }
}
