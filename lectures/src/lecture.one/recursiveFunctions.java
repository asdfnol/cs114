package lecture.one;
public class recursiveFunctions {
    public static void main(String[] args) {
        
        // System.out.println(reverse("hello"));
        // i'm getting stackoverflow error

        for ( int i = 0; i < 47; i++ ) {
            System.out.println(fiboi(i));
        }
    }

    // rev("hello") -> "olleh"
    // rev("ello") + "h"
    // rev("llo") + "e" + h"
    // rev("lo") + "l" + "e" + "h"
    // rev("o") + "l" + "l" + "e" + "h"
    // rev("") + "o" + "l" + "l" + "e" + "h"
    // base case = empty string

    public static String reverse(String s) {
        if (s.length() > 0) {
            return reverse(s.substring(1) + s.charAt(0));
        }
        return "";
    }

    // never seen an iterative fibo method
    public static int fiboi(int n) {
        int a = 0, b = 1, c;
        for ( int i = 0; i < n; ++i) {
            c = a+b;
            a = b;
            b = c;
        }
        return a;
    }

    public static int fibor(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibor(n - 1) + fibor(n - 2);
    }
}
