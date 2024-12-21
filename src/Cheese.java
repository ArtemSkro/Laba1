public class Cheese extends Food implements Nutritious {
    public Cheese() {
        super("Сыр");
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public double calculateCalories() {
        return 300;
    }
}
