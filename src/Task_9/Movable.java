package Task_9;

public interface Movable {
    default void move() {
        System.out.println("movement");
    }
}
