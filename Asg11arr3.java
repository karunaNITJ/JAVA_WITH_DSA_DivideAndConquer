public class Asg11arr3 {
    public static void main(String[] args) {
        int num = 10;
        StringBuilder br = new StringBuilder();
        while(num > 0) {
           br.insert(0,num&1);
           num>>=1;
        }
        if(br.length()==0) 
        br.append(0);
        System.out.println("Binary Representation :-> "+br.toString());
    }
}