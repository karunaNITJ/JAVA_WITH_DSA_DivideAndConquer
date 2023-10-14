import java.util.PriorityQueue;
import java.util.*;
public class Heap2IntegerArray {
    public static void main(String[] args) {
        int nums2[] = {1,7,11};
        int nums1[] = {2,4,6};
        int k = 3;
        int n = nums1.length;
        int m = nums2.length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->((a[0]+a[1])-(b[0]+b[1])));
        List<int[]> res = new ArrayList<>();
        if(n==0||m==0||k==0) return;
        for(int i=0;i<n && i<k;i++) 
        pq.offer(new int[]{nums1[i],nums2[0],0});
        
        while(k--> 0 && !pq.isEmpty()) {
            int curr[] = pq.poll();
            res.add(new int[]{curr[0],curr[1]});
            if(curr[2]==m-1) continue;
            pq.offer(new int[]{curr[0],nums2[curr[2]+1],curr[2]+1});
        }

         
        for(int[] ele:res) {
            System.out.print(Arrays.toString(ele)+" ");
        }
        
    }
}
