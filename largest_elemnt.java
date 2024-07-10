class largest_elemnt{
    public static void main(String[] args) {
        int arr[]={12,78,98,45,3};
        int len = arr.length;
        int lg = arr[0];
        for(int i=0; i<len;i++){
            if(lg<arr[i]){
                lg=arr[i];   
            }
        }
        System.out.println("Largest is:"+lg);
    }
}