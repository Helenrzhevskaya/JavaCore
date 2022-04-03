package homework1;

public abstract class Team implements Overcomable {
    private String name;
    double maxRun;
    double maxJump;



    public Team(String name, double maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;

    }

    public String getName() {
        return name;
    }

    public String jump(double distance) {
        if (distance > maxJump) {
            return name + " не прыгнул " + distance;
        } else {
            return name + " прыгнул " + distance;
        }

    }

    public String run(double distance) {

        if (distance > maxRun) {
            return getName() + " не пробежал " + distance;
        } else {
            return getName() + " пробежал " + distance;
        }
    }

    static void nameGeneralTeam() {
        System.out.println("Комнада: Дружба");

    }

}