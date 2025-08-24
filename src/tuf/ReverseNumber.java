package tuf;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = -23;
        char[] c = String.valueOf(number).toCharArray();

        /*if(number<0){
            StringBuilder sb = new StringBuilder();
            sb.append("-");
            for(int i=c.length-1; i>=1; i--){
                sb.append(c[i]);
            }
            System.out.println(sb.toString());
        }else{
            StringBuilder sb = new StringBuilder();
            for(int i=c.length-1; i>=0; i--){
                sb.append(c[i]);
            }
            System.out.println(sb.toString());
        }*/
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;

            // Check for overflow before multiplying or adding
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                System.out.println("Overflow occurred! Reversed integer exceeds Integer.MAX_VALUE.");
                return;
            }
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                System.out.println("Underflow occurred! Reversed integer is less than Integer.MIN_VALUE.");
                return;
            }

            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed integer: " + reversed);

    }
}
