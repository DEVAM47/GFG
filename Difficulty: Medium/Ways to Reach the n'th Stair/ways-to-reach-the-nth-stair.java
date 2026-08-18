class Solution {
    // int count(int n,int prev1 ,int prev 2){
    //     if(n<=3) return n;
    //     return count()
    // }
    public int countWays(int n) {
        // code here
        if(n<=3) return n;
        return countWays(n-1)+countWays(n-2);
        
    }
}