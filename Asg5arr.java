public class Asg5arr {
    public static boolean isPerfectSqr(int num) {
        if(num < 2) return true;
        int l = 0;
        int r = num/2;
        while(l <= r) {
            int mid = l+(r-l)/2;
            long square = mid*mid;
            if(square==num) 
            return true;
            else if(square < num) 
                l = mid + 1;
           else 
             r = mid - 1;
            
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 16;
       if(isPerfectSqr(num))
       System.out.println("Number is Perfect Square :-> " + isPerfectSqr(num));
       else 
       System.out.println("number is not perfect square:-> "+isPerfectSqr(num));
    }
}
