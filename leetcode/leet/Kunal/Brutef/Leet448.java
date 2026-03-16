package Kunal.Brutef;

import java.util.ArrayList;
import java.util.List;

public class Leet448 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 6, 7, 8, 8};
        List<Integer> ans = Solution(nums);
        System.out.println(ans);
    }

    public static List<Integer> Solution(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (           
             nums[correct] != nums[i]) {       // ✅ no duplicate at target
                Swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }

    public static void Swap(int[] nums, int First, int Last) {
        int temp = nums[First];
        nums[First] = nums[Last];
        nums[Last] = temp;
    }
}