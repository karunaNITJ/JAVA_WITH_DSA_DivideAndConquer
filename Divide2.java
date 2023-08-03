public class Divide2 { 
    public static int[] Segregate(int arr[],int n) {
        int i = 0;
        int j = n-1;
        while(i<=j) {
            if(arr[i] < 0) {
               i = i+1;
            }
            else if(arr[j] >= 0) {
                j = j-1;
            } 
            else 
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        //int nums[] = new int [n];
        for(int x=0;x<n;x++){
            System.out.print(arr[x]+" ");
                       //  arr[x];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        int n = arr.length;
        Segregate(arr, n);
        // for(int i=0;i<n;i++){
        //     System.out.print(Segregate(arr, n)+" ");
        // }
    }
}
