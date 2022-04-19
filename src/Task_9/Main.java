package Task_9;

public class Main {
    public static void main(String[] arg) {
        int size = 7;
        Animal[] herd = new Animal[size];

        herd[0] = new Horse("Horse 1", 4, false);
        herd[1] = new Horse("Horse 2", 4, false);
        herd[2] = new Kangaroo("Kangaroo 1", 4, true);
        herd[3] = new Kangaroo("Kangaroo 2", 4, true);
        herd[4] = new Dragonfly("Dragonfly 1", 6, true);
        herd[5] = new Dragonfly("Dragonfly 2", 6, true);
        herd[6] = new Animal("Unknown type", 10, true) {
        };

        Horse horse = new Horse("Horse 3", 4, false);
        Kangaroo kangaroo = new Kangaroo("Kangaroo 3", 4, true);
        Dragonfly dragonfly = new Dragonfly("Dragonfly 3", 6, true);

        for (int i = 0; i < size; i++) {
            herd[i].voice();
        }
        horse.voice();
        kangaroo.voice();
        dragonfly.voice();
        System.out.println();

        for (int i = 0; i < size; i++) {
            herd[i].move();
        }
        horse.move();
        kangaroo.move();
        dragonfly.move();
        System.out.println();

        for (int i = 0; i < size; i++) {
            herd[i].isHungry();
        }
        horse.isHungry();
        kangaroo.isHungry();
        dragonfly.isHungry();
    }
}
