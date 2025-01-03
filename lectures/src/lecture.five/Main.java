package lecture.five;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(1);
        int n, num;
        num = args.length == 1 ? Integer.parseInt(args[0]) : 11;

        List<Integer> list = new ASortedList<Integer>();

        System.out.println("insert");
        for ( int i = 0; i < num; i++ ) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for ( Integer j : list ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nsearch");
        for ( int i = 0; i < num / 2; i++ ) {
            n = rand.nextInt(num);
            System.out.println(n + ": " + list.search(n));
        }

        System.out.println("\nretrieve");
        for ( int i = -1; i < num+1; i++ ) {
            System.out.println(i + ": " + list.retrieve(i));
        }

        System.out.println("\nremove");
        for ( int i = 0; i < num; i++ ) {
            n = rand.nextInt(num);
            list.remove(n);
            System.out.print(n + ": ");
            for ( Integer j : list ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\ninsert");
        for ( int i = 0; i < num; i++ ) {
            n = rand.nextInt(num);
            list.insert(n);
            System.out.print(n + ": ");
            for ( Integer j : list ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

