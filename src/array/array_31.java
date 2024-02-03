package array;
public class array_31 {
    public void arr_31_out() {
        int i, n;
        int [] data;
        data = new int[] {3,8,1,7};
        n = data.length;
        int[] nums = new int[n];
        // befüllung des zweiten Arrays
        for (i = 0; i < nums.length; i++){
            nums[i] = 2 * data[i] - 3;
// Probe -> nums[i] = data[i];
            System.out.println("nums[" + i + "] = " + nums[i]);
        }
    }
}
