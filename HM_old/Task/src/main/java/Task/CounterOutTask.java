package Task;

public class CounterOutTask extends AbstractTask implements Task {

    static int counter;

    public CounterOutTask() {

    }

    @Override
    public void execute() {
        counter++;
        this.setExecutedAt();
    }

    @Override
    public String toString() {
        return super.toString()+"\nCounter: "+this.counter;
    }

}
