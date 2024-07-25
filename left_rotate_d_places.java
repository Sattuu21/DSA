import java.util.Scanner;

public class left_rotate_d_places {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the position for the array to be rotated");
        int n=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7};
        solve(arr, n);

    }
    public static void solve(int arr[],int n){
        if(n==2){
            int temp = arr[5];
            int temp2 = arr[6];
            for(int i=0;i<arr.length-1;i++){
                arr[i+2]=arr[i];
            }
            arr[0]=temp;
            arr[1]=temp2;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
              }
        }
        
    }

}
