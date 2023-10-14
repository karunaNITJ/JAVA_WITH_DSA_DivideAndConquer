import java.util.*;
public class HeapsKthSmallest {
    public static int KthSmallest(int[][] mat,int k) {
        int col = Math.min(mat[0].length,k);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        for(int []row : mat) {
            // max priority queue for the i-th row
            PriorityQueue<Integer> nextPq = new PriorityQueue<>(Collections.reverseOrder());
           for(int i:pq) {
            for(int s=0;s<col;s++) {
               nextPq.add(i+row[s]);
               // keep the size of pq <= k
               if(nextPq.size()>k)
               nextPq.poll();
             }
           }
           pq = nextPq;
        }
        return pq.poll();
    }
    public static void main(String[] args) {
        int [][]mat = {{1,3,11},{2,4,6}};
        int k = 6;
        System.out.println("Desired output is : "+KthSmallest(mat,k));
    }
}
