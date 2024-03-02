public class Asg14arr3 {
    public static void main(String[] args) {
        int num = 13;
        int count = 0;
        while(num > 0) {
            if((num&1)==1)
            count++;
            num>>=1;
        }
        System.out.println("NUmber of Set Bits are :-> "+count);
    }
}
