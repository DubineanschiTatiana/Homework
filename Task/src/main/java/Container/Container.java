package Container;

import Task.*;

public interface Container {

    void pop();

    void push(Task t);

    int size();

    boolean isEmpty();

    void transferFrom(Container c);

    void print();
}
