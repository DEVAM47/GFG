// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int i=0,j=i+1,temp=0;
        int n=arr.length;
        
        int last=arr[n-1];
        for( i=n-1;i>0;i--){
            
            arr[i]=arr[i-1];
           
        }
        arr[0]=last;
        }
    }
