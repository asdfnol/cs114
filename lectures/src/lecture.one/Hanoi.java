// towers of hanoi problem??
package lecture.one;
public class Hanoi {
    public static void main(String[] args) {
        tower(3 , 'A', 'C', 'B');
    }
    // src tower
    // use tower
    // dst tower
    //
    // move ( n - 1 ) disks from A to B
    // move nth disk from A to C
    // move ( n - 1) disks from B to C

    // exponential timed function, that is best case
    public static void tower(int n, char src, char dst, char use) {
        if ( n > 0 ) {
            tower(n - 1, src, use, dst);
            System.out.println("move disk " + n + " from " + src + " to " + dst);
            tower(n - 1, use, dst, src);
        }
    }
}
