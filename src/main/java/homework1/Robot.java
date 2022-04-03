package homework1;

class Robot extends Team {

    public Robot(String name, double maxRun, double maxJump) {
        super(name, maxJump, maxRun);
    }

    @Override
    public String toString() {
        return "Robot " + getName() + " , макс.бег:  " + maxRun + " , макс.прыжок:  " + maxJump;
    }


}
