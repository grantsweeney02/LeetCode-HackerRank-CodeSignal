class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++) {
            int runSum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                runSum += accounts[i][j];
            }
            if(runSum > maxWealth) {
                maxWealth = runSum;
            }
        }
        return maxWealth;
    }
}
