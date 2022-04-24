package homework3;
/**
 * Java Core 1. Home work #3
 *
 * @author Elena Rzhevskaya
 * version 14.04.2022
 */
import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruitList;

    public Box() {

        fruitList = new ArrayList<>();
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList() {
        this.fruitList = fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight() {
        return fruitList.size() * fruitList.get(0).getWeight();

    }



    public boolean isCompare(Box<?> other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.0001;
    }

    public void pourOver(Box<T> box) throws BoxCustomException {

        if (getFruitList().getClass() != getFruitList().getClass()) {
            throw new BoxCustomException("Внимание! Смешивать товары запрещено, используйте другой товар или коробку!");
        } else System.out.println("Если этот текст виден, то значит коробки не равны. Исключение не выбрасывается");
        for (int i = fruitList.size() - 1; i >= 0; i--) {
            box.getFruitList().addAll(fruitList);
            fruitList.clear();
        }

    }
    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                '}';
    }


    public static void main(String[] args) throws BoxCustomException {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        appleBox.addFruit(new Apple(1.0f));
        System.out.println("В 1ой коробке содержится: " + appleBox.fruitList.toString());
        System.out.println("Вес первой коробки с яблоками: " + appleBox.getWeight());


        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        System.out.println("Во 2ой коробке содержится: " + orangeBox.fruitList.toString());
        System.out.println("Вес второй коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println(" ");
        System.out.print("Сравнение первой и второй коробок: ");
        System.out.println(appleBox.isCompare(orangeBox));

        Box thirdBox = new Box();
        thirdBox.addFruit(new Apple(1.0f));
        thirdBox.addFruit(new Apple(1.0f));
        thirdBox.addFruit(new Apple(1.0f));
        System.out.println(" ");
        System.out.println("Во 3ьей коробке содержится: " + thirdBox.fruitList.toString());
        System.out.println("Вес третьей коробки с яблоками: " + thirdBox.getWeight());


        System.out.println(" ");
        System.out.print("Сравнение первой и третьей коробок: ");
        System.out.println(appleBox.isCompare(thirdBox));

        System.out.println(" ");
        appleBox.pourOver(thirdBox);
        System.out.println(thirdBox.getWeight());
        System.out.println("Вес третьей коробки после пересыпки из 1ой в 3ью: " + thirdBox.getWeight());
        System.out.println("Во 3ьей коробке содержится: " + thirdBox.fruitList.toString());

        System.out.println("Вес первой коробки после пересыпки из нее: " + appleBox.getFruitList());




    }
}