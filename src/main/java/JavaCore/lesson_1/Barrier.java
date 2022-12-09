package JavaCore.lesson_1;

public abstract class Barrier {
    public abstract void doIt(Competitor competitor);
}
class Wall extends Barrier {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
class Labyrinth extends Barrier {
    int length;

    public Labyrinth(int length) {
        this.length = length;
    }
    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
class Pit extends Barrier {
    int length;

    public Pit(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
class MainCross {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human1("Bob"), new Human2("Vaska"), new Human3("Sharik")};
        Barrier[] barriers = {new Pit(5), new Labyrinth(10), new Wall(2)};

        for (Competitor competitor : competitors) {
            for (Barrier barrier : barriers) {
                barrier.doIt(competitor);
                if (!competitor.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competitor competitor : competitors) {
            competitor.info();
        }
    }
}
