package Container;

import Task.Task;
import java.util.ArrayList;
import java.util.List;

public class Stack implements Container {

    List<Task> list = new ArrayList();

    @Override
    public Task pop() {
        return list.remove(list.size()-1);
    }

    @Override
    public void push(Task t) {
        list.add(t);
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
    while (!c.isEmpty()){
        this.push(c.pop());
    }
    }

    @Override
    public void print() {
        for (Task task : list) {
            System.out.println(task);
        }
    }
}
