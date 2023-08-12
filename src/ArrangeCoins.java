public class ArrangeCoins {

    public int arrangeCoins(int n) {
        long start = 0;
        long end  = n;
        int res = 0;

        while(start <=end) {
            long mid  = start + (end - start)/2;
            long rows = mid * (mid +1)/2;

            if (rows == n) {
                return (int) mid;
            } else if (rows < n) {
                start = mid + 1;
                res = (int) mid;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
