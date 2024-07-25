import java.util.Scanner;

public class linear_search {
    public static int search(int arr[],int num){
        int i;
        for(i=0;i<arr.length; i++){
            if(arr[i]==num){
                return i;
            }
        }
    return -1;
                  
}

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1 ,2, 3, 4, 5}; int num;
        System.out.println("Enter the num to be searched");
        num=sc.nextInt();
        int res = search(arr, num);
        System.out.println("Element is present at: " +res);
     }
}
