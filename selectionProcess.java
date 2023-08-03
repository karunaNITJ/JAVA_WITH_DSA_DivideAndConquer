public class selectionProcess { 
    static int partition(int num[],int l,int h) {
         int pivot = num[l];
        int i = l;
       
        for(int j=l+1;j<num.length;j++) {
            if(num[j]<pivot) {
                i = i+1;
                int temp = num[j];
                num[j] = num[i];
                num[i] = temp;
            }
        }

        int tem = num[l];
        num[l] = num[i];
        num[i] = tem;
        return i;
    }
    public static int SelectioProcedure(int arr[],int l,int h,int k) {
        
           // int mid = l+(h-l)/2;
            //int n = arr.length;
            int m = partition(arr,l,h) ;
            if(m == k-1){
                return arr[m];
            }
            else if(m < k) 
            return SelectioProcedure(arr, m+1,h,k);
            else 
            return SelectioProcedure(arr,l,m-1,k);
        
    }
    public static void main(String[] args) {
        int ar[] = {20,10,30,40,60,50,90};
        int n = ar.length;
        int k = 6;
        int ans = SelectioProcedure(ar,0,n-1,k);
        System.out.println(ans);
    }
}
