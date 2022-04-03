package homework1;

import java.awt.*;

import static homework1.Team.nameGeneralTeam;

public class Main {
    public static void main(String[] args) {
        nameGeneralTeam();
        Overcomable[] teams = {
                new Human("Паша", 26, 50, 2.5),
                new Robot("QWERTY1", 100, 0),
                new Cat("Рыжик", "медовый", 3, 15.6, 3.2)
        };
        System.out.printf("%n");
        for (Overcomable team : teams) {
            System.out.println(team);
            System.out.printf("%n");
            System.out.println(team.jump(2.0));
            System.out.println(team.jump(3.0));
            System.out.println(team.run(20));
            System.out.println(team.run(50));
            System.out.printf("%n");
        }
        System.out.println("Команда выполнила полосу препятствий ");

    }
}
