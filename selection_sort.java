class selection_sort {
    public static void sort(int a[], int n) {
        int i, j, min;
        for (i = 0; i < n - 1; i++) { // Corrected loop boundary
            min = i;
            for (j = i + 1; j < n; j++) { // Corrected loop boundary
                if (a[j] < a[min]) { // Corrected condition and index usage
                    min = j;
                }
            }
            int temp = a[min]; // Swapping with the minimum index
            a[min] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted array");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = {13, 76, 89, 12, 4, 56, 99};
        System.out.println("Array before sorting");
        int n = arr.length;
        for (int i = 0; i < n; i++) { // Corrected loop boundary
            System.out.println(arr[i]);
        }

        sort(arr, n);
    }
}
