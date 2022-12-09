package JavaCore.lesson_1;

public class Team {
    String nameTeam;

    Competitor[] player = new Competitor[3];
    Human[] people = {new Human("Саша"), new Human("Коля"), new Human("Оля")};
    public Team(String nameTeam, Competitor player1, Competitor player2, Competitor player3) {
        this.nameTeam = nameTeam;

        player[0] = player1;
        player[1] = player2;
        player[2] = player3;
    }

    public void passedTheDistance() {           // Вывод информации кто прошел дистанцию
        for (Competitor com : player) {
            if (com.isOnDistance()) {           // Если участник onDistance == true, выводим его
                com.info();
            }
        }
    }
    public void showResults() {                  // Вывод информации о членах команды
        for (Competitor player : player) {
            player.info();
        }
    }
    public Competitor[] getTeammates() {
        return player;
    }
}
