import java.util.*;
public class Asg1arr {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Size of Array:-> "); 
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.err.println("Enter Array Element:-> ");
       for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
       }
       System.out.println("Enter Target Element:-> ");
       int k = sc.nextInt();
       boolean flag = false;
       int idx = 0;
       for(int i=0;i<n;i++) {
        if(arr[i] == k) {
            idx = i;
            flag = true;
            break;
        }
       }

       if(flag) {
        System.out.println("Indexed of Element:-> "+idx);
       }
       else 
       System.out.println("Element not found...");
    }
}
