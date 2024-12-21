public class Coffee extends Food implements Nutritious {
    private String aroma ;

    public Coffee(String aroma) {
        super("Кофе");
        this.aroma = aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }

    public String toString() {
        return super.toString() + " аромата '" + aroma.toUpperCase() + "'";
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Coffee)) return false;
            return aroma.equals(((Coffee) arg0).aroma);
        } else
            return false;
    }

    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public double calculateCalories() {
        switch (aroma.toLowerCase()) {
            case "насыщенный":
                return 15.0;
            case "горький":
                return 20.0;
            case "восточный":
                return 10.0;
            default:
                return 5.0;
        }
    }
}
