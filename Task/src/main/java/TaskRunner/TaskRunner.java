package TaskRunner;

import Task.*;

public interface TaskRunner {
void add(Task t);
void executeAll();
void afterExecution(Task t);
}
