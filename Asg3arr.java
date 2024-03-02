public class Asg3arr {
    public static void main(String[] args) {
        int binary[] = {0,0,0,0,0,0,0,0,1,1};
        int n = binary.length;
        int idx = 0;
        int start = 0;
        int end = n-1;
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(binary[mid] == 1) {
                idx = mid;
                end = mid-1;
            }
            else if(binary[mid] < 1)
            start = mid + 1;
            else 
            end = mid - 1;
        }

        System.out.println("Number of 1's are :-> "+ (n-idx));
    }
}
