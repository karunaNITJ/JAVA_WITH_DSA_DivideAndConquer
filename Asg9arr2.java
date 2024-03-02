import java.util.*;
public class Asg9arr2 {
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++) {
            boolean isSwapped = false;
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) break;
            ans++;
            System.out.println("Pass "+ans+" :-> "+ Arrays.toString(arr));
           
        }
        System.out.println("Total Pass are :-> "+ans);
    }
}
