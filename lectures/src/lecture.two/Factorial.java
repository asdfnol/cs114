package lecture.two;

// 0! = 1
// n! = 1 * 2 * ... * (n - 2) * (n - 1) * n
// (n + 1)! = 1 * 2 * ... * (n - 2) * (n - 1) * n * (n + 1)

// HANOI AGAIN
// n disks requires 2^n - 1
// M(n) = M(n-1) + 1 + M(n-1)
//      = 2M(n-1) + 1
//      = 2(2M(n-2)) + 1) + 1
//      = 4M(n-2) + 3
//      = 4(2m(n-3) + 1) + 3
//      = 8M(n-3) + 7
//      = 8(2M(n-4) + 1) + 7
//      = 16M(n-4) + 15
//      = 32M(n-5) + 31
//      = 2^k M(n-k) + 2^k - 1 
//      let k = n
//      = 2^n M(0) + 2^n - 1
//      = 0 + 2^n - 1
//      2^n - 1


public class Factorial {
}
