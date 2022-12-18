class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] numReturn = new int[2];
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length; j++){
                if(int[i]+int[j]==target){
                    int[0] = i;
                    int[1] = j;
                }
            }
        }
    }
}