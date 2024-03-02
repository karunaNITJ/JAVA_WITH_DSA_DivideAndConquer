public class Asg15arr3 {
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,6,4,2,3,4,3,3};
        int ans = 0;
        for(int ele : arr) {
            ans ^= ele;
        }
        System.out.println("Odd Times occurs in Array :-> "+ans);
    }
}
