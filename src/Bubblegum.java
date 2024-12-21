public class Bubblegum extends Food implements Nutritious{
    public Bubblegum() {
        super("Bubblegum");
    }
    public void consume() {
        System.out.println(this + " пожёвано");
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public double calculateCalories() {
        return 15;
    }
}
