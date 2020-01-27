package Task;

public class OutTask extends AbstractTask implements Task {

    String message;

    public OutTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        this.setExecutedAt();
    }

    @Override
    public String toString() {
        return super.toString()+"\nMessage: " + message ;
    }
}
