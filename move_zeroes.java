class move_zeroes{
    public static void zeroes(int arr[],int n){
        int j=-1;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }

        }

        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
            
        }
        System.out.println("Updated array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
    }

     public static void main(String[] args) {
        int a[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = a.length;
         zeroes(a, n);
    
     }   
}

