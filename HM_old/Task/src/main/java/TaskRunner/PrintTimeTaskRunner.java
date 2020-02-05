package TaskRunner;

import Container.*;
import Task.*;

public class PrintTimeTaskRunner implements TaskRunner {
Container container;
    @Override
    public void add(Task t) {
        container.push(t);
    }

    @Override
    public void executeAll() {
  
    }

    @Override
    public void afterExecution(Task t) {
   }
    
}
