package Container;

import Task.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Queue implements Container {

    List <Task> list = new ArrayList();

    @Override
    public void pop() {
        list.remove(list.get(list.size() - 1));
    }

    @Override
    public void push(Task t) {
        list.add(0, t);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void transferFrom(Container c) {
        list.addAll(0,(Collection) c);
        ((Collection) c).clear();
    }

    @Override
    public void print() {
        for (Task task : list) {
            System.out.println(task);
        }
    }

}
