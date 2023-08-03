import java.util.Arrays;

public class Divide1 {
    public static void main(String[] args) {
        int arr[] = {3,8,6,7,5,9,10};
        int n = arr.length;
        int first = -1;
        int second = -1;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                if(first == -1)
                first = i;
                else { 
                second = i+1; 
                break; }
            }
        }

        if(first != -1 && second != -1) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        System.out.println("Sorted Array is:" + Arrays.toString(arr));
    }
}