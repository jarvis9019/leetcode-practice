public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            System.out.println("reversed: "+reversed);
            x /= 10;
            System.out.println("x: "+x);
        }

        return original == reversed;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(12));
    }
}
