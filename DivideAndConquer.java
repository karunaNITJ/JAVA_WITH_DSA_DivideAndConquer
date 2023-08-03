public class DivideAndConquer {
    static class Interval {
        int start;
        int end;
        public Interval(int start,int end) {
           this.start = start;
           this.end = end;
        }
    }
  static boolean isOverlap(Interval arr[],int n) {
    // find overall max element
    int max_ele = 0;
    for(int i=0;i<n;i++) {
        if(max_ele < arr[i].end) {
            max_ele = arr[i].end;
        } 
     }

        int aux[] = new int[max_ele+1];
        for(int j=0;j<n;j++) {
          int x = arr[j].start;
          int y = arr[j].end;
          aux[x]++;
          aux[y]--;
        }

        for(int i=1;i<=max_ele;i++) {
            aux[i] += aux[i-1];
            if(aux[i] > 1)
            return true;
        }
        return false;
    
  }
  
    public static void main(String[] args) {
        Interval arr1[] = {new Interval(1,3),new Interval(5,7),new Interval(1,4),new Interval(10,13)};
        int n = arr1.length;
        if(isOverlap(arr1,n)) 
        System.out.println("YES");
        else 
        System.out.println("NO");
    }
}
