import java.util.*;
public class Asg7arr2 {
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int min_idx = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] > arr[min_idx])
                min_idx = j;
            }
            if(min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("Sorted Array in Descending order are :-> "+Arrays.toString(arr));
    }
}
