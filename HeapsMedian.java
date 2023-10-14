import java.util.*;
public class HeapsMedian {
    private static Queue<Integer> minHeap,maxHeap;

    static void add(int num) {
        if(!minHeap.isEmpty()&&num<minHeap.peek()) {
            maxHeap.offer(num);
            if(maxHeap.size()>minHeap.size()+1) 
            minHeap.offer(maxHeap.poll());
        }
        else {
            minHeap.offer(num);
            if(minHeap.size()>maxHeap.size()+1) 
            maxHeap.offer(minHeap.poll());
        }
    }
    
    static double getMedian() {
      int median;
      if(minHeap.size()>maxHeap.size())
      median = minHeap.peek();
      else if(minHeap.size()<maxHeap.size())
      median = maxHeap.peek();
      else 
      median = (maxHeap.peek()+minHeap.peek())/2;
      return median;
    }

    static void initialize() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HeapsMedian obj = new HeapsMedian();
        obj.add(5);
        System.out.println("The median is : " + getMedian());
        obj.add(15);
        obj.add(1);
        obj.add(3);
        System.out.println("The median is : " + getMedian());
    }
    public static void main(String[] args) {
        initialize();
    }
}
