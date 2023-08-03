import java.util.*;
public class Divide4 {
    // static boolean isPossible(Integer a[],int b[],int n,int k) {
    //     // sort the Ayrray in decreasing order
    //     Arrays.sort(a,Collections.reverseOrder());
    //     // sorting the array in ascending order
    //     Arrays.sort(b);
    //     for(int i=0;i<n;i++) {
    //         if(a[i]+b[i] < k)
    //         return false;

    //     }
    //     return true;
    // }
    // public static void main(String[] args) {
    //     Integer a[] = {2,3,5,7} ;
    //     int b[] = {5,4,3,6};
    //     int k = 5;
    //     int n = a.length;

    //     if(isPossible(a,b,n,k)) 
    //     System.out.println("YES");
    //     else
    //     System.out.println("NO");
    static boolean isPossible(Integer a[], int b[], int n, int k){
    	// Sort the array a[] in decreasing order.
    	Arrays.sort(a, Collections.reverseOrder());
    
    	// Sort the array b[] in increasing order.
    	Arrays.sort(b);
    
    	// Checking condition on each index.
    	for (int i = 0; i < n; i++)
    	if (a[i] + b[i] < k)
    		return false;
    
    	return true;
    }
    public static void main(String[] args) {
    	Integer a[] = {2, 1, 3, 5, 1};
    	int b[] = {7, 8, 9 , 2 , 6};
    	int k = 7;
    	int n = a.length;
    
    	if (isPossible(a, b, n, k))
    	System.out.print("Yes");
    	else
    	System.out.print("No");
        
    }
}
