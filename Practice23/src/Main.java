import classes.*;

public class Main {
    public static void main(String[] args) {

        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        System.out.println(linkedQueue.offer(1));
        System.out.println(linkedQueue.offer(2));
        System.out.println(linkedQueue.offer(3));
        System.out.println(linkedQueue.poll());
        System.out.println(linkedQueue.peek());
        System.out.println(linkedQueue.size());
        System.out.println(linkedQueue.isEmpty());

        new Main1(args);
    }
}
