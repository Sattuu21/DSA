public class insertion_sort {
    public static void insertion(int arr[], int n) {
        for (int i = 1; i < n; i++) {  
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int array[]={13,10,1,52,6};
        int n = array.length;

        System.out.println("Array before sorting");
        for(int b=0;b<n;b++){
            System.out.println(array[b] + " ");
        }
        insertion(array, n);
    }
}
