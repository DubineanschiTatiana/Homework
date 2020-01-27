package Task;


public class RandomOutTask extends AbstractTask implements Task {

    int random;

    public RandomOutTask() {
    }

    @Override
    public void execute() {
        this.setExecutedAt();
        this.random = (int) (Math.random() * 10);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRandom: " + this.random;
    }
}
