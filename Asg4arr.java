public class Asg4arr {
    public static void main(String[] args) {
        int arr[] = {2,5,5,5,6,6,9,9,9,9};
        int target = 5;
        int n = arr.length;
        int ans = 0;
        int start = 0;
        int end = n-1;
        boolean flag = false; 
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                ans++;
                flag = true;
              start = mid+1;
            }
            else if(arr[mid] > target)
            end = mid-1;
            else 
            start = mid+1;
        }
         start = 0;
         end = n-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                ans++;
              end = mid-1;
            }
            else if(arr[mid] > target)
            end = mid-1;
            else 
            start = mid+1;
        }

        if(flag)
        System.out.println("Target "+target+" occurs "+(ans-1)+ " times: ");
        else
        System.out.println("Target is not Found :");
    }
}
