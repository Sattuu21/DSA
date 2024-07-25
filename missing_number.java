class missing_number{
    public static void array(int a[], int n, int size){
        int s2=0,s1=0;
        for(int i=0;i<size;i++){
            s1 = (n*(n+1))/2;
            s2 = s2+a[i];
        }

        int missing_num = s1-s2;
        System.out.println("Missing number is: "+ missing_num);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int n=7;
        int size = arr.length;
        array(arr, n,size);
    }
}