package Kunal.Brutef;

public class Leet268 {
    // missing number problem from 1 to n
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1,2,5 };

        Solution(nums);
        Missing(nums);
        System.out.println(Missing(nums));
    }

    public static void Solution(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (i == nums[i] || nums[i] >= nums.length) { // this condition is made as onne no. can go out of bound in that
                                                       // csae you can just incremnt the value and move on

                i++;
            } else {
                Swap(nums, i, nums[i]); // if the element is not at the correct position then we swap it with the
                                      // element which is at the correct position
            }
        }

    }

    public static void Swap(int[] nums, int First, int Last) {
        int temp;
        temp = nums[First];
        nums[First] = nums[Last];
        nums[Last] = temp;

    }

    public static int Missing(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;

    }
}