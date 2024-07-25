import java.util.ArrayList;
import java.util.List;
class count_one {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 2, 1, 1, 0, 1}; 
        List<Integer> counts = countOnes(arr);
        int max = counts.get(0);
        for(int i=0;i<counts.size();i++){
            if(counts.get(i)>max){
                max=counts.get(i);
                System.out.println(max);
            }
            

        } 
    }

    public static List<Integer> countOnes(int[] arr) {
        List<Integer> counts = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > 0) {
                    counts.add(count);
                }
                count = 0; // Reset the count when encountering a different number
            }
        }

        // Add the last count if the array ends with 1's
        if (count > 0) {
            counts.add(count);
        }

        return counts;
    }
}
