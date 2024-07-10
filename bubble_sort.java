class bubble_sort {
    public static void sort(int arr[], int n){
        int i,j,temp;
        for(i=0;i<n-1;i++){
            for (j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int a[]={13,46,20,32,10};
        int n = a.length;
        for (int i = 0; i < n; i++) { // Corrected loop boundary
            System.out.println(a[i]);
        }

        sort(a, n);
    }
}
