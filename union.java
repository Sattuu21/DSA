import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

class union{
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[]) {
  HashSet <Integer> s=new HashSet<>();
  ArrayList < Integer > Union=new ArrayList<>();
  for(int i=0;i<arr1.length;i++){
    s.add(arr1[i]);
  }
  for(int i=0;i<arr2.length;i++){
    s.add(arr2[i]);
    } 
    for(int i:s){
        Union.add(i);
    }
    return Union;
  }

  public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5,6,7,8,9,10};
    int arr2[] = {2,3,4,4,5,11,12};

    ArrayList<Integer> union = FindUnion(arr1, arr2);
    for(int i:union){
        System.out.print(i + " ");
    }
  }
}