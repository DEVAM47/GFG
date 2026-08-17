class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int z=n;
        int sum=0;
        while(n>0){
            int ls=n%10;
            sum+=ls*ls*ls;
            n/=10;
        }
        if(z==sum) return true;
        else return false;
    }
}