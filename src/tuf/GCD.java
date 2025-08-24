package tuf;

public class GCD {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 20;
        int gcd = 1;

        /*if(n1> 0 && n2>0) {
            int smallestNumber = Math.min(n1, n2);

            for (int i = 2 ; i<=smallestNumber; i++){
                if(n1%i == 0 && n2%i == 0){
                    if(i > gcd){
                        gcd = i;
                    }
                }
            }
        }
        System.out.println(gcd);*/

        while(n1 > 0 && n2 > 0){
            if(n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2 % n1;
            }

        }
        if(n1 == 0){
            System.out.println(n2);
        }else {
            System.out.println(n1);
        }
    }
}
