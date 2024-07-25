class remove_duplicates{
    public static int duplicate(int arr[],int size){
        int i=0;
            for(int j=1;j<size;j++){
                if(arr[j]!=arr[i]){
                    i++;
                    arr[i]=arr[j];
                }    
            }
            return i+1;
        }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,3};
        int n=arr.length;
        int res = duplicate(arr,n);
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        
    }
}
}
