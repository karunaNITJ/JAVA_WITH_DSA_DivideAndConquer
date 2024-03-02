import java.util.Arrays;

public class Asg8arr2 {
    public static void main(String[] args) {
        int ar[] = {3,5,1,6,0};
        int n = ar.length;
        for(int i=1;i<n;i++) {
            int j = i;
           while(j>0 && ar[j] > ar[j-1]) {
            int temp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = temp;
                j--;
           }
        }

        System.out.println("Sorted Array in Descending Order is:" +Arrays.toString(ar));
    }
}
