class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int middle = (high + low)/2;
            int middleVal = nums[middle];
            if(middleVal == target) {
                return middle;
            }
            else if(middleVal > target) {
                high = middle-1;
            }
            else if(middleVal < target) {
                low = middle+1;
            }
        }
        return -1;
    }
}