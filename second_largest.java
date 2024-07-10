public class second_largest {
        public static void main(String[] args) {
            int arr[]={12,78,98,45,3,97};
            int len = arr.length;
            int lg = arr[0];
            int slg = arr[0];
            for(int i=0; i<len;i++){
                if(lg<arr[i]){
                    lg=arr[i];   
                    for(int j=1;j<len;j++){
                        if(slg<arr[j] && arr[j] < lg){
                            slg=arr[j];
                        }
                    }
                }
            }
            System.out.println(" Second Largest is:"+slg);
        }
}
