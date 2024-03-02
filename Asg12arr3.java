public class Asg12arr3 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }

        return true;
    }
    public static void main(String[] args) {
        int num = 15;
        System.out.println("Is " + num + " a power of two? " + isPowerOfTwo(num));
    }
}
