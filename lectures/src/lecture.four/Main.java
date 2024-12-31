package lecture.four;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = Math.random() < 0.5 ? new AQueue<Integer>()
            : new RQueue<Integer>();
        int num = args.length == 1 ? Integer.parseInt(args[0]) : 11;

        System.out.println("enqueue");
        for ( int i = 0; i < num; ++i) {
            queue.enqueue(i);
            System.out.print(i + ": ");
            for ( Integer k : queue ) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println(queue);

        System.out.println("dequeue");
        Integer j;
        // j is being incremented inside this condition here
        // return value of dequeue is the head.data i think????
        while ((j = queue.dequeue()) != null) {
            System.out.print(j + ": ");
            for (Integer k : queue) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // it's really not all that difficult.
        // the abstract data types are just, ya know, difficult to grasp all of it at first.
        // it's about as difficult as grasping binary search, merge sort,etc. was.
        // on a quite longer scale.
        //
        //
        // there's a weird shrink() bug tho.
    }
}

