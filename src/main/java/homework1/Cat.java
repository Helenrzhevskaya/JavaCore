package homework1;

class Cat extends Team implements Overcomable {
    private int age;
    String color;

    public Cat(String name, String color, int age, double maxRun, double maxJump) {
        super(name, maxRun, maxJump);
        this.setAge(age);
        this.color = color;

    }

    @Override
    public String toString() {
        return "Cat " + getName() + ", цвет: " + color + ", возраст: " + age + " , макс.бег:  " + maxRun + " , макс.прыжок:  " + maxJump;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }



}
