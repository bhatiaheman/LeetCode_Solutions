public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        int start =0;
        int end  = nums.length-1;


        while(start <= end) {

            int mid = start + (end - start)/2;

            int duplicate = 0;

            for(int num: nums) {
                if(num <= mid) {
                    duplicate++;
                }
            }

            if(duplicate <=mid) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return start;
    }
}
