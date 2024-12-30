package lecture.one;
public class Combinations {
    // two cards
    // As Ah Ad Ac
    // _ _
    //
    // 4C2 = 3C1 + 3C2
    // pick the i-th item
    // nCk = (n-1)C(k-1) + (n-1)Ck
    //
    // 4C5 = 0
    // 4C0 = 1
    // 4C4 = 1
    // 4C2 = 6
    //
    // different conditions:
    //      if ( k > n ) , nCk equals 0
    //      if ( k == 0 || k == n ), nCk equals 1
    //      else  the funciton
    //
    public static void main(String[] args) {
        System.out.println(choose(64, 8));
    }
    public static int choose(int n, int k) {
        if ( k > n ) {
            return 0;
        } else if ( k == 0 || k == n ) {
            return 1;
        }
        return choose(n - 1, k - 1) + choose(n - 1, k);
    }
    // this one takes quite a while.
    // 64 choose 8 is wrong for some reason.
}
