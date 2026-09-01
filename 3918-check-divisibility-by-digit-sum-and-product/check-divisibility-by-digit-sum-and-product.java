class Solution {
    public boolean checkDivisibility(int n) {
         int sum=0;
         int k=n;
         int ans=1;
         while(k>0){
            int digit=k%10;
            k=k/10;
            sum=sum+digit;
            ans=ans*digit;
            
         }
         if(n % (sum + ans) == 0) return true;

         return false;
    }
}