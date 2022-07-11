import java.util.Arrays;

public class Nums {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int []result = new int[2];

        try {
            for (int i : result) {
                for (int j : result)

                if(nums [i] + nums [j]== target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        } catch (Exception e) {
        }
        ;

        return result;
    }

}
