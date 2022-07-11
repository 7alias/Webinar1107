import java.util.Arrays;

public class FindNum {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};

        int target = 8;
        System.out.println(Arrays.toString(FindNums(nums, target)));

    }

    private static int[] FindNums(int[] nums, int target) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (nums[i] == target) {
                    first = i;
                } else {
                    last = i;
                }
            }
        }


        return new int[]{first, last};
    }

}