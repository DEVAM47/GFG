class Solution {
    public long fact(int n){
        if(n==0 || n==1 ) return 1;
        return n*fact(n-1);
        
    }
    public long nPr(int n, int r) {
        // code here
        long ans=fact(n)/fact(n-r);
        return ans;
        
    }
}