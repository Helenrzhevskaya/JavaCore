package homework1;

class Human extends Team {
    private int age;


    public Human(String name, int age, double maxRun, double maxJump) {
        super(name, maxRun, maxJump);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Human: " + getName() + " , возраст: " + age + ", макс.бег:" + maxRun + ", макс.прыжок " + maxJump;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }



    /** public double jump(Road road) {
        System.out.println("Я человек, я прыгаю!");
        if () {
            System.out.println();
        } else {
            System.out.println();
        }
    }
     **/
}
