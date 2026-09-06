class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        for(int nums:position){
            if((nums%2)==0) even++;
            else  odd++;
        }
        return Math.min(even,odd);
    }
}