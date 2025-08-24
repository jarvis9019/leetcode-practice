package tuf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDivisors {
    public static int[] divisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        if(n > 0){
            for(int i=1; i<=n ; i++){
                if(n%i == 0){
                    divisors.add(i);
                }

            }
        }
        return divisors.stream().mapToInt(Integer::intValue).toArray();

    }

    public static int[] divisorsOptimal(int n) {
        List<Integer> divisors = new ArrayList<>();
        if(n>0){
            for(int i=1; i*i<=n; i++){
                if(n%i == 0){
                    divisors.add(i);
                    if(n/i != i){
                        divisors.add(n/i);
                    }
                }
            }
        }
        return divisors.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = divisorsOptimal(36);
        System.out.println(arr);
    }
}
