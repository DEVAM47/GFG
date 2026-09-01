class Solution {
    public void merge(int arr[] ,int l,int m,int r){
        int l1=m-l+1;
        int l2=r-m;
        int[] L1=new int[l1];
        int[] L2=new int[l2];
        int k=l;
        for(int i=0;i<l1;i++){
            L1[i]=arr[k++];
        }
         for(int i=0;i<l2;i++){
            L2[i]=arr[k++];
        }
        int i=0,j=0;
        k=l;
        
        while(i<l1 && j<l2){
            if(L1[i]>L2[j]){
                arr[k]=L2[j++];
            }
            else{
                arr[k]=L1[i++];
            }
            k++;
        }
        while(i<l1){
            arr[k++]=L1[i++];
        }
        while(j<l2){
            arr[k++]=L2[j++];
        }
        
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return ;
        int mid=l+(r-l)/2;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge(arr,l,mid,r);
    }
}