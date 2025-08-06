class Solution {
    public int removeElement(int[] nums, int val) {
        int writePointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[writePointer] = nums[i];
                writePointer++;
            }
        }

        return writePointer;
    }
}
