class Solution {
    public static int countDigits(int n) {
        // Code here
        int c=0;
        
        while(n!=0){
            n=n/10;
            c++;
        }
        return c;
    }
}
