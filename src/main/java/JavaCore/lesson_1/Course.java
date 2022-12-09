package JavaCore.lesson_1;

public class Course {
    Barrier[] course = new Barrier[3];
    public Course(Barrier barrier1, Barrier barrier2, Barrier barrier3) {   // Создаем полосу препятствий
        course[0] = barrier1;
        course[1] = barrier2;
        course[2] = barrier3;
    }

    public void doIt(Team t) {     // Метод, который просит всю команду пройти полосу препятствий
        System.out.println("\nTeam \"" + t.nameTeam + "\":\n");
        for (Competitor com : t.getTeammates()) {      // Для каждого участника команды
            for (Barrier b: course) {           // Для каждого препятствия вызываем метод его прохождения текущим участником команды
                b.doIt(com);
            }
        }
    }
}
