package homework3;

public class Apple extends Fruit {

    public Apple(float weight) {
        super(weight);
    }
    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + getWeight() +
                '}';
    }


}
