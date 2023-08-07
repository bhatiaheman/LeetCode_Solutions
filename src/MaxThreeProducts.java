import java.util.Arrays;

public class MaxThreeProducts {

    public int maximumProduct(int[] nums) {

        //First Sort the array
        Arrays.sort(nums);

        //In Sorted array, Either the max is found in the last three largest element
        int max1 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

        // or if the numbers are negative , then first two elements are multiplied with the last element
        int max2 = nums[0] * nums[1] * nums[nums.length-1];

        //Then use the Math.max to return the max
        return Math.max(max1,max2);
    }


}
