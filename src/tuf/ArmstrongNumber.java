package tuf;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int duplicate = n;
        int k = String.valueOf(n).length();

        while(n>0){
            int digit = n%10;
            sum += Math.pow(digit , k);
            n /= 10;


        }
            System.out.println(sum == duplicate);

    }
}
