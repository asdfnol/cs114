package lecture.two;
public class Palindrome {
    public static void main(String[] args) {
        if (pal(args[0])) {
            System.out.println("The string \"" + args[0] + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + args[0] + "\" is not a palindrome.");
        }
    }

    public static boolean pal(String s) {
        if (s.length() > 1) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return pal(s.substring(1, s.length() - 1));
            }
            return false;
        }
        return true;
    }
}
