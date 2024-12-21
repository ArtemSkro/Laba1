public class Apple extends Food implements Nutritious {
    private String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple) arg0).size);
        } else
            return false;
    }

    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public double calculateCalories() {
        switch (size.toLowerCase()) {
            case "маленькое":
                return 70.0;
            case "среднее":
                return 100.0;
            case "большое":
                return 130.0;
            default:
                return 0;
        }
    }


}

