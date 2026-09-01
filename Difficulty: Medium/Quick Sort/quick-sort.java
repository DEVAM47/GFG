class Solution {
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void quickSort(int[] arr, int i, int j) {
        // code here
        if(i<j){
            int pivotidx=partition(arr,i,j);
        
        quickSort(arr,i,pivotidx-1);
        quickSort(arr,pivotidx+1,j);
        }
    }

    private static int partition(int[] arr, int i, int j) {
        int idx=i-1,pivot=arr[j];
        for(int x=i;x<j;x++){
                if(arr[x]<pivot){
                    idx++;
                    swap(arr,idx,x);
                }                         
                
        }
        idx++;
        swap(arr,j,idx);
        return idx;
    }
    public static void main(String[] args) {
    int[] arr = {10, 7, 8, 9, 1, 5};
    int n = arr.length;

    quickSort(arr, 0, n - 1);

    for (int val : arr) {
        System.out.print(val + " ");  
    }
    }
}