public class Asg6arr2 {
    public static void main(String[] args) {
        int arr[] = {3,5,1,6,0};
        int n = arr.length;
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
        }
        // Descending Order :- 
        for(int ele : arr)
        System.out.print(+ele+" ");
    }
}
