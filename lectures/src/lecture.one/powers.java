package lecture.one;
public class powers {
    public static void main(String[] args) {
        long tick, tock;
        tick = System.nanoTime();
        System.out.println(powi(1, 1000000000));
        tock = System.nanoTime();
        System.out.println(tock - tick);

        System.out.println(powr(1, 1000000000));
    }

    public static int powi(int x, int n) {
        int prod = 1;
        while ( n-- > 0 ) {
            prod *= x;
        }
        return prod;
    }
    // x^n = 1, n = 0
    // x^n = x * x^(n-1), n > 0
    //
    // x^n = (x^2)^(n/2), n is even
    //     = x * (x^2)^(n/2), n is odd

    public static int powr(int x, int n) {
        if ( n == 0 ) {
            return 1;
        }
        else if ( n % 2 == 0) {
            return powr(x*x, n/2);
        }
        else {
            return x * powr(x*x, n/2);
        }
    }
}
