class Solution {
    int pow(int n,int i){
        if(i==1) return n;
        return n*pow(n,i-1);
    }
    public int reverseExponentiation(int n) {
        
        // code here
        if(n==10) return 10;
        return pow(n,n);
    }
}
