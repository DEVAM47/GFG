class Solution {
    public static int fibbo(int n){
        
        if(n<=1){
            return n;
            
        }
        return fibbo(n-1)+fibbo(n-2);
        
        
            
            
            
        }
        
        
    
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=fibbo(i);
        }
        return arr;
    }
}
