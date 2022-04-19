package Task_9;

public interface Voiceable {
    default void voice() {
        System.out.println("voice");
    }
}
