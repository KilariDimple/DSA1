class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>hs=new HashSet<>();
        for(int  arr:nums) hs.add(arr);
        int ans=k;
         while(hs.contains(ans)){
            ans+=k;
         }
         return ans;
    }
}