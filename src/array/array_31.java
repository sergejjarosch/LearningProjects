package array;

public class array_31 {
    int i, n;

    public array_31(){
        int [] data;
        data = new int[] {3,8,1,7};
        n = data.length;

        int[] nums = new int[n];
        // befüllung des zweiten Arrays
        for (i = 0; i < nums.length; i++){
            nums[i] = 2 * data[i] - 3;
        }
        public void array_32_out(){
            System.out.println("nums[" + i + "] = " + nums[i]);
        }

    }
}