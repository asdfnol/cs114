package lecture.three;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(1);

        // Stack<Integer> stack = Math.random() < 0.5 ? new AStack<Integer>() : new RStack<Integer>();
        // either creates an RStack or an AStack

        Stack<Integer> stack = new RStack<Integer>();

        int num = args.length == 1 ? Integer.parseInt(args[0]) : 11;
        System.out.println("push");
        for ( int i = 0; i < num; ++i ) {
            int n = rand.nextInt(num);
            stack.push(n);
            System.out.print(n + ": ");
            for ( Integer j : stack) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        Integer j;
        System.out.println("pop");
        while ((j = stack.pop()) != null) {
            System.out.print(j + ": ");
            for ( Integer k : stack ) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.println(stack);
    }
}
