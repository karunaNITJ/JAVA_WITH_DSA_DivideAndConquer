public class Asg2arr {
    public static int lastOccurences(int n,int target,int arr[]) {
        int low = 0;
       int high = n-1;
        int occur = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == target) {
             occur = mid;
             low = mid+1;
            }
            else if(arr[mid] > target) 
            high = mid -1;
            else 
            low = mid +1;
        }
        return occur;
    }
    public static void main(String[] args) {
       int arr[] = {1,1,1,2,3,4,4,5,6,6,6,6};
       int n = arr.length;
       int target = 4;
       
       System.out.println("Last Occurence is:-> "+lastOccurences(n, target, arr));

    }
}
