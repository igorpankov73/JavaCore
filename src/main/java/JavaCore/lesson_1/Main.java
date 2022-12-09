package JavaCore.lesson_1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Pit(5), new Labyrinth(10), new Wall(2));          // Создаем полосу препятствий
        Team team = new Team("Непоколебимые", new Human1("Саша"), new Human2("Коля"), new Human3("Оля"));              // Создаем команду
        course.doIt(team);                         // Просим команду пройти полосу

        System.out.println("\nПобедитель :\n");
        team.passedTheDistance();

        System.out.println("\nРезультат: \n");      // Показываем результаты
        team.showResults();
    }
}
