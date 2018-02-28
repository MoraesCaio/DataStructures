import list.*;
/**
 * Created by caiomoraes on 23/02/18.
 */
public class Tests
{
    public static void main(String[] args)
    {
        list.Sequential sequential = new list.Sequential();
        sequential.addElement(0, 1);
        sequential.addElement(0, 2);
        sequential.addElement(0, 3);
        System.out.println(sequential);
        sequential.removeElement(0);
        System.out.println(sequential);

        list.Linked linked = new list.Linked();
        linked.addElement(0, 1);
        linked.addElement(0, 2);
        linked.addElement(0, 3);
        linked.addElement(0, 4);
        System.out.println(linked);

        linked.removeElement(3);
        System.out.println(linked);

        BiLinked biLinked = new BiLinked();
        biLinked.addElement(0, 1);
        biLinked.addElement(0, 2);
        biLinked.addElement(0, 3);
        biLinked.addElement(0, 4);
        System.out.println(biLinked);

        biLinked.removeElement(3);
        System.out.println(biLinked);

        stack.Sequential stSequential = new stack.Sequential();
        System.out.println("\n\nStack Sequential");
        System.out.println("stSequential.isEmpty(): " + stSequential.isEmpty());
        stSequential.push(1);
        System.out.println("stSequential.topElement(): " + stSequential.topElement());
        stSequential.push(2);
        System.out.println("stSequential.topElement(): " + stSequential.topElement());
        System.out.println("stSequential.isEmpty(): " + stSequential.isEmpty());
        System.out.println("stSequential.isFull(): " + stSequential.isFull());
        System.out.println("stSequential.pop(): " + stSequential.pop());
        System.out.println("stSequential.topElement(): " + stSequential.topElement());

        stack.Linked stLinked = new stack.Linked();
        System.out.println("\n\nStack Linked");
        System.out.println("stLinked.isEmpty(): " + stLinked.isEmpty());
        stLinked.push(1);
        System.out.println("stLinked.topElement(): " + stLinked.topElement());
        stLinked.push(2);
        System.out.println("stLinked.topElement(): " + stLinked.topElement());
        System.out.println("stLinked.isEmpty(): " + stLinked.isEmpty());
        System.out.println("stLinked.pop(): " + stLinked.pop());
        System.out.println("stLinked.topElement(): " + stLinked.topElement());

        queue.Linked qLinked = new queue.Linked();
        qLinked.insert(1);
        qLinked.insert(2);
        qLinked.insert(3);
        qLinked.insert(4);
        System.out.println(qLinked);
        System.out.println(qLinked.remove());
        System.out.println(qLinked.remove());
        System.out.println(qLinked.remove());
        System.out.println(qLinked.remove());
        System.out.println(qLinked.remove());
    }
}
