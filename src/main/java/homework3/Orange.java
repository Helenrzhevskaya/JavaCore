package homework3;

public class Orange extends Fruit {
    public Orange(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + getWeight() +
                '}';
    }
}
