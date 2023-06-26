// package Practise;

import java.util.Arrays;

public class One {
        public void moveZeroes(int[] nums) {
        int insertPos = 0;
        
        // Traverse the array
        for (int num : nums) {
            // If the current element is non-zero, move it to the insert position
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }
        
        // Fill the remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        One one = new One();
        one.moveZeroes(nums);
        System.out.print(Arrays.toString(nums));
    }
}
