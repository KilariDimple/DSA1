class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int total=0;
        int sum=0;
        int n=boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<n;i++){
            int boxes=boxTypes[i][0];
            if(boxes+sum<truckSize){
                total+=boxes*boxTypes[i][1];
                sum=sum+boxes;
            }
            else {
                int k=truckSize-sum;
                total+=k*boxTypes[i][1];
                break;
            }
        }
        return  total;
    }
}