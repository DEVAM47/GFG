class Solution {
    boolean check(char[] arr,int i,int j){
        if(i>=j) return true;
        if(arr[i]!=arr[j]) return false;
        return check(arr,i+1,j-1);
    }
    public boolean isPalindrome(int n) {
        n=Math.abs(n);
       String s=String.valueOf(n);
       
       int m=s.length()-1;
       
       return check(s.toCharArray(),0,m);
        
        
    }
}