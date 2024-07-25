public class appears_once {
    public static void find(int a[], int n){
        int i,j; 
        int c=0;
        for(i=0;i<n;i++){
            for(j=1;j<n;j++){
                if(a[i]==a[j]){
                    c++;
                }
                else{
                    c=1;
                }
            }
            }
            if(c==1){
                System.out.println(a[i]);
            }
        }
       

    public static void main(String[] args){
        int arr[] = {4,1,2,2,1};
        int n = arr.length;
        find(arr, n);
    }
}
