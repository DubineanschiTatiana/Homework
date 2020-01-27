
import Container.*;
import Task.*;

public class Main {

    public static void main(String... args) {

        OutTask task1 = new OutTask("Task 1");
        OutTask task2 = new OutTask("Task 2");
        OutTask task3 = new OutTask("Task 3");
        OutTask task4 = new OutTask("Task 4");

        // TEST Stack ( pop, push, isEmpty, size())
        System.out.println("------STACK LIST------");
        Container stackList = new Stack();
        stackList.push(task1);
        stackList.push(task2);
        stackList.push(task3);
        stackList.push(task4);
        stackList.pop();
        stackList.print();
        System.out.println("Size: " + stackList.size());
        System.out.println("Is Empty? " + stackList.isEmpty());

        // TEST Queue( pop, push, isEmpty, size())
        System.out.println("\n\n------QUEUE LIST------");
        Container queueList = new Queue();
        queueList.push(task1);
        queueList.push(task2);
        queueList.push(task3);
        queueList.push(task4);
        queueList.pop();
        queueList.print();
        System.out.println("Size: " + stackList.size());
        System.out.println("Is Empty? " + stackList.isEmpty());
        
        
        //TEST transfer from queue to stack list
        stackList.transferFrom(queueList);
        System.out.println("\n\n------NEW QUEUE LIST------");
        queueList.print();
        System.out.println("\n\n------NEW STACK LIST------");
        stackList.print();
        
        
    }
}
