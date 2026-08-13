class Solution {
    public boolean check(int[] arr,int mid,int k){
        int c=1;
        int last=arr[0];
        for(int q:arr){
            if(q-last>=mid){
                c++;
                last=q;
                
            }
            
        }
        return c>=k;
    }
    public int aggressiveCows(int[] arr, int k) {
   
Arrays.sort(arr);
int i=1;
int n=arr.length;
int j=arr[n-1]-arr[0];
int ans=0;
    
        while(i<=j){
            int mid=i+(j-i)/2;
            boolean x=check(arr,mid,k);
            if(x){
                ans=mid;
                i=mid+1;
                
                
            }
            else j=mid-1;
        }
    return ans;
        
    }
    
}