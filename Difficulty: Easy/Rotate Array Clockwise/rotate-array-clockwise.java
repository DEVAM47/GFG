class Solution {
    public void rev(int[] arr, int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    public void rotateclockwise(int[] arr, int k) {
        // code here
       
        int n=arr.length-1;
        if(arr.length!=0){
            k=k%(n+1);
        }
        
        rev(arr,0,n);
        rev(arr,0,k-1);
        rev(arr,k,n);
    }
}